package com.ten.summer.beans;

/**
 * 用于bean的属性注入
 *
 * @author wshten
 * @date 2018/11/10
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
