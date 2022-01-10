package com.lcoil.springframework.context.support;

import com.lcoil.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.lcoil.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Classname AbstractXmlApplicationContext
 * @Description TODO
 * @Date 2022/1/10 12:28 AM
 * @Created by l-coil
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
