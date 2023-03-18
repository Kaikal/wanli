package com.ynu.wanli.Business.admin.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/10
 * 联系电话：
 * */
@Data
public class AdminLoginVO implements Serializable {
    private String userName;
    private String userPwd;
    private String reqCode;
}
