package com.lcoil.springframework.test.event;

import com.lcoil.springframework.context.event.ApplicationContextEvent;

/**
 * @Classname 事件监听器
 * @Description TODO
 * @Date 2022/1/16 1:26 AM
 * @Created by l-coil
 */
public class CustomEvent extends ApplicationContextEvent {
    private Long id;
    private String message;
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
