package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.beans.factory.BeanFactory;
import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;

/**
 * @Classname AbstractBeanFactory
 * @Description 抽象bean工厂
 * @Date 2022/1/8 10:37 AM
 * @Created by l-coil
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
