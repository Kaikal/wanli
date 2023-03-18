package com.ynu.wanli.Business.pass.dto;

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
@TableName("user_pass")
public class Pass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 乘客信息的id
     */
    @TableId(value = "passId", type = IdType.AUTO)
    private Long passId;

    /**
     * 乘客信息的乘客
     */
    private Long passUser;

    /**
     * 乘客姓名
     */
    private String passName;

    /**
     * 乘客手机
     */
    private String passPhone;

    /**
     * 乘客身份证号码
     */
    private String passCode;

    /**
     * 乘客性别：0男 1女
     */
    private Boolean passSex;

    /**
     * 乘客信息创建时间
     */
    private Date passInsertTime;

    /**
     * 乘客信息修改时间
     */
    private Date passUpdateTime;


}
