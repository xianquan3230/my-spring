package com.lcoil.springframework.context.event;

import com.lcoil.springframework.context.ApplicationContext;
import com.lcoil.springframework.context.ApplicationEvent;

/**
 * @Classname ApplicationContextEvent
 * @Description TODO
 * @Date 2022/1/16 12:29 AM
 * @Created by l-coil
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }
}
