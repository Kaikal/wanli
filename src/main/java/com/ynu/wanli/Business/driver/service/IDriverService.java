package com.ynu.wanli.Business.driver.service;

import com.ynu.wanli.Business.driver.VO.DriverVO;
import com.ynu.wanli.Business.driver.dto.Driver;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface IDriverService{
    List<Driver> getAliveDriverList();
    int updateDriver(DriverVO driverVO);
    int addDriver(DriverVO driverVO);
    int deleteDriver(int id);
}
