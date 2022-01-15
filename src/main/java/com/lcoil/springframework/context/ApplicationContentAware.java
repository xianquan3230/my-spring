package com.lcoil.springframework.context;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.Aware;

/**
 * @Classname ApplicationCOntentAware
 * @Description TODO
 * @Date 2022/1/15 8:29 PM
 * @Created by l-coil
 */
public interface ApplicationContentAware extends Aware {

    void setApplicationContent(ApplicationContext applicationContent) throws BeansException;
}
