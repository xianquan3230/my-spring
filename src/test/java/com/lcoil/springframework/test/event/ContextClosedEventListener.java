package com.lcoil.springframework.test.event;


import com.lcoil.springframework.context.ApplicationListener;
import com.lcoil.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
