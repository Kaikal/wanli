package com.ynu.wanli.Business.cont.controller;

import com.ynu.wanli.Business.cont.dto.Cont;
import com.ynu.wanli.Business.cont.service.IContService;
import com.ynu.wanli.core.dto.MyResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Controller
@RequestMapping("/cont")
public class ContController {
    @Resource
    IContService contService;
    @PostMapping ("/getContById")
    @ResponseBody
    public MyResult getContByID(Integer id){
        System.out.println(id);
        MyResult myResult=new MyResult();
        long idLong = id;
        List<Cont> contsByUserId = contService.getContsByUserId(idLong);
        myResult.setData(contsByUserId);
        return myResult;
    }

}
