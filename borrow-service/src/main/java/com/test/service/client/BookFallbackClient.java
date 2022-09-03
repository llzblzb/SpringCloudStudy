package com.test.service.client;

import com.test.entity.Book;
import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @ClassName BookFallbackClient
 * @Author lzb
 * @Date 2022/9/3 14:40
 * @Version 1.0
 */

@Component
public class BookFallbackClient implements BookClient{
    @Override
    public Book findBookById(int bid) {
        return new Book();
    }
}
