package com.lcoil.springframework.context;

import com.lcoil.springframework.beans.factory.HierarchicalBeanFactory;
import com.lcoil.springframework.beans.factory.ListableBeanFactory;
import com.lcoil.springframework.core.io.ResourceLoader;

/**
 * @Classname ApplicationContext
 * @Description 上下问接口
 * @Date 2022/1/9 11:33 PM
 * @Created by l-coil
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher{
}
