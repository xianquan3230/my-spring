package com.lcoil.springframework.context.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanPostProcessor;
import com.lcoil.springframework.context.ApplicationContextAware;
import com.lcoil.springframework.context.ApplicationContext;

/**
 * @Classname ApplicationContextAwareProcessor
 * @Description 包装处理器
 * @Date 2022/1/15 8:31 PM
 * @Created by l-coil
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContent(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
