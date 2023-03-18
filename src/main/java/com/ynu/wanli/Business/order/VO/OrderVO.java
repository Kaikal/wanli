package com.ynu.wanli.Business.order.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Data
public class OrderVO implements Serializable {
    /**
     * 订单主键
     */
    private Integer orderId;
    private Integer orderPerson;
    private Integer orderState;
}
