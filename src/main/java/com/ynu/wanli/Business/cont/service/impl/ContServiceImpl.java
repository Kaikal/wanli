package com.ynu.wanli.Business.cont.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.cont.dto.Cont;
import com.ynu.wanli.Business.cont.mapper.ContMapper;
import com.ynu.wanli.Business.cont.service.IContService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
@Service
public class ContServiceImpl implements IContService {
    @Resource
    ContMapper contMapper;

    /**
     * 通过当前用户id获取乘车人信息
     * @param id
     * @return
     */
    @Override
    public List<Cont> getContsByUserId(Long id) {
        QueryWrapper<Cont> queryWrapper=new QueryWrapper<Cont>();
        queryWrapper.eq("contUser",id);
        List<Cont> conts = contMapper.selectList(queryWrapper);
        return conts;
    }
}
