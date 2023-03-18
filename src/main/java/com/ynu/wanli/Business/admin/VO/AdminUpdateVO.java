package com.ynu.wanli.Business.admin.VO;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/10
 * 联系电话：
 * */
@Data
public class AdminUpdateVO {
    private Integer adminId;
    private String adminAccount;
    private String adminEmail;
    private String adminPhone;
    private Integer adminSex;
    private Date adminBirth;
    private String adminCode;
    private String adminName;
}
