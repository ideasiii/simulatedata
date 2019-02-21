package org.iii.simulatedata;

import java.io.File;

import org.iii.simulatedata.dic.Dictionary;
import org.iii.simulatedata.template.TemplateAnalyzer;
import org.apache.commons.io.FileUtils;

public class simulatedata {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Dictionary.loadDics();
		File templates = new File("templates");
		if (templates.isDirectory()) {
			File[] tplFiles = templates.listFiles();
			for (File tplFile : tplFiles) {
				if (tplFile.isFile()) {
					String tpl = FileUtils.readFileToString(tplFile);
					String tplName = tplFile.getName();
					System.out.println("Template Name: " + tplName + ", ===================");
					TemplateAnalyzer testTplAnalyzer = new TemplateAnalyzer(tplName, tpl);
					String abc = testTplAnalyzer.analyse();
					System.out.println(abc);
					System.out.println("Template Name: " + tplName + ", ==================");
					System.out.println();
				}
			}
		}
	}

}
