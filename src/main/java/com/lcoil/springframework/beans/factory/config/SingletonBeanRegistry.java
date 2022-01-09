package com.lcoil.springframework.beans.factory.config;


/**
 * @Classname SingletonBeanRegistry
 * @Description 单例注册接口定义和实现
 * @Date 2022/1/8 10:26 AM
 * @Created by l-coil
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
