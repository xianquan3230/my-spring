package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.core.io.DefaultResourceLoader;
import com.lcoil.springframework.core.io.ResourceLoader;

/**
 * @Classname AbstractBeanDefinitionReader
 * @Description TODO
 * @Date 2022/1/9 5:53 PM
 * @Created by l-coil
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry,new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry,ResourceLoader resourceLoader){
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
