package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname SimpleInstantiationStrategy
 * @Description JDK 实例化
 * @Date 2022/1/8 11:36 AM
 * @Created by l-coil
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if(null != ctor){
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else{
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]",e);
        }
    }
}
