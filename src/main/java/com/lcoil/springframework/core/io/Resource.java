package com.lcoil.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname Resource
 * @Description 资源加载接口定义
 * @Date 2022/1/9 5:20 PM
 * @Created by l-coil
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
