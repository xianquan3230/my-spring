package com.lcoil.springframework.beans.factory;

/**
 * @Classname DisposableBean
 * @Description TODO
 * @Date 2022/1/10 12:03 AM
 * @Created by l-coil
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
