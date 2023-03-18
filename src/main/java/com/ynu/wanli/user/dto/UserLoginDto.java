package com.ynu.wanli.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginDto implements Serializable {
    private String userName;
    private String userPwd;
    private String reqCode;
}