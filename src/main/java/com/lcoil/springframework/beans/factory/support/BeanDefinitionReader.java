package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.core.io.Resource;
import com.lcoil.springframework.core.io.ResourceLoader;

/**
 * @Classname BeanDefinitionReader
 * @Description Bean 定义读接口
 * @Date 2022/1/9 5:49 PM
 * @Created by l-coil
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
