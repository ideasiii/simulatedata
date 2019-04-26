package org.iii.simulatedata;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import org.iii.simulatedata.dic.Dictionary;
import org.iii.simulatedata.template.TemplateAnalyzer;
import org.apache.commons.io.FileUtils;
import org.iii.simulatedata.utils.BuildInFuncs;
import org.json.*;

public class simulatedata
{
    public static void main(String[] args) throws Exception
    {
        int nTotalNum = 10;
        if (0 < args.length)
        {
            nTotalNum = Integer.valueOf(args[0]);
            System.out.println(String.format("Simulate will generic %d", nTotalNum));
        }
        
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
                    
                    PrintWriter pw =
                            new PrintWriter(new FileWriter("out/" + tplName + "_" + BuildInFuncs.strTimeInFormat() + ".csv"));
                    
                    JSONObject jsonObject = new JSONObject(abc);
                    Iterator<String> sIterator = jsonObject.keys();
                    StringBuilder strFields = null;
                    ArrayList<String> listField = new ArrayList<>();
                    String key;
                    while (sIterator.hasNext())
                    {
                        key = sIterator.next();
                        listField.add(key);
                        
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
                    assert strFields != null;
                    pw.write(strFields.toString() + "\n");
                    String value;
                    StringBuilder strValues = new StringBuilder();
                    
                    int nCount = 0;
                    testTplAnalyzer = new TemplateAnalyzer(tpl);
                    do
                    {
                        abc = testTplAnalyzer.analyse();
                        
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
                        jsonObject = null;
                        
                        System.out.println(strValues);
                        pw.write(strValues.toString() + "\n");
                        pw.flush();
                        System.gc();
                        ++nCount;
                    } while (nTotalNum > nCount);
                    System.out.println("Finish");
                    pw.close();
                }
            }
        }
    }
    
}
