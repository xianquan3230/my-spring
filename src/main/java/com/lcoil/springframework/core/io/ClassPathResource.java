package com.lcoil.springframework.core.io;

import cn.hutool.core.lang.Assert;
import com.lcoil.springframework.util.ClassUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname ClassPathResource
 * @Description TODO
 * @Date 2022/1/9 5:21 PM
 * @Created by l-coil
 */
public class ClassPathResource implements Resource{

    private final String path;

    private  ClassLoader classLoader;

    public ClassPathResource(String path){
        this(path,(ClassLoader) null);
    }

    public ClassPathResource(String path,ClassLoader classLoader){
        Assert.notNull(path,"Path must not be null");
        this.path = path;
        this.classLoader =(classLoader != null ? classLoader : ClassUtils.getDefaultClassLoader());
    }
    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = classLoader.getResourceAsStream(path);
        if(is == null){
            throw new FileNotFoundException(this.path + "cannot be opened because it does not exist");
        }
        return is;
    }
}
