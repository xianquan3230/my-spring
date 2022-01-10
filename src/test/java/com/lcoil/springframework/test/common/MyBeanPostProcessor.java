package com.lcoil.springframework.test.common;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanPostProcessor;
import com.lcoil.springframework.test.beans.UserService;

/**
 * @Classname MyBeanPostProcessor
 * @Description TODO
 * @Date 2022/1/10 9:19 PM
 * @Created by l-coil
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("userService".equals(beanName)){
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
