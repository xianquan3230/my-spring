package com.lcoil.springframework.test.event;

import com.lcoil.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Classname CustomEventListener
 * @Description TODO
 * @Date 2022/1/16 1:28 AM
 * @Created by l-coil
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息；时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
