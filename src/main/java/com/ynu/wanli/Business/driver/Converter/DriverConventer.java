package com.ynu.wanli.Business.driver.Converter;

import com.ynu.wanli.Business.driver.VO.DriverVO;
import com.ynu.wanli.Business.driver.dto.Driver;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/8
 * 联系电话：
 * */
public class DriverConventer {
    public Driver driverVOToDriver(DriverVO driverVO){
        Driver driver=new Driver();
        driver.setDriverId(driverVO.getDriverId());
        driver.setDriverBirth(driverVO.getDriverBirth());
        driver.setDriverName(driverVO.getDriverName());
//        driver.setDriverPhone(driverVO.getDriverPhone());
        driver.setDriverPic(driverVO.getDriverPic());
        driver.setDriverSex(driverVO.getDriverSex());
        return driver;
    }
    public DriverVO driverToDriveVO(Driver driver){
        DriverVO driverVO=new DriverVO();
        driverVO.setDriverBirth(driver.getDriverBirth());
        driverVO.setDriverName(driver.getDriverName());
        driverVO.setDriverId(driver.getDriverId());
        driverVO.setDriverPic(driver.getDriverPic());
        driverVO.setDriverSex(driver.getDriverSex());
//        driverVO.setDriverPhone(driver.getDriverPhone());
        return driverVO;

    }
}
