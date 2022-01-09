package com.lcoil.springframework.beans.factory.config;

/**
 * @Classname BeanReference
 * @Description bean 引用
 * @Date 2022/1/8 12:56 PM
 * @Created by l-coil
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
