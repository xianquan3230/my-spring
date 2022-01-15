package com.lcoil.springframework.beans.factory;

import com.lcoil.springframework.beans.BeansException;

/**
 * @Classname BeanFactoryAware
 * @Description 容器感知类
 * @Date 2022/1/15 8:24 PM
 * @Created by l-coil
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
