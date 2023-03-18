package com.ynu.wanli.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderDto implements Serializable {
    private String carId;
    private String carCard;
    private Integer carRoute;
    private Integer vip;
    private Integer ordinary;
    private Integer nos;
    private String startTime;
    private String endTime;
}
