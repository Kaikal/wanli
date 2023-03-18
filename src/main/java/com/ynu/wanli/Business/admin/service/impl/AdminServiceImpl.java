package com.ynu.wanli.Business.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.admin.VO.AdminUpdateVO;
import com.ynu.wanli.Business.admin.conventer.AdminConventer;
import com.ynu.wanli.Business.admin.dto.Admin;
import com.ynu.wanli.Business.admin.mapper.AdminAdminMapper;
import com.ynu.wanli.Business.admin.mapper.AdminMapper;
import com.ynu.wanli.Business.admin.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Service
public class AdminServiceImpl implements IAdminService {
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private AdminAdminMapper adminAdminMapper;
    @Override
    public Admin adminLogin(String adminAccount, String adminPwd) {
        QueryWrapper<Admin> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("adminAccount",adminAccount.trim());
        queryWrapper.eq("adminPwd",adminPwd.trim());
//        List<Admin> admins = adminMapper.selectList(queryWrapper);
        Admin admin1 = adminAdminMapper.selectOne(queryWrapper);
//        Admin admin = admins.get(0);
        System.out.println(admin1);
        return admin1;
    }

    @Override
    public Admin getAdmin(Integer id) {
        Admin admin = adminMapper.selectById(id);
        return admin;
    }

    @Override
    public int updateAdmin(AdminUpdateVO adminUpdateVO) {
        AdminConventer adminConventer=new AdminConventer();
        Admin admin=adminConventer.adminUpdateToAdmin(adminUpdateVO);
        int i = adminMapper.updateById(admin);
        return i;
    }
}
