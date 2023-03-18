package com.ynu.wanli.Business.admin.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;
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
@Data
@TableName("admin_admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    @TableId(value = "adminId",type = IdType.ASSIGN_ID)
   private Integer adminId;
   private String adminAccount;
   private String adminPwd;
   private String adminName;
   private String adminCode;
   private String adminPhone;
   private int adminSex;
   private String adminPic;
   private Date adminBirth;
   private String adminEmail;
   private int adminState;
   private Date adminCreateTime;
   private Date adminUpdateTime;

}
