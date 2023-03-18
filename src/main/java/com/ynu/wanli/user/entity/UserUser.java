/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;
    private String userAccount;
    private String userPwd;
    private String userName;
    private String userCode;
    private String userPhone;
    private String userSex;
    private String userPic;
    private Date userBirth;
    private String userEmail;
    private String userState;
    private Date userCreateTime;
    private Date userUpdateTime;
}