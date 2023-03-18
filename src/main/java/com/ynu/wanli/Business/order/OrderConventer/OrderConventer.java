package com.ynu.wanli.Business.order.OrderConventer;
import com.ynu.wanli.Business.order.VO.AddOrderVO;
import com.ynu.wanli.Business.order.VO.OrderVO;
import com.ynu.wanli.Business.order.dto.Order;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/8
 * 联系电话：
 * */
public class OrderConventer {
    public Order orderVOToOrder(OrderVO orderVO){
       Order order=new Order();
       order.setOrderId(orderVO.getOrderId());
       order.setOrderState(orderVO.getOrderState());
       order.setOrderPerson(orderVO.getOrderPerson());
       return order;
    }
    public Order addOrderToOrder(AddOrderVO addOrderVO){
        Order order=new Order();
       order.setOrderCard(addOrderVO.getOrderCard());
       order.setOrderOrdinary(addOrderVO.getOrderOrdinary());
       order.setOrderNoSite(addOrderVO.getOrderNoSite());
       order.setOrderUser(addOrderVO.getOrderUser());
       order.setOrderEndTime(addOrderVO.getOrderEndTime());
       order.setOrderState(0);
       order.setOrderPerson(addOrderVO.getOrderPerson());
       order.setOrderStartTime(addOrderVO.getOrderStartTime());
       order.setOrderCard(addOrderVO.getOrderCard());
        return order;
    }


}
