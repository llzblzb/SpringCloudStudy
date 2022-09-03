package com.test.entity;

import lombok.Data;

/**
 * 类描述：
 *
 * @ClassName User
 * @Author lzb
 * @Date 2022/8/31 11:32
 * @Version 1.0
 */

@Data
public class User {
    private Integer uid;
    private String name;
    private Integer age;
    private String sex;
}
