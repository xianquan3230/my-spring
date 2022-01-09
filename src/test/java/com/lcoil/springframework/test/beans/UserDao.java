package com.lcoil.springframework.test.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname UserDao
 * @Description TODO
 * @Date 2022/1/8 1:02 PM
 * @Created by l-coil
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "线圈");
        hashMap.put("10002", "斯科菲尔德");
        hashMap.put("10003", "蛮吉");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
