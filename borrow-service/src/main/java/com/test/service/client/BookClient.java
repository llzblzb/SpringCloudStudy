package com.test.service.client;

import com.test.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类描述：
 *
 * @ClassName BookClient
 * @Author lzb
 * @Date 2022/9/3 10:51
 * @Version 1.0
 */

@FeignClient(value = "bookservice",fallback = BookFallbackClient.class)
public interface BookClient {

    @RequestMapping("/book/{bid}")
    Book findBookById(@PathVariable("bid")int bid);

}
