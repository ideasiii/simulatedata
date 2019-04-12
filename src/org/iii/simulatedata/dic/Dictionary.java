package org.iii.simulatedata.dic;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Dictionary
{
    private static Map<String, Properties> dics = new HashMap<>();
    private final static String dicDir = "dictionaries";
    
    public static void loadDics() throws Exception
    {
        File dics = new File(dicDir);
        if (dics.exists() && dics.isDirectory())
        {
            String[] files = dics.list();
            assert files != null;
            for (String dic : files)
            {
                System.out.println("dic:" + dic);
                addDic(loadDic(dicDir + File.separator + dic));
            }
        }
    }
    
    private static Properties loadDic(String path) throws Exception
    {
        Properties p = new Properties();
        InputStreamReader is = new InputStreamReader(new FileInputStream(path),
                StandardCharsets.UTF_8);
        p.load(is);
        is.close();
        return p;
    }
    
    private static void addDic(Properties dic)
    {
        Properties d = dics.get("default");
        if (d == null)
        {
            d = new Properties();
            dics.put("default", d);
        }
        d.putAll(dic);
    }
    
    private static String getDicStr(String key)
    {
        Properties d = dics.get("default");
        if (d == null)
        {
            return null;
        }
        return d.getProperty(key);
        
    }
    
    public static String[] getDicArray(String key)
    {
        return getDicStr(key) == null ? null : Objects.requireNonNull(getDicStr(key)).split(
                "\\|\\|\\|");
    }
}
