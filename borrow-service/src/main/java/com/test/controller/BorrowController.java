package com.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Collections;

/**
 * 类描述：
 *
 * @ClassName BorrowController
 * @Author lzb
 * @Date 2022/9/1 14:18
 * @Version 1.0
 */

@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

//    @HystrixCommand(fallbackMethod = "onError") //使用@HystrixCommand来指定备选方案
    @RequestMapping("/borrow/{uid}")
    UserBorrowDetail findUserBorrows(@PathVariable("uid") int uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }

//    //备选方案，这里直接返回空列表了
//    //注意参数和返回值要和上面的一致
//    UserBorrowDetail onError(int uid){
//        return new UserBorrowDetail(null, Collections.emptyList());
//    }

}
