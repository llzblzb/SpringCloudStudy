package com.test.service.impl;

import com.test.entity.Book;
import com.test.mapper.BookMapper;
import com.test.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName BookServiceImpl
 * @Author lzb
 * @Date 2022/8/31 12:01
 * @Version 1.0
 */

@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper bookMapper;
    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }

    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAllBook();
    }
}
