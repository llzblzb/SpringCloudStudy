package com.test.service.client;

import com.test.entity.User;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @ClassName UserFallBackClient
 * @Author lzb
 * @Date 2022/9/3 14:34
 * @Version 1.0
 */

@Component
public class UserFallbackClient implements UserClient{
    @Override
    public User findUserById(int uid) {
        User user = new User();
        user.setName("我是替代方案");
        return user;
    }
}
