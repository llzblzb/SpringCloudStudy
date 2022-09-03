package com.test.controller;

import com.test.entity.Book;
import com.test.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName BookController
 * @Author lzb
 * @Date 2022/8/31 12:02
 * @Version 1.0
 */

@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid")int bid,
                      HttpServletRequest request){
        System.out.println(request.getHeader("Test"));
        return bookService.getBookById(bid);
    }

    @RequestMapping("/")
    List<Book> findAllBook(){
        return bookService.getAllBook();
    }
}
