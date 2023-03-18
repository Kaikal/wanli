package com.ynu.wanli.Business.admin.conventer;

import com.ynu.wanli.Business.admin.VO.AdminUpdateVO;
import com.ynu.wanli.Business.admin.dto.Admin;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/10
 * 联系电话：
 * */
public class AdminConventer {
    public Admin adminUpdateToAdmin(AdminUpdateVO adminUpdateVO){
        Admin admin=new Admin();
        admin.setAdminAccount(adminUpdateVO.getAdminAccount());
        admin.setAdminId(adminUpdateVO.getAdminId());
        admin.setAdminBirth(adminUpdateVO.getAdminBirth());
        admin.setAdminCode(adminUpdateVO.getAdminCode());
        admin.setAdminEmail(adminUpdateVO.getAdminEmail());
        admin.setAdminName(adminUpdateVO.getAdminName());
        admin.setAdminPhone(adminUpdateVO.getAdminPhone());
        admin.setAdminSex(adminUpdateVO.getAdminSex());
        return admin;
    }
}
