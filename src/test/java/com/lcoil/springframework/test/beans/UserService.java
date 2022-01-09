package com.lcoil.springframework.test.beans;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2022/1/8 10:14 AM
 * @Created by l-coil
 */
public class UserService {

    private String uId;

    private UserDao userDao;

    public String queryUserInfo() {
        return userDao.queryUserName(uId);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
