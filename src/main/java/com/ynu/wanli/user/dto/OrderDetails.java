package com.ynu.wanli.user.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class OrderDetails implements Serializable {
    private String carCard;
    private String orderId;
}
