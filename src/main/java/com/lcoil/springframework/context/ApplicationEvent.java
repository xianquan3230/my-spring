package com.lcoil.springframework.context;

import java.util.EventObject;

/**
 * @Classname ApplicationEvent
 * @Description 定义实现事件
 * @Date 2022/1/16 12:27 AM
 * @Created by l-coil
 */
public abstract class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
