package com.ynu.wanli.Business.cont.dto;

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
@TableName("user_cont")
public class Cont implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 常用联系人ID
     */
    @TableId(value = "contId", type = IdType.AUTO)
    private Integer contId;

    /**
     * 常用联系人用户
     */
    private Long contUser;

    /**
     * 常用联系人姓名
     */
    private String contName;

    /**
     * 常用联系人电话
     */
    private String contPhone;

    /**
     * 常用联系人邮箱
     */
    private String contEmail;

    /**
     * 常用联系人插入时间
     */
    private Date contInsertTime;

    /**
     * 常用联系人更新时间
     */
    private Date contUpdateTime;


}
