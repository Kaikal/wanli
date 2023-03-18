package com.ynu.wanli.Business.ticket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.order.dto.Order;
import com.ynu.wanli.Business.order.mapper.OrderMapper;
import com.ynu.wanli.Business.ticket.VO.BuyTicketVO;
import com.ynu.wanli.Business.ticket.dto.Ticket;
import com.ynu.wanli.Business.ticket.mapper.TicketMapper;
import com.ynu.wanli.Business.ticket.service.ITicketService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-10
 */
@Service
public class TicketServiceImpl  implements ITicketService {
    @Resource
    TicketMapper ticketMapper;
    @Resource
    OrderMapper orderMapper;

    /**
     * 获取购票订单
     * @return
     */
    @Override
    public List<Ticket> getTickets() {
        QueryWrapper<Ticket> queryWrapper=new QueryWrapper<Ticket>();
        queryWrapper.eq("ticketState",1);
        List<Ticket> tickets = ticketMapper.selectList(queryWrapper);
        return tickets;
    }

    @Override
    public List<Ticket> getChangeTickets() {
        QueryWrapper<Ticket> queryWrapper=new QueryWrapper<Ticket>();
        queryWrapper.eq("ticketState",2);
        List<Ticket> tickets = ticketMapper.selectList(queryWrapper);
        return tickets;
    }

    @Override
    public List<Ticket> getDelTickets() {
        QueryWrapper<Ticket> queryWrapper=new QueryWrapper<Ticket>();
        queryWrapper.eq("ticketState",3);
        List<Ticket> tickets = ticketMapper.selectList(queryWrapper);
        return tickets;
    }

//    @Override
//    public int buyTickets(BuyTicketVO buyTicketVO) {
//        List<Integer> siteList=buyTicketVO.getSiteId();
//        int i=0;
//        for (; i < siteList.size(); i++) {
//            Ticket ticket=new Ticket();
//            ticket.setOrderId(buyTicketVO.getOrderId());
//            ticket.setSiteId(siteList.get(i));
//            ticket.setUserId(buyTicketVO.getUserId());
//            ticketMapper.insert(ticket);
//        }
//        Order order=new Order();
//        order=orderMapper.selectById(buyTicketVO.getOrderId());
//        /**
//         * 获取票数类型进行操作
//         */
//        if ("vip".equals(buyTicketVO.getSiteType())){
//            order.setOrderViPSite(order.getOrderViPSite()-i);
//        }else if("ordinary".equals(buyTicketVO.getSiteType())){
//            order.setOrderOrdinary(order.getOrderOrdinary()-i);
//        }else if ("noSite".equals(buyTicketVO.getSiteType())){
//            order.setOrderState(order.getOrderState()-i);
//        }
//        orderMapper.updateById(order);
//        return i;
//    }
}
