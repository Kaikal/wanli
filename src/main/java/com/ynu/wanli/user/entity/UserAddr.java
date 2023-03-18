/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer addrId;
    private String addrUser;
    private String addrName;
    private String addrProvince;
    private String addrCity;
    private String addrCounty;
    private String addrDetail;
    private String addrCode;
    private Date addrInsertTime;
    private Date addrUpdateTime;
}