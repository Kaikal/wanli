package com.ynu.wanli.Business.user.service;

import com.ynu.wanli.Business.user.UserVO.UserVO;
import com.ynu.wanli.Business.user.dto.User1;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuBin
 * @since 2023-03-07
 */
public interface IUserService{
    /**
     * 获取活跃用户
     * @return
     */
    List<User1> getAliveUser();

    /**
     * 获取注销用户
     * @return
     */
    List<User1> getDeletedUser();

    /**
     * 获取冻结用户
     * @return
     */
    List<User1> getFrozeUser();

    /**
     * 通过ID删除用户
     * @param id
     * @return
     */
    int deletdUserByID(Long id);
    int aliveUserByID(Long id);
    int frozeUserByID(Long id);

    /**
     * 修改用户信息
     * @param userVO
     * @return
     */
    int updateUser(UserVO userVO);
    int insertUser(UserVO userVO);
}
