package org.smart4j.framework.bean;

import java.lang.reflect.Method;

public class Handler {
    private Class<?> controllerBase;
    private Method actionMethod;

    public Handler(Class<?> controllerBase, Method actionMethod) {
        this.controllerBase = controllerBase;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerBase() {
        return controllerBase;
    }

    public void setControllerBase(Class<?> controllerBase) {
        this.controllerBase = controllerBase;
    }

    public Method getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(Method actionMethod) {
        this.actionMethod = actionMethod;
    }
}