package com.ynu.wanli.Business.car.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.car.VO.CarVO;
import com.ynu.wanli.Business.car.conventer.CarConventer;
import com.ynu.wanli.Business.car.dto.Car;
import com.ynu.wanli.Business.car.mapper.CarMapper;
import com.ynu.wanli.Business.car.service.ICarService;
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
public class CarServiceImpl implements ICarService {
    @Resource
    CarMapper carMapper;

    @Override
    public List<Car> getCars() {
        QueryWrapper<Car> queryWrapper=new QueryWrapper<Car>();
        List<Car> cars = carMapper.selectList(queryWrapper);
        return cars;
    }

    @Override
    public int updateCar(CarVO carVO) {
        CarConventer carConventer=new CarConventer();
        Car car=carConventer.carVOToCar(carVO);
        int i = carMapper.updateById(car);
        return i;
    }

    @Override
    public int addCar(CarVO carVO) {
        CarConventer carConventer=new CarConventer();
        Car car=carConventer.carVOToCar(carVO);
        int i = carMapper.insert(car);
        return i;
    }

    @Override
    public int deleteCar(Long id) {
        Car car=new Car();
        car.setCarId(id);
//        car.setCarState(0);
        int i = carMapper.updateById(car);
        return i;
    }
}
