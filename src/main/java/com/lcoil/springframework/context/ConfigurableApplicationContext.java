package com.lcoil.springframework.context;

import com.lcoil.springframework.beans.BeansException;

/**
 * @Classname ConfigurableApplicationContext
 * @Description 虚拟机关闭钩子注册调用销毁方法
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
