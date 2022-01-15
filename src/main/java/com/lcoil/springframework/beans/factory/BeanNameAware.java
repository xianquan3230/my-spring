package com.lcoil.springframework.beans.factory;

/**
 * @Classname BeanNameAware
 * @Description TODO
 * @Date 2022/1/15 8:26 PM
 * @Created by l-coil
 */
public interface BeanNameAware extends Aware{

    void setBeanName(String name);

}
