package com.lcoil.springframework.beans.factory.config;

import com.lcoil.springframework.beans.BeansException;

/**
 * @Classname BeanPostProcessor
 * @Description TODO
 * @Date 2022/1/9 11:23 PM
 * @Created by l-coil
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException;

    /**
     * 在 Bean 对象执行初始化方法之后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException;
}
