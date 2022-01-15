package com.lcoil.springframework.context;

/**
 * @Classname ApplicationEventPublisher
 * @Description 事件发布者的定义和实现
 * @Date 2022/1/16 1:02 AM
 * @Created by l-coil
 */
public interface ApplicationEventPublisher {

    /**
     * 通知所有使用此应用程序注册的侦听器一个应用程序事件。
     * 事件可能是框架事件（例如 RequestHandledEvent）或特定于应用程序的事件。
     *
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
