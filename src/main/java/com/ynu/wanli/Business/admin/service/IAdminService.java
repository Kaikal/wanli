package com.ynu.wanli.Business.admin.service;

import com.ynu.wanli.Business.admin.VO.AdminUpdateVO;
import com.ynu.wanli.Business.admin.dto.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface IAdminService{
    Admin adminLogin(String userAccount,String userPwd);
    Admin getAdmin(Integer id);
    int updateAdmin(AdminUpdateVO adminUpdateVO);
}
