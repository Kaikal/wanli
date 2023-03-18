package com.ynu.wanli.Business.driver.controller;

import com.ynu.wanli.Business.driver.VO.DriverVO;
import com.ynu.wanli.Business.driver.dto.Driver;
import com.ynu.wanli.Business.driver.service.IDriverService;
import com.ynu.wanli.Business.user.UserVO.UserVO;
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
@RequestMapping("/driver1")
public class DriverController {
    @Resource
    IDriverService driverService;
    @GetMapping("/aliveDriver")
    @ResponseBody
    public MyResult getAliveDriveList(){
        MyResult myResult=new MyResult();
        List<Driver> aliveDriverList = driverService.getAliveDriverList();
        myResult.setData(aliveDriverList);
        myResult.setMsg("查询成功");
        return myResult;
    }
    /**
     * 更新用户
     * @param driverVO
     * @return
     */
    @PostMapping("/updateDriver")
    @ResponseBody
    public MyResult updateDriver(@RequestBody DriverVO driverVO){
        MyResult myResult=new MyResult();
        int i = driverService.updateDriver(driverVO);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }
    @PostMapping("/addDriver")
    @ResponseBody
    public MyResult addDriver(@RequestBody DriverVO driverVO){
        MyResult myResult=new MyResult();
        int i = driverService.addDriver(driverVO);
        if (i!=1){
            myResult.setMsg("添加失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("添加成功");
        myResult.setCode(0000);
        return myResult;
    }

    @PostMapping("/deleteDriver")
    @ResponseBody
    public MyResult deleteDriver(int id){
        MyResult myResult=new MyResult();
        int i = driverService.deleteDriver(id);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }
}
