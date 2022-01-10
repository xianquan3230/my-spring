package com.lcoil.springframework.context.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lcoil.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @Classname AbstractRefreshableApplicationContext
 * @Description 获取 Bean 工厂和加载资源
 * @Date 2022/1/10 12:20 AM
 * @Created by l-coil
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext{

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory()throws BeansException{
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    private DefaultListableBeanFactory createBeanFactory(){
        return new DefaultListableBeanFactory();
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory(){
        return beanFactory;
    }

}
