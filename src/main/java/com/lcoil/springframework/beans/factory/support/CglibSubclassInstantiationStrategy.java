package com.lcoil.springframework.beans.factory.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @Classname CglibSubclassInstantiationStrategy
 * @Description Cglib 实例化
 * @Date 2022/1/8 11:53 AM
 * @Created by l-coil
 */
public class CglibSubclassInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if(null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(),args);
    }
}
