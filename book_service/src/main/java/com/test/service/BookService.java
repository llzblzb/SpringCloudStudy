package com.test.service;

import com.test.entity.Book;

import java.util.List;

public interface BookService {
    Book getBookById(int bid);

    List<Book> getAllBook();
}
