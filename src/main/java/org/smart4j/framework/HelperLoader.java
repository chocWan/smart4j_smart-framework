package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

public final class HelperLoader {
    public static void init(){
        Class<?>[] classes = {ClassHelper.class,BeanHelper.class,IocHelper.class,ControllerHelper.class};
        for (Class<?> cls : classes){
            ClassUtil.loadClass(cls.getName());
        }
    }
}