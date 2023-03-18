package com.ynu.wanli.Business.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.ynu.wanli.Business.order.OrderConventer.OrderConventer;
import com.ynu.wanli.Business.order.OrderConventer.OrderConventer;
import com.ynu.wanli.Business.order.VO.AddOrderVO;
import com.ynu.wanli.Business.order.VO.OrderVO;
import com.ynu.wanli.Business.order.dto.Order;
import com.ynu.wanli.Business.order.mapper.OrderMapper;
import com.ynu.wanli.Business.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ynu.wanli.Business.user.UserVO.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Resource
    OrderMapper orderMapper;
    @Override
    public List<Order> getBeforeRunOrder() {
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("orderState",0);
        List<Order> orders = orderMapper.selectList(queryWrapper);
        return orders;
    }

    @Override
    public List<Order> getWaitPayOrder() {
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("orderState",1);
        List<Order> orders = orderMapper.selectList(queryWrapper);
        return orders;
    }

    @Override
    public List<Order> getWaitWordOrder() {
        QueryWrapper<Order> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("orderState",2);
        List<Order> orders = orderMapper.selectList(queryWrapper);
        return orders;
    }

    @Override
    public int updateOrder(OrderVO orderVO) {
        OrderConventer orderConventer=new OrderConventer();
        Order order=orderConventer.orderVOToOrder(orderVO);
        int i = orderMapper.updateById(order);
        return i;
    }

    @Override
    public int addOrder(AddOrderVO addOrderVO) {
        OrderConventer orderConventer=new OrderConventer();
        Order order=orderConventer.addOrderToOrder(addOrderVO);
        int i = orderMapper.insert(order);
        return i;
    }

    @Override
    public int deleteOrder(Integer id) {
        Order order=new Order();
        order.setOrderId(id);
        order.setOrderState(3);
        int i = orderMapper.updateById(order);
        return i;
    }
}
