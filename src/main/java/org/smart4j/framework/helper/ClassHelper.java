package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

public final class ClassHelper {

    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    private Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    public static Set<Class<?>> getSerivceClassSet(){
        Set<Class<?>> services = new HashSet<Class<?>>();
        for(Class<?> cls : CLASS_SET) {
            if(cls.isAnnotationPresent(Service.class)){
                services.add(cls);
            }
        }
        return services;
    }

    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> services = new HashSet<Class<?>>();
        for(Class<?> cls : CLASS_SET) {
            if(cls.isAnnotationPresent(Service.class)){
                services.add(cls);
            }
        }
        return services;
    }

    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getControllerClassSet());
        beanClassSet.addAll(getSerivceClassSet());
        return  beanClassSet;
    }

}