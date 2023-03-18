package com.ynu.wanli.Business.ticket.controller;

import com.ynu.wanli.Business.ticket.dto.Ticket;
import com.ynu.wanli.Business.ticket.service.ITicketService;
import com.ynu.wanli.core.dto.MyResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-10
 */
@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Resource
    ITicketService ticketService;

    /**
     * 获取所有的用户信息
     * @return
     */
    @GetMapping("/getTickets")
    @ResponseBody
    public MyResult getTickets(){
        MyResult myResult=new MyResult();
        List<Ticket> tickets = ticketService.getTickets();
        if (tickets==null){
            myResult.setCode(9999);
            myResult.setMsg("获取订单信息失败");
        }
        myResult.setMsg("获取订单信息成功");
        myResult.setCode(0000);
        myResult.setData(tickets);
        return myResult;
    }
    @GetMapping("/getChangeTickets")
    @ResponseBody
    public MyResult getChangeTickets(){
        MyResult myResult=new MyResult();
        List<Ticket> tickets = ticketService.getChangeTickets();
        if (tickets==null){
            myResult.setCode(9999);
            myResult.setMsg("获取订单信息失败");
        }
        myResult.setMsg("获取订单信息成功");
        myResult.setCode(0000);
        myResult.setData(tickets);
        return myResult;
    }
    @GetMapping("/getDelTickets")
    @ResponseBody
    public MyResult getDelTickets(){
        MyResult myResult=new MyResult();
        List<Ticket> tickets = ticketService.getDelTickets();
        if (tickets==null){
            myResult.setCode(9999);
            myResult.setMsg("获取订单信息失败");
        }
        myResult.setMsg("获取订单信息成功");
        myResult.setCode(0000);
        myResult.setData(tickets);
        return myResult;
    }

    /**
     * 改签订单
     */
    public MyResult updateTicket(){
        MyResult myResult=new MyResult();
        return myResult;
    }
}
