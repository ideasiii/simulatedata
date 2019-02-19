package org.iii.simulatedata.dic;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Dictionary {
	private static Map<String, Properties> dics = new HashMap<String, Properties>();
	private final static String dicDir = "dictionaries";

	public static void loadDics() throws Exception {
		File dics = new File(dicDir);
		if (dics.exists() && dics.isDirectory()) {
			String[] files = dics.list();
			for (String dic : files) {
				System.out.println("dic:" + dic);
				addDic(loadDic(dicDir + File.separator + dic));
			}
		}
	}

	public static Properties loadDic(String path) throws Exception {
		Properties p = new Properties();
		InputStream is = new FileInputStream(path);
		p.load(is);
		is.close();
		return p;
	}

	public static void addDic(String namespace, Properties dic) {
		Properties d = dics.get(namespace);
		if (d == null) {
			d = new Properties();
			dics.put(namespace, d);
		}
		d.putAll(dic);
	}

	public static void addDic(Properties dic) {
		addDic("default", dic);
	}

	public static void addDic(String namespace, String key, String value) {
		Properties d = dics.get(namespace);
		if (d == null) {
			d = new Properties();
			dics.put(namespace, d);
		}
		d.put(key, value);
	}

	public static void addDic(String key, String value) {
		addDic("default", key, value);
	}

	public static String getDicVal(String namespace, String key) {
		Properties d = dics.get(namespace);
		if (d == null) {
			return null;
		}
		return d.getProperty(key);
	}

	public static String getDicStr(String key) {
		return getDicVal("default", key);
	}

	public static String[] getDicArray(String key) {
		return getDicVal("default", key) == null ? null : getDicVal("default", key).split("\\|\\|\\|");
	}
}
