package com.ynu.wanli.Business.ticket.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2023-03-10
 */
@Getter
@Setter
@TableName("user_ticket")
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 票ID
     */
    @TableId(value = "ticketId", type = IdType.AUTO)
    private Long ticketId;

    /**
     * 购票人ID
     */
    private Long userId;

    /**
     * 车次Id
     */
    private Integer orderId;

    /**
     * 乘车人Id
     */
    private Integer siteId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Integer ticketState;

}
