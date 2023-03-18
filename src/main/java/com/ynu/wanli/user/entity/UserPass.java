/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserPass implements Serializable {

    private static final long serialVersionUID = 1L;

    private String passId;
    private String passUser;
    private String passName;
    private String passPhone;
    private String passCode;
    private String passSex;
    private Date passInsertTime;
    private Date passUpdateTime;
}