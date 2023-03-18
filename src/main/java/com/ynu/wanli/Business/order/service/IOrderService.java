package com.ynu.wanli.Business.order.service;

import com.ynu.wanli.Business.order.VO.AddOrderVO;
import com.ynu.wanli.Business.order.VO.OrderVO;
import com.ynu.wanli.Business.order.dto.Order;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ynu.wanli.Business.user.UserVO.UserVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface IOrderService{
    List<Order> getBeforeRunOrder();
    List<Order> getWaitPayOrder();
    List<Order> getWaitWordOrder();
    int updateOrder(OrderVO orderVO);
    int addOrder(AddOrderVO addOrderVO);
    int deleteOrder(Integer id);
}
