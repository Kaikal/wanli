/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class UserCar implements Serializable {

    private static final long serialVersionUID = 1L;

    private String carId;
    private BigDecimal carPrice;
    private String carPic;
    private String carCard;
    private String carPhone;
    private String carPerson;
    @TableField(exist = false)
    private String carPersonName;
    private Integer carRoute;
}