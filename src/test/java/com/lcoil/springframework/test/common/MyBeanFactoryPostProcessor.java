package com.lcoil.springframework.test.common;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.PropertyValue;
import com.lcoil.springframework.beans.PropertyValues;
import com.lcoil.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;
import com.lcoil.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @Classname MyBeanFactoryPostProcessor
 * @Description TODO
 * @Date 2022/1/10 9:14 PM
 * @Created by l-coil
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company","改为：字节跳动"));
    }
}
