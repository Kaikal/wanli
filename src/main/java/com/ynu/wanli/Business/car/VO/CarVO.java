package com.ynu.wanli.Business.car.VO;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/9
 * 联系电话：
 * */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

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
public class CarVO implements Serializable {

    /**
     * 主键
     */
    @TableId(value = "carId", type = IdType.AUTO)
    private Long carId;

    /**
     * 车牌号
     */
    private String carCard;

    /**
     * 服务号码
     */
    private String carPhone;

    /**
     * 司机
     */
    private Long carPerson;

    /**
     * 路线
     */
    private Integer carRoute;

//    private Integer carState;
}
