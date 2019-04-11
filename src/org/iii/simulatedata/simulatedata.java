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
            for (File tplFile : tplFiles)
            {
                if (tplFile.isFile())
                {
                    String tpl = FileUtils.readFileToString(tplFile);
                    String tplName = tplFile.getName();
                    System.out.println("Template Name: " + tplName + ", ===================");
                    TemplateAnalyzer testTplAnalyzer = new TemplateAnalyzer(tplName, tpl);
                    String abc = testTplAnalyzer.analyse();
                    System.out.println(abc);
                    System.out.println("Template Name: " + tplName + ", ==================");
                    System.out.println();
                    
                    JSONObject jsonObject = new JSONObject(abc);
                    Iterator<String> sIterator = jsonObject.keys();
                    String strFields = null;
                    ArrayList<String> listField = new ArrayList<String>();
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
                            strFields = key;
                        }
                        else
                        {
                            strFields += ("," + key);
                        }
                    }
                    System.out.println(strFields);
                    String value = null;
                    String strValues = "";
                    for (int i = 0; i < listField.size(); ++i)
                    {
                        value = jsonObject.getString(listField.get(i));
                        if (0 == i)
                        {
                            strValues = value;
                        }
                        else
                        {
                            strValues += ("," + value);
                        }
                    }
                    System.out.println(strValues);
                    int nCount = 0;
                    while (true)
                    {
                        
                        TemplateAnalyzer testTplAnalyzer2 = new TemplateAnalyzer(tplName, tpl);
                        abc = testTplAnalyzer2.analyse();
                        testTplAnalyzer2 = null;
                       
                        jsonObject = new JSONObject(abc);
                        for (int i = 0; i < listField.size(); ++i)
                        {
                            value = jsonObject.getString(listField.get(i));
                            if (0 == i)
                            {
                                strValues = value;
                            }
                            else
                            {
                                strValues += ("," + value);
                            }
                        }
                        
                        System.out.println(strValues);
                        ++nCount;
                        if (1000 < nCount)
                        {
                            break;
                        }
                    }
                    System.out.println("Finish");
                }
            }
        }
    }
    
}
