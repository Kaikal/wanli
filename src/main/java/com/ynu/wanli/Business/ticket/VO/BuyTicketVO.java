package com.ynu.wanli.Business.ticket.VO;

import lombok.Data;

import java.util.List;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/10
 * 联系电话：
 * */
@Data
public class BuyTicketVO {
    private Long userId;
    private List<Integer> siteId;
    private Integer orderId;
    private String siteType;
}
