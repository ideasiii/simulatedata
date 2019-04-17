package org.iii.simulatedata.utils;

import java.lang.reflect.Method;


public class FunctionUtils
{
    private static Class<?> buildInClazz;
    
    static
    {
        try
        {
            buildInClazz = Class.forName(BuildInFuncs.class.getName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public static Object executeMethod(String mName, Class<?>[] parameterTypes, Object[] parameter)
            throws Exception
    {
        Method method = buildInClazz.getMethod(mName, parameterTypes);
        return method.invoke(null, parameter);
    }
    
}
