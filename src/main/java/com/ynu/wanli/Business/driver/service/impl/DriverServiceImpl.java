package com.ynu.wanli.Business.driver.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.driver.Converter.DriverConventer;
import com.ynu.wanli.Business.driver.VO.DriverVO;
import com.ynu.wanli.Business.driver.dto.Driver;
import com.ynu.wanli.Business.driver.mapper.DriverMapper;
import com.ynu.wanli.Business.driver.service.IDriverService;
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
public class DriverServiceImpl implements IDriverService {
    @Resource
    DriverMapper driverMapper;
    @Override
    public List<Driver> getAliveDriverList() {
        QueryWrapper<Driver> queryWrapper=new QueryWrapper<Driver>();
        queryWrapper.eq("driverState",0);
        List<Driver> drivers = driverMapper.selectList(queryWrapper);
        return drivers;
    }

    @Override
    public int updateDriver(DriverVO driverVO) {
        DriverConventer driverConventer=new DriverConventer();
        Driver driver=driverConventer.driverVOToDriver(driverVO);
        int i = driverMapper.updateById(driver);
        return i;
    }

    @Override
    public int addDriver(DriverVO driverVO) {
        DriverConventer driverConventer=new DriverConventer();
        Driver driver=driverConventer.driverVOToDriver(driverVO);
        int i = driverMapper.insert(driver);
        return i;
    }

    @Override
    public int deleteDriver(int id) {
        Driver driver=new Driver();
        driver.setDriverId(id);
        driver.setDriverState(1);
        int i = driverMapper.updateById(driver);
        return i;
    }
}
