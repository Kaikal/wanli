package com.ynu.wanli.Business.order.VO;

import lombok.Data;

import java.util.Date;

@Data
public class AddOrderVO {
    private String orderUser;
    private Date orderStartTime;
    private String orderCard;
    private Date orderEndTime;
    private Integer orderVipSite;
    private Integer orderOrdinary;
    private Integer orderNoSite;
    private Integer orderPerson;
}
