package com.test.service.impl;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @ClassName UserServiceImpl
 * @Author lzb
 * @Date 2022/8/31 11:42
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
