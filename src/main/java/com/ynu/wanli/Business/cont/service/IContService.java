package com.ynu.wanli.Business.cont.service;

import com.ynu.wanli.Business.cont.dto.Cont;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface IContService{
    List<Cont> getContsByUserId(Long id);
}
