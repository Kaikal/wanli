package com.ynu.wanli.Business.order.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Getter
@Setter
@TableName("user_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
@TableId(value = "orderId",type = IdType.AUTO)
    private Integer orderId;
    private String orderUser;
    private Date orderStartTime;
    private String orderCard;
    private Date orderEndTime;
    private Integer orderVipSite;
    private Integer orderOrdinary;
    private Integer orderNoSite;
    private Integer orderState;
    private Integer orderPerson;
    private Date orderInsertTime;
    private Date orderUpdateTime;


}
