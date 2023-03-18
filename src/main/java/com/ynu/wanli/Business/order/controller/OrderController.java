package com.ynu.wanli.Business.order.controller;

import com.ynu.wanli.Business.order.VO.AddOrderVO;
import com.ynu.wanli.Business.order.VO.OrderVO;
import com.ynu.wanli.Business.order.dto.Order;
import com.ynu.wanli.Business.order.service.IOrderService;
import com.ynu.wanli.Business.user.service.IUserService;
import com.ynu.wanli.core.dto.MyResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
 * @since 2023-03-07
 */
@Controller
@RequestMapping("/order1")
public class OrderController {
    @Resource
    IOrderService orderService;
    @GetMapping("/getBeforeRunOrder")
    @ResponseBody
    public MyResult getBeforeRunOrder(){
        MyResult myResult=new MyResult();
        List<Order> beforeRunOrder = orderService.getBeforeRunOrder();
        if (beforeRunOrder==null){
            myResult.setMsg("查询失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setCode(0000);
        myResult.setMsg("查询成功");
        myResult.setData(beforeRunOrder);
        return myResult;

    }
    @GetMapping("/getWaitPayOrder")
    @ResponseBody
    public MyResult getWaitPayOrder(){
        MyResult myResult=new MyResult();
        List<Order> waitPayOrder = orderService.getWaitPayOrder();
        if (waitPayOrder==null){
            myResult.setMsg("查询失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setCode(0000);
        myResult.setMsg("查询成功");
        myResult.setData(waitPayOrder);
        return myResult;

    }
    @GetMapping("/getWaitWordOrder")
    @ResponseBody
    public MyResult getWaitWordOrder(){
        MyResult myResult=new MyResult();
        List<Order> waitWordOrder = orderService.getWaitWordOrder();
        if (waitWordOrder==null){
            myResult.setMsg("查询失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setCode(0000);
        myResult.setMsg("查询成功");
        myResult.setData(waitWordOrder);
        return myResult;

    }

    @PostMapping("/updateOrder")
    @ResponseBody
    public MyResult updateOrder(@RequestBody  OrderVO orderVO){
        MyResult myResult=new MyResult();
        int i = orderService.updateOrder(orderVO);
        if (i!=1){
            myResult.setMsg("错误");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("正确");
        myResult.setCode(0000);
        return myResult;
    }
    @PostMapping("/addOrder")
    @ResponseBody
    public MyResult addOrder(@RequestBody AddOrderVO orderVO){
        MyResult myResult=new MyResult();
        int i = orderService.addOrder(orderVO);
        if (i!=1){
            myResult.setMsg("错误");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("正确");
        myResult.setCode(0000);
        return myResult;
    }
    @PostMapping("/deleteOrder")
    @ResponseBody
    public MyResult deleteOrder(Integer id){
        MyResult myResult=new MyResult();
        int i = orderService.deleteOrder(id);
        if (i!=1){
            myResult.setMsg("错误");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("正确");
        myResult.setCode(0000);
        return myResult;
    }
}
