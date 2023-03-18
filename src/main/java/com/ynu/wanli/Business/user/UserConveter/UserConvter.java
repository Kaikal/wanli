package com.ynu.wanli.Business.user.UserConveter;

import com.ynu.wanli.Business.user.UserVO.UserVO;
import com.ynu.wanli.Business.user.dto.User1;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/7
 * 联系电话：
 * */
public class UserConvter {
    public User1 UserVOTOUser(UserVO userVO){
        User1 user=new User1();
        user.setUserId(userVO.getId());
        user.setUserAccount(userVO.getNickname());
        user.setUserName(userVO.getRealname());
        user.setUserBirth(userVO.getBirth());
        user.setUserPhone(userVO.getPhone());
        user.setUserEmail(userVO.getEmail());
        user.setUserSex(userVO.getSex());
        return user;
    }
    public UserVO UserTOUserVO(User1 user){
        UserVO userVO=new UserVO();
        userVO.setId(user.getUserId());
        userVO.setNickname(user.getUserAccount());
        userVO.setRealname(user.getUserName());
        userVO.setBirth(user.getUserBirth());
        userVO.setPhone(user.getUserPhone());
        userVO.setEmail(userVO.getEmail());
        userVO.setSex(userVO.getSex());
        return userVO;
    }
}
