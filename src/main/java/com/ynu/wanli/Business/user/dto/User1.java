package com.ynu.wanli.Business.user.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Data
@TableName("user_user")
public class User1 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户主键
     */
    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    /**
     * 用户账户
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户实名
     */
    private String userName;

    /**
     * 用户身份证号码
     */
    private String userCode;

    /**
     * 用户电话
     */
    private String userPhone;

    /**
     * 用户性别 0保密 1男 2女
     */
    private int userSex;

    /**
     * 用户头像
     */
    private String userPic;

    /**
     * 用户生日
     */
    private Date userBirth;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户状态：0正常 1注销 2冻结
     */
    private int userState;

    /**
     * 用户创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date userCreateTime;

    /**
     * 用户更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date userUpdateTime;
}
