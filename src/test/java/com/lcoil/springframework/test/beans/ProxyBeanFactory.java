package com.lcoil.springframework.test.beans;

import com.lcoil.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname ProxyBeanfactory
 * @Description TODO
 * @Date 2022/1/15 11:16 PM
 * @Created by l-coil
 */
public class ProxyBeanFactory implements FactoryBean<IUserDao> {


    @Override
    public IUserDao getObject() throws Exception {
        InvocationHandler handler = (proxy, method, args) -> {

            Map<String, String> hashMap = new HashMap<>();
            hashMap.put("10001", "斯科菲尔德");
            hashMap.put("10002", "琅琊");
            hashMap.put("10003", "阿松");

            return "你被代理了 " + method.getName() + "：" + hashMap.get(args[0].toString());
        };
        return (IUserDao) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{IUserDao.class}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
