package com.lcoil.springframework.beans.factory;

/**
 * @Classname FactoryBean
 * @Description TODO
 * @Date 2022/1/15 10:40 PM
 * @Created by l-coil
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
