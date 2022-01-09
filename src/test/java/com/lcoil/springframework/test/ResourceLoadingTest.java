package com.lcoil.springframework.test;

import cn.hutool.core.io.IoUtil;
import com.lcoil.springframework.core.io.DefaultResourceLoader;
import com.lcoil.springframework.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname ResourceLoadingTest
 * @Description TODO
 * @Date 2022/1/9 7:30 PM
 * @Created by l-coil
 */
public class ResourceLoadingTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file()throws IOException{
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
