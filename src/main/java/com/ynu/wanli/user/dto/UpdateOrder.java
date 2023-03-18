package com.ynu.wanli.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateOrder implements Serializable {
    private String orderId;
    private String orderPerson;
}
