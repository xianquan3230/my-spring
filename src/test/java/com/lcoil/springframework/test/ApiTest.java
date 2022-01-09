package com.lcoil.springframework.test;

import com.lcoil.springframework.beans.PropertyValue;
import com.lcoil.springframework.beans.PropertyValues;
import com.lcoil.springframework.beans.factory.BeanFactory;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;
import com.lcoil.springframework.beans.factory.config.BeanReference;
import com.lcoil.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.lcoil.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.lcoil.springframework.test.beans.UserDao;
import com.lcoil.springframework.test.beans.UserService;
import org.junit.Test;

/**
 * @Classname test
 * @Description TODO
 * @Date 2022/1/8 10:14 AM
 * @Created by l-coil
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

    @Test
    public void test_xml() {
        //1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");
        //3. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("result:" + result);
    }

}