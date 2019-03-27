package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;

import java.util.Map;

public class Param {
    private Map<String,Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public Map<String,Object> getFieldMap(){
        return paramMap;
    }


    /**
     * 根据参数名获取 String 型参数值
     */
    public String getString(String name) {
        return CastUtil.castString(getFieldMap().get(name));
    }

    /**
     * 根据参数名获取 double 型参数值
     */
    public double getDouble(String name) {
        return CastUtil.castDouble(getFieldMap().get(name));
    }

    /**
     * 根据参数名获取 long 型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(getFieldMap().get(name));
    }

    /**
     * 根据参数名获取 int 型参数值
     */
    public int getInt(String name) {
        return CastUtil.castInt(getFieldMap().get(name));
    }

    /**
     * 根据参数名获取 boolean 型参数值
     */
    public boolean getBoolean(String name) {
        return CastUtil.castBoolean(getFieldMap().get(name));
    }

}