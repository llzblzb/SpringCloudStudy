package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName BorrowDetail用于返回数据
 * @Author lzb
 * @Date 2022/9/1 10:40
 * @Version 1.0
 */

@Data
@AllArgsConstructor
public class UserBorrowDetail {
    User user;
    List<Book> bookList;
}
