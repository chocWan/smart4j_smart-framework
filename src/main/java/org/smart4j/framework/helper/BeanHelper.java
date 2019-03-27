package org.smart4j.framework.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class BeanHelper {

    private static final Map<Class<?>,Object>  BEAN_MAP = new HashMap<Class<?>,Object>();

    static {
        Set<Class<?>> beanClassSet = ClassHelper.getBeanClassSet();
        for(Class<?> cls : beanClassSet){
            BEAN_MAP.put(cls,ReflectionUtil.newInstance(cls));
        }
    }

    public static Map<Class<?>,Object> getBeanMap(){
        return BEAN_MAP;
    }

    public static <T> T getBean(Class<T> cls)
    {
        if(!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("do not have the key : " + cls);
        }
        return (T) BEAN_MAP.get(cls);
    }

}