package com.ynu.wanli;

import com.ynu.wanli.user.entity.UserDriver;
import com.ynu.wanli.user.entity.UserTicket;
import com.ynu.wanli.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class WanliApplicationTests {
    @Resource
    private UserService userService;
    @Test
    void contextLoads() {
        List<UserTicket> ticketNum = userService.getTicketNum();
        ticketNum.forEach(System.out::println);
    }

}
