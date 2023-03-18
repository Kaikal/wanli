package com.ynu.wanli.Business.car.conventer;

import com.ynu.wanli.Business.car.VO.CarVO;
import com.ynu.wanli.Business.car.dto.Car;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/9
 * 联系电话：
 * */
public class CarConventer {
    public Car carVOToCar(CarVO carVO){
        Car car=new Car();
        car.setCarCard(carVO.getCarCard());
        car.setCarPerson(carVO.getCarPerson());
        car.setCarPhone(carVO.getCarPhone());
        car.setCarId(carVO.getCarId());
//        car.setCarState(carVO.getCarState());/
        car.setCarRoute(carVO.getCarRoute());
        return car;
    }
}
