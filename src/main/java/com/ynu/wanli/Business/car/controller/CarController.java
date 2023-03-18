package com.ynu.wanli.Business.car.controller;

import com.ynu.wanli.Business.car.VO.CarVO;
import com.ynu.wanli.Business.car.dto.Car;
import com.ynu.wanli.Business.car.service.ICarService;
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
@RequestMapping("/car1")
public class CarController {
    @Resource
    ICarService carService;
    @GetMapping("/getCars")
    @ResponseBody
    public MyResult getCars(){
        MyResult myResult=new MyResult();
        List<Car> cars = carService.getCars();
        if (cars==null){
            myResult.setMsg("失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setCode(0000);
        myResult.setData(cars);
        myResult.setMsg("成功");
        return myResult;
    }
    @PostMapping("/updateCar")
    @ResponseBody
    public MyResult updateCar(@RequestBody CarVO carVO){
        MyResult myResult=new MyResult();
        int i = carService.updateCar(carVO);
        if (i!=1){
            myResult.setMsg("更新事变");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }
    @PostMapping("/deleteCar")
    @ResponseBody
    public MyResult deleteCar(Long id){
        MyResult myResult=new MyResult();
        int i = carService.deleteCar(id);
        if (i!=1){
            myResult.setMsg("删除失败");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }

    @PostMapping("/addCar")
    @ResponseBody
    public MyResult addCar(CarVO carVO){
        MyResult myResult=new MyResult();
        int i = carService.addCar(carVO);
        if (i!=1){
            myResult.setMsg("更新事变");
            myResult.setCode(9999);
            return myResult;
        }
        myResult.setMsg("删除成功");
        myResult.setCode(0000);
        return myResult;
    }
}
