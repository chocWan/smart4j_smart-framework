package org.smart4j.framework.helper;

import org.smart4j.framework.util.ClassUtil;

public final class HelperLoader {
    public static void init(){
        Class<?>[] classes = {ClassHelper.class,BeanHelper.class,IocHelper.class,ControllerHelper.class};
        for (Class<?> cls : classes){
            ClassUtil.loadClass(cls.getName());
        }
    }
}