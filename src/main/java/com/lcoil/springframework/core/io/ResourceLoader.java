package com.lcoil.springframework.core.io;

/**
 * @Classname ResourceLoader
 * @Description 资源加载器
 * @Date 2022/1/9 5:39 PM
 * @Created by l-coil
 */
public interface ResourceLoader {

    /**
     * 从路径加载的 伪 URL 前缀: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
