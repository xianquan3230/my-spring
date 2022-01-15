package com.lcoil.springframework.test.beans;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.*;
import com.lcoil.springframework.context.ApplicationContentAware;
import com.lcoil.springframework.context.ApplicationContext;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2022/1/8 10:14 AM
 * @Created by l-coil
 */
public class UserService implements BeanNameAware, BeanClassLoaderAware, ApplicationContentAware, BeanFactoryAware {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    private String uId;
    private String company;
    private String location;
    private IUserDao userDao;

   @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader:" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is:" + name);
    }

    @Override
    public void setApplicationContent(ApplicationContext applicationContent) throws BeansException {
        this.applicationContext = applicationContent;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + "," + company + "," + location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }


}
