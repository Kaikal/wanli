package com.ynu.wanli.Business.user.UserVO;

import lombok.Data;

import java.sql.Date;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/7
 * 联系电话：
 * */
@Data
public class UserVO {
    private Long id;
    private String nickname;
    private String realname;
    private Integer sex;
    private Date birth;
    private String phone;
    private String email;
}
