package com.lcoil.springframework.context.event;

/**
 * @Classname ContextRefreshedEvent
 * @Description TODO
 * @Date 2022/1/16 12:31 AM
 * @Created by l-coil
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
