package org.iii.simulatedata;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.iii.simulatedata.dic.Dictionary;
import org.iii.simulatedata.template.TemplateAnalyzer;
import org.apache.commons.io.FileUtils;
import org.json.*;

public class simulatedata
{
    public static void main(String[] args) throws Exception
    {
        Dictionary.loadDics();
        File templates = new File("templates");
        if (templates.isDirectory())
        {
            File[] tplFiles = templates.listFiles();
            assert tplFiles != null;
            for (File tplFile : tplFiles)
            {
                if (tplFile.isFile())
                {
                    String tpl = FileUtils.readFileToString(tplFile, "UTF8");
                    String tplName = tplFile.getName();
                    System.out.println("Template Name: " + tplName + ", ===================");
                    TemplateAnalyzer testTplAnalyzer = new TemplateAnalyzer(tpl);
                    String abc = testTplAnalyzer.analyse();
                    System.out.println(abc);
                    System.out.println("Template Name: " + tplName + ", ==================");
                    System.out.println();
                    
                    JSONObject jsonObject = new JSONObject(abc);
                    Iterator<String> sIterator = jsonObject.keys();
                    StringBuilder strFields = null;
                    ArrayList<String> listField = new ArrayList<>();
                    String key;
                    while (sIterator.hasNext())
                    {
                        // Get key
                        key = sIterator.next();
                        listField.add(key);
                        // get value by key, value is JSONObject or JSONArray
                        //String value = jsonObject.getString(key);
                        //System.out.println(key + " : " + value);
                        if (null == strFields)
                        {
                            strFields = new StringBuilder(key);
                        }
                        else
                        {
                            strFields.append(",").append(key);
                        }
                    }
                    System.out.println(strFields);
                    String value;
                    StringBuilder strValues = new StringBuilder();
                    for (int i = 0; i < listField.size(); ++i)
                    {
                        value = jsonObject.getString(listField.get(i));
                        if (0 == i)
                        {
                            strValues = new StringBuilder(value);
                        }
                        else
                        {
                            strValues.append(",").append(value);
                        }
                    }
                    System.out.println(strValues);
                    int nCount = 0;
                    do
                    {
                        
                        TemplateAnalyzer testTplAnalyzer2 = new TemplateAnalyzer(tpl);
                        abc = testTplAnalyzer2.analyse();
                        
                        jsonObject = new JSONObject(abc);
                        for (int i = 0; i < listField.size(); ++i)
                        {
                            value = jsonObject.getString(listField.get(i));
                            if (0 == i)
                            {
                                strValues = new StringBuilder(value);
                            }
                            else
                            {
                                strValues.append(",").append(value);
                            }
                        }
                        
                        System.out.println(strValues);
                        ++nCount;
                    } while (10 >= nCount);
                    System.out.println("Finish");
                }
            }
        }
    }
    
}
