package com.ynu.wanli.Business.car.service;

import com.ynu.wanli.Business.car.VO.CarVO;
import com.ynu.wanli.Business.car.dto.Car;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface ICarService {
    /**
     * 获取所有车的信息
     */
    List<Car> getCars();
    int updateCar(CarVO carVO);
    int addCar(CarVO carVO);
    int deleteCar(Long id);

}
