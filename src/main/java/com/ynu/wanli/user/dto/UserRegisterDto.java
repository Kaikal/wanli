package com.ynu.wanli.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterDto implements Serializable {
    private String account;
    private String phone;
    private String userName;
    private String email;
    private String password;
}
