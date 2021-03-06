package org.iii.simulatedata.template;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import org.iii.simulatedata.dic.Dictionary;
import org.iii.simulatedata.utils.*;

class TemplateAnalyseUtils
{
    
    private static final String PRE_FUNC = "$Func{";
    
    private static final String PRE_DIC = "$Dic{";
    
    private static final String PRE_VAR = "$Var{";
    
    private static final Random r = new Random();
    
    private static void analyse(String template, int startIndex, int type, int itemIndex,
            Map<String, String> tplVar)
    {
        boolean hasFunc = template.contains(PRE_FUNC);
        boolean hasDic = template.contains(PRE_DIC);
        boolean hasVar = template.contains(PRE_VAR);
        // = ASCII
        char eq = 61;
        // } ASCII
        char closeBrace = 125;
        if (hasFunc && type == 1)
        {
            int funcIndex = template.indexOf(PRE_FUNC);
            int funcEndIndex = template.indexOf("}", funcIndex);
            String func = template.substring(funcIndex, funcEndIndex + 1);
            String funcKey = "F" + formatNumber("" + itemIndex) + "-" + func;
            tplVar.put(funcKey, func);
            
            if (hasVar)
            {
                if (template.charAt(funcIndex - 1) == eq && template.charAt(funcIndex - 2) == closeBrace)
                {
                    int varIndex = template.substring(0, funcIndex).lastIndexOf(PRE_VAR);
                    if (varIndex < funcIndex)
                    {
                        String varName = template.substring(varIndex, funcIndex - 1);
                        String varKey = "V" + formatNumber("" + itemIndex) + "-" + varName;
                        tplVar.put(varKey, funcKey);
                    }
                }
            }
            
            analyse(template.substring(funcEndIndex + 1), startIndex + funcEndIndex + 1, 1,
                    ++itemIndex, tplVar);
        }
        
        if (hasDic && type == 2)
        {
            int dicIndex = template.indexOf(PRE_DIC);
            int dicEndIndex = template.indexOf("}", dicIndex);
            String dic = template.substring(dicIndex, dicEndIndex + 1);
            String dicKey = "D" + formatNumber("" + itemIndex) + "-" + dic;
            tplVar.put(dicKey, dic);
            
            if (hasVar)
            {
                if (template.charAt(dicIndex - 1) == eq && template.charAt(dicIndex - 2) == closeBrace)
                {
                    int varIndex = template.substring(0, dicIndex).lastIndexOf(PRE_VAR);
                    if (varIndex < dicIndex)
                    {
                        String varName = template.substring(varIndex, dicIndex - 1);
                        String varKey = "V" + formatNumber("" + itemIndex) + "-" + varName;
                        
                        tplVar.put(varKey, dicKey);
                    }
                }
            }
            
            analyse(template.substring(dicEndIndex + 1), startIndex + dicEndIndex + 1, 2,
                    ++itemIndex, tplVar);
        }
        
    }
    
    static Map<String, String> extractVar(String template)
    {
        Map<String, String> tplVar = new TreeMap<>();
        int itmeIndex = 0;
        boolean hasFunc = template.contains(PRE_FUNC);
        boolean hasDic = template.contains(PRE_DIC);
        if (hasFunc)
        {
            analyse(template, 0, 1, itmeIndex, tplVar);
        }
        if (hasDic)
        {
            analyse(template, 0, 2, itmeIndex, tplVar);
        }
        return tplVar;
    }
    
    private static String executeFunc(String func) throws Exception
    {
        if (func == null)
        {
            return null;
        }
        
        String result = null;
        
        if (func.startsWith(PRE_FUNC))
        {
            String funcName = func.substring(PRE_FUNC.length(), func.length() - 1);
            
            String mName = null;
            String pars = null;
            if (funcName.trim().length() > 0)
            {
                mName = funcName.substring(0, funcName.indexOf("("));
                pars = funcName.substring(funcName.indexOf("(") + 1, funcName.length() - 1);
            }
            
            if (mName == null || mName.trim().length() == 0)
            {
                return null;
            }
            
            Class<?>[] parameterTypes = null;
            Object[] parameter = null;
            if (pars.trim().length() > 0)
            {
                String[] parArray = pars.split(",");
                parameterTypes = new Class<?>[parArray.length];
                parameter = new Object[parArray.length];
                for (int i = 0; i < parArray.length; i++)
                {
                    String parItem = parArray[i].trim();
                    if (parItem.startsWith("\""))
                    {
                        parameterTypes[i] = String.class;
                        parameter[i] = parItem.substring(1, parItem.length() - 2);
                    }
                    else
                    {
                        boolean isInt = NumberUtils.isInteger(parItem);
                        if (isInt)
                        {
                            parameterTypes[i] = Integer.class;
                            parameter[i] = Integer.parseInt(parItem);
                        }
                    }
                }
            }
            
            result = "" + FunctionUtils.executeMethod(mName, parameterTypes, parameter);
        }
        
        return result;
    }
    
    private static String searchDic(String dic) throws Exception
    {
        if (dic == null)
        {
            return null;
        }
        
        String result = null;
        if (dic.startsWith(PRE_DIC))
        {
            String dicItem = dic.substring(PRE_DIC.length(), dic.length() - 1);
            String[] items = Dictionary.getDicArray(dicItem);
            if (items != null)
            {
                result = items[r.nextInt(items.length)];
                
            }
            if (result != null && result.trim().startsWith(PRE_FUNC))
            {
                result = executeFunc(result);
            }
        }
        
        return result;
    }
    
    static Map<String, String> execute(Map<String, String> funcAndDic) throws Exception
    {
        if (funcAndDic == null)
        {
            return null;
        }
        Map<String, String> tmpMap = new TreeMap<>();
        
        for (Entry<String, String> entry : funcAndDic.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            
            String[] items = key.split("-");
            if (items[1].startsWith(PRE_FUNC))
            {
                String funcRes = executeFunc(items[1]);
                if (funcRes != null)
                {
                    // entry.setValue(funcRes);
                    tmpMap.put(key, funcRes);
                }
            }
            
            if (items[1].startsWith(PRE_DIC))
            {
                String dicRes = searchDic(items[1]);
                if (dicRes != null)
                {
                    // entry.setValue(dicRes);
                    tmpMap.put(key, dicRes);
                }
            }
            
            if (items[1].startsWith(PRE_VAR))
            {
                String varRes = tmpMap.get(value);
                if (varRes != null)
                {
                    // entry.setValue(varRes);
                    tmpMap.put(key, varRes);
                }
            }
        }
        return tmpMap;
    }
    
    static String replace(String template, Map<String, String> funcAndDic)
    {
        if (funcAndDic == null)
        {
            return template;
        }
        for (Entry<String, String> entry : funcAndDic.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();
            String[] items = key.split("-");
            
            String replaceStr = items[1].replaceAll("\\$", "\\\\\\$").replaceAll("\\{",
                    "\\\\\\{").replaceAll("}", "\\\\\\}").replaceAll("\\(", "\\\\\\(").replaceAll("\\)", "\\\\\\)");
            value = value.replaceAll("\\$", "\\\\\\$").replaceAll("\\{", "\\\\\\{").replaceAll(
                    "}", "\\\\\\}").replaceAll("\\(", "\\\\\\(").replaceAll("\\)", "\\\\\\)");
            
            if (items[1].startsWith(PRE_VAR))
            {
                
                template = template.replaceAll(replaceStr + "=", "");
                template = template.replaceAll(replaceStr, value);
            }
            else
            {
                template = template.replaceFirst(replaceStr, value);
            }
            
        }
        funcAndDic.clear();
        
        return template;
    }
    
    private static String formatNumber(String num)
    {
        if (num != null)
        {
            StringBuilder numBuilder = new StringBuilder(num);
            while (numBuilder.length() < 3)
            {
                numBuilder.insert(0, "0");
            }
            num = numBuilder.toString();
        }
        return num;
    }
}
