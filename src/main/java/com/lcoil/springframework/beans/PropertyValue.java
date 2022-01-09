package com.lcoil.springframework.beans;

/**
 * @Classname Abstract
 * @Description bean 属性填充
 * @Date 2022/1/8 10:49 AM
 * @Created by l-coil
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