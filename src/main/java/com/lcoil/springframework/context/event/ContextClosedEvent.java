package com.lcoil.springframework.context.event;

/**
 * @Classname ContextCloseEvent
 * @Description TODO
 * @Date 2022/1/16 12:31 AM
 * @Created by l-coil
 */
public class ContextClosedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
