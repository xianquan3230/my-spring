package com.lcoil.springframework.context;

import com.lcoil.springframework.beans.BeansException;

/**
 * @Classname ConfigurableApplicationContext
 * @Description TODO
 * @Date 2022/1/9 11:35 PM
 * @Created by l-coil
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
