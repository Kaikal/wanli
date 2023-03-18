package com.ynu.wanli.Business.car.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("user_car")
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "carId", type = IdType.AUTO)
    private Long carId;

    /**
     * 车牌号
     */
    private String carCard;

    /**
     * 服务号码
     */
    private String carPhone;

    /**
     * 司机
     */
    private Long carPerson;

    /**
     * 路线
     */
    private Integer carRoute;

//    private int carState;
}
