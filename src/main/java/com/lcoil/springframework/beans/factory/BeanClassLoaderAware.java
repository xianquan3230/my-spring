package com.lcoil.springframework.beans.factory;

/**
 * @Classname BeanClassLoaderAware
 * @Description TODO
 * @Date 2022/1/15 8:25 PM
 * @Created by l-coil
 */
public interface BeanClassLoaderAware extends Aware{

    void setBeanClassLoader(ClassLoader classLoader);
}
