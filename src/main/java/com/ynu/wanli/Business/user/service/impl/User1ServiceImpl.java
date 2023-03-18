package com.ynu.wanli.Business.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.user.UserConveter.UserConvter;
import com.ynu.wanli.Business.user.UserVO.UserVO;
import com.ynu.wanli.Business.user.dto.User1;
import com.ynu.wanli.Business.user.mapper.User1Mapper;
import com.ynu.wanli.Business.user.service.IUserService;
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
public class User1ServiceImpl implements IUserService {
    @Resource
    User1Mapper userMapper;

    /**
     * 查询活跃用户
     * @return
     */
    @Override
    public List<User1> getAliveUser() {
        QueryWrapper<User1> queryWrapper=new QueryWrapper<User1>();
        queryWrapper.eq("userState",0);
        List<User1> users = userMapper.selectList(queryWrapper);
        return users;
    }

    @Override
    public List<User1> getDeletedUser() {
        QueryWrapper<User1> queryWrapper=new QueryWrapper<User1>();
        queryWrapper.eq("userState",1);
        List<User1> users = userMapper.selectList(queryWrapper);
        return users;
    }

    @Override
    public List<User1> getFrozeUser() {
        QueryWrapper<User1> queryWrapper=new QueryWrapper<User1>();
        queryWrapper.eq("userState",2);
        List<User1> users = userMapper.selectList(queryWrapper);
        return users;
    }

    @Override
    public int deletdUserByID(Long id) {
        User1 user=new User1();
        user.setUserState(1);
        user.setUserId(id);
        int i = userMapper.updateById(user);
        return i;
    }
    @Override
    public int aliveUserByID(Long id) {
        User1 user=new User1();
        user.setUserState(0);
        user.setUserId(id);
        int i = userMapper.updateById(user);
        return i;
    }
    @Override
    public int frozeUserByID(Long id) {
        User1 user=new User1();
        user.setUserState(2);
        user.setUserId(id);
        int i = userMapper.updateById(user);
        return i;
    }

    @Override
    public int updateUser(UserVO userVO) {
        UserConvter userConvter=new UserConvter();
        User1 user=userConvter.UserVOTOUser(userVO);
        int i = userMapper.updateById(user);
        return i;
    }

    @Override
    public int insertUser(UserVO userVO) {
        UserConvter userConvter=new UserConvter();
        User1 user=userConvter.UserVOTOUser(userVO);
        user.setUserState(0);
        int insert = userMapper.insert(user);
        return insert;
    }
}
