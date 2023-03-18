package com.ynu.wanli.Business.user.controller;

import com.ynu.wanli.Business.user.UserVO.UserVO;
import com.ynu.wanli.Business.user.dto.User1;
import com.ynu.wanli.Business.user.service.IUserService;
import com.ynu.wanli.core.dto.MyResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
@RequestMapping("/user1")
public class User1Controller {
    @Resource
    IUserService userService;

    /**
     * 获取活跃用户
     * @return
     */
    @GetMapping("/aliveList")
    @ResponseBody
    public MyResult getAliveUser(){
       MyResult myResult=new MyResult();
        List<User1> aliveUser = userService.getAliveUser();
        myResult.setData(aliveUser);
        return myResult;
    }

    /**
     * 获取注销用户
     * @return
     */
    @GetMapping("/deletedList")
    @ResponseBody
    public MyResult getDeletedUser(){
        MyResult myResult=new MyResult();
        List<User1> deletedUser = userService.getDeletedUser();
        myResult.setData(deletedUser);
        return myResult;
    }

    /**
     * 获取冻结用户
     * @return
     */
    @GetMapping("/frozeList")
    @ResponseBody
    public MyResult getFrozeUser(){
        MyResult myResult=new MyResult();
        List<User1> frozeUser = userService.getFrozeUser();
        myResult.setData(frozeUser);
        return myResult;
    }

    /**
     * 逻辑删除用户
     * @param id
     * @return
     */
    @PostMapping("/deleteUser")
    @ResponseBody
    public MyResult deleteUser(Long id){
        MyResult myResult=new MyResult();
        int i = userService.deletdUserByID(id);
        if (i!=1){
         myResult.setMsg("删除失败");
         myResult.setCode(9999);
         return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }

    /**
     * 激活用户
     * @param id
     * @return
     */
    @PostMapping("/AliveUser")
    @ResponseBody
    public MyResult AliveUser(Long id){
        MyResult myResult=new MyResult();
        int i = userService.aliveUserByID(id);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }

    /**
     * 冻结用户
     * @param id
     * @return
     */
    @PostMapping("/frozeUser")
    @ResponseBody
    public MyResult froze(Long id){
        MyResult myResult=new MyResult();
        int i = userService.frozeUserByID(id);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }

    /**
     * 更新用户
     * @param userVO
     * @return
     */
    @PostMapping("/updateUser")
    @ResponseBody
    public MyResult updateUser(@RequestBody UserVO userVO){
        System.out.println(userVO);
        MyResult myResult=new MyResult();
        int i = userService.updateUser(userVO);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }

    /**
     * 添加用户
     * @param userVO
     * @return
     */
    @PostMapping("/addUser")
    @ResponseBody
    public MyResult addUser(@RequestBody UserVO userVO){
        System.out.println(userVO);
        MyResult myResult=new MyResult();
        int i = userService.insertUser(userVO);
        if (i!=1){
            myResult.setMsg("添加失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("添加成功");
        myResult.setCode(0000);
        return myResult;
    }
}
