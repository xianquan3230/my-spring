package com.lcoil.springframework.beans.factory;

import com.lcoil.springframework.beans.BeansException;


/**
 * @Classname BeanFactory
 * @Description  bean 工厂
 * @Date 2022/1/8 10:14 AM
 * @Created by l-coil
 */

public interface BeanFactory {

   Object getBean(String name) throws BeansException;

    Object getBean(String name,Object ...args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
