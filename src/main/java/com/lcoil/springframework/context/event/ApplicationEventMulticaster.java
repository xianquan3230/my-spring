package com.lcoil.springframework.context.event;


import com.lcoil.springframework.context.ApplicationEvent;
import com.lcoil.springframework.context.ApplicationListener;

/**
 * @Classname ApplicationEventMulticaster
 * @Description TODO
 * @Date 2022/1/16 12:32 AM
 * @Created by l-coil
 */
public interface ApplicationEventMulticaster {
    /**
     * 添加一个侦听器以接收所有事件的通知
     *
     * @param listener 要添加的侦听器
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * 从通知列表中删除一个监听器
     *
     * @param listener 要删除的侦听器
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * 多播 eth 将应用程序事件提供给适当的侦听器
     *
     * @param event 要多播的事件
     */
    void multicastEvent(ApplicationEvent event);
}
