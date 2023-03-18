package com.ynu.wanli.Business.driver.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Getter
@Setter
@TableName("user_driver")
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 司机id
     */
    @TableId(value = "driverId", type = IdType.AUTO)
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
    private int driverSex;

    /**
     * 司机生日
     */
    private Date driverBirth;

    /**
     * 状态：0 正常 1离职
     */
    private int driverState;

    /**
     * 创建时间
     */
    private Date driverCreateTime;

    /**
     * 更新时间
     */
    private Date driverUpdateTime;

//    private String driverPhone;


}
