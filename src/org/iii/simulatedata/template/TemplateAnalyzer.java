package org.iii.simulatedata.template;

import java.util.Map;

public class TemplateAnalyzer {

	private final String tplName;
	private final String template;
	private Map<String, String> tplVar = null;

	public TemplateAnalyzer(String tplName, String template) {
		this.tplName = tplName;
		this.template = template;
	}

	public String analyse() {
		Map<String, String> tplVar = getTplVar();
		//System.out.println(tplVar);
		try {
			tplVar = TemplateAnalyseUtils.execute(tplVar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String tplResult = TemplateAnalyseUtils.replace(template, tplVar);
		return tplResult;
	}

	public Map<String, String> getTplVar() {
		if (tplVar == null) {
			tplVar = TemplateAnalyseUtils.extractVar(template);
		}
		return tplVar;
	}

	public String getTplName() {
		return tplName;
	}
}
