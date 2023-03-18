package com.ynu.wanli.Business.admin.controller;

import com.ynu.wanli.Business.admin.VO.AdminLoginVO;
import com.ynu.wanli.Business.admin.VO.AdminUpdateVO;
import com.ynu.wanli.Business.admin.dto.Admin;
import com.ynu.wanli.Business.admin.service.IAdminService;
import com.ynu.wanli.core.dto.MyResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    IAdminService adminService;
    @PostMapping("/doLogin")
    @ResponseBody
    public MyResult doLogin(@RequestBody AdminLoginVO adminLoginVO,HttpSession session){
        MyResult result = new MyResult();
        Object reqCode = session.getAttribute("reqCode");
        if (reqCode==null){
            result.setCode(9998);
            result.setMsg("验证码过期，请刷新页面！");
            return result;
        }else{
            String reqCodeStr = (String) reqCode;
            if (!reqCodeStr.equalsIgnoreCase(adminLoginVO.getReqCode())){
                result.setCode(9998);
                result.setMsg("验证码错误，请重新输入！");
                return result;
            }
        }
        Admin admin = adminService.adminLogin(adminLoginVO.getUserName(), adminLoginVO.getUserPwd());
        if (admin==null){
            result.setCode(9999);
            result.setMsg("用户名或密码错误！");
            return result;
        }
        session.setMaxInactiveInterval(60*30);
        session.setAttribute("adminName",admin.getAdminAccount());
        session.setAttribute("adminId",admin.getAdminId());
        result.setCode(0000);
        return result;
    }

    @PostMapping("/getAdmin")
    @ResponseBody
    public MyResult getAdmin(HttpSession session){
        MyResult myResult=new MyResult();
        Integer adminId = (Integer) session.getAttribute("adminId");
//        System.out.println(adminId);
//        long id = Long.parseLong(adminId);
        Admin admin = adminService.getAdmin(adminId);
        if (admin==null){
            myResult.setCode(9999);
            myResult.setMsg("获取用户信息失效");
            return myResult;
        }
        myResult.setData(admin);
        myResult.setMsg("获取用户信息成功");
        myResult.setCode(0000);
        return myResult;
    }

    @PostMapping("/updateAdmin")
    @ResponseBody
    public MyResult updateAdmin(@RequestBody  AdminUpdateVO adminUpdateVO){
        MyResult myResult=new MyResult();
        int i = adminService.updateAdmin(adminUpdateVO);
        if (i!=1){
            myResult.setCode(9999);
            myResult.setMsg("修改失败");
            return myResult;
        }
        myResult.setMsg("修改成功");
        myResult.setCode(0000);
        return myResult;
    }
}
