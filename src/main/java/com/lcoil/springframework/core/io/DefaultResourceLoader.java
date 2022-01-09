package com.lcoil.springframework.core.io;

import cn.hutool.core.lang.Assert;

import java.net.FileNameMap;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Classname DefaultResourceLoader
 * @Description 定义获取资源接口，里面传递 location 地址即可。
 * @Date 2022/1/9 5:42 PM
 * @Created by l-coil
 */
public class DefaultResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        Assert.notNull(location, "Location must not be null");
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {
            try {
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e){
                return new FileSystemResource(location);
            }
        }
    }

}
