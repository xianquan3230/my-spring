package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Classname InstantiationStrategy
 * @Description 实例化策略接口
 * @Date 2022/1/8 11:30 AM
 * @Created by l-coil
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;
}
