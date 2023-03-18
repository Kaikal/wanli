package com.ynu.wanli.Business.addr.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("user_addr")
public class Addr implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 常用地址
     */
    @TableId(value = "addrId", type = IdType.AUTO)
    private Integer addrId;

    /**
     * 常用地址用户
     */
    private Long addrUser;

    /**
     * 常用地址用户名
     */
    private String addrName;

    /**
     * 常用地址省份
     */
    private String addrProvince;

    /**
     * 常用地址城市
     */
    private String addrCity;

    /**
     * 常用地址区县
     */
    private String addrCounty;

    /**
     * 常用地址详细地址
     */
    private String addrDetail;

    /**
     * 常用地址地址邮编
     */
    private String addrCode;

    /**
     * 常用地址插入时间
     */
    private Date addrInsertTime;

    /**
     * 常用地址更新时间
     */
    private Date addrUpdateTime;


}
