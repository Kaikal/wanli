package com.ynu.wanli.Business.admin.mapper;

import com.ynu.wanli.Business.admin.dto.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    Admin doLogin(String userAccount,String Pwd);
}
