package com.lcoil.springframework.beans.factory.config;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Classname BeanFactoryPostProcessor
 * @Description TODO
 * @Date 2022/1/9 11:20 PM
 * @Created by l-coil
 */
public interface BeanFactoryPostProcessor {

    /**
     *  在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
