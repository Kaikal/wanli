/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy   All rights reserved.
 */
package com.ynu.wanli.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ynu.wanli.user.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOrderMapper extends BaseMapper<UserOrder> {
    String getTimeDifferce(Long id);
}