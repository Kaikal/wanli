package com.ynu.wanli.Business.ticket.service;

import com.ynu.wanli.Business.ticket.VO.BuyTicketVO;
import com.ynu.wanli.Business.ticket.dto.Ticket;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-10
 */
public interface ITicketService{
    /**
     * 管理员获取所有表单
     * @return
     */
    List<Ticket> getTickets();
    List<Ticket> getChangeTickets();
    List<Ticket> getDelTickets();
//    int buyTickets(BuyTicketVO buyTicketVO);
}
