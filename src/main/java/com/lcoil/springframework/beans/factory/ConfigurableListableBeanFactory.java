package com.lcoil.springframework.beans.factory;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;
import com.lcoil.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Classname ConfigurableListableBeanFactory
 * @Description TODO
 * @Date 2022/1/9 7:02 PM
 * @Created by l-coil
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
