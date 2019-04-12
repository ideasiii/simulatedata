package org.iii.simulatedata.template;

import java.util.Map;

public class TemplateAnalyzer
{
    
    private final String template;
    private Map<String, String> tplVar = null;
    
    public TemplateAnalyzer(String template)
    {
        this.template = template;
    }
    
    public String analyse()
    {
        Map<String, String> tplVar = getTplVar();
        
        try
        {
            tplVar = TemplateAnalyseUtils.execute(tplVar);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return TemplateAnalyseUtils.replace(template, tplVar);
    }
    
    private Map<String, String> getTplVar()
    {
        if (tplVar == null)
        {
            tplVar = TemplateAnalyseUtils.extractVar(template);
        }
        return tplVar;
    }
    
}
