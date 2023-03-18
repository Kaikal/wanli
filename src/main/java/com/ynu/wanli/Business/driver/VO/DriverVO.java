package com.ynu.wanli.Business.driver.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/8
 * 联系电话：
 * */
@Data
public class DriverVO {
    private Integer driverId;

    /**
     * 司机姓名
     */
    private String driverName;

    /**
     * 司机照片
     */
    private String driverPic;

    /**
     * 司机性别：0男 1女
     */
    private Integer driverSex;

    /**
     * 司机生日
     */
    private Date driverBirth;
//    private String driverPhone;
}
