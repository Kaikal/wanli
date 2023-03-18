/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class UserOrder implements Serializable {

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
    private String orderState;
    private String orderPerson;
    @TableField(exist = false)
    private String timeDifferce;
    @TableField(value = "orderInsertTime",fill = FieldFill.INSERT)// 在什么时候要做某个事情
    private Date insertTime;
    @TableField(value = "orderUpdateTime",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}