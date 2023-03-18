/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserDriver implements Serializable {

    private static final long serialVersionUID = 1L;

    private String driverId;
    private String driverName;
    private String driverPic;
    private String driverSex;
    private Date driverBirth;
    private String driverState;
    private Date driverCreateTime;
    private Date driverUpdateTime;
}