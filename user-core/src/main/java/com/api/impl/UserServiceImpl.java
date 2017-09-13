package com.api.impl;

import com.api.IUserService;
import org.springframework.stereotype.Service;

/**
 * 用户业务模块
 *
 * @author shuaion 2017/9/12
 **/
public class UserServiceImpl implements IUserService{
    @Override
    public String sayHello(String topic) {
        return topic;
    }
}
