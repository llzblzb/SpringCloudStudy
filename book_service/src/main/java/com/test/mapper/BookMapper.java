package com.test.mapper;

import com.test.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName BookMapper
 * @Author lzb
 * @Date 2022/8/31 12:00
 * @Version 1.0
 */

@Mapper
public interface BookMapper {
    @Select("select * from db_book where bid= #{bid}")
    Book getBookById(int bid);

    @Select("select * from db_book")
    List<Book> getAllBook();
}
