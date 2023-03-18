package com.ynu.wanli.user.service;

import com.ynu.wanli.user.dto.OrderDto;
import com.ynu.wanli.user.dto.UpdateOrder;
import com.ynu.wanli.user.dto.UserRegisterDto;
import com.ynu.wanli.user.entity.UserAccount;
import com.ynu.wanli.user.entity.UserAddr;
import com.ynu.wanli.user.entity.UserCar;
import com.ynu.wanli.user.entity.UserCont;
import com.ynu.wanli.user.entity.UserDriver;
import com.ynu.wanli.user.entity.UserOrder;
import com.ynu.wanli.user.entity.UserPass;
import com.ynu.wanli.user.entity.UserRotation;
import com.ynu.wanli.user.entity.UserTicket;
import com.ynu.wanli.user.entity.UserUser;
import com.ynu.wanli.utils.MyResult;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface UserService {
    List<UserUser> UserLogin(String userName, String pwd);
    MyResult register(UserRegisterDto userRegister);
    List<UserAccount> getUserAccountList(Long id);
    UserUser getMyMess(Long id);
    int reviseMyMess(UserUser user, HttpSession session);
    List<UserPass> getUserPass(HttpSession session);
    UserPass getUserPassById(String id);
    int updatePassenger(UserPass userPass);
    int deletePassenger(String passId);
    List<UserCont> getMyContacts(String contUser);
    List<UserAddr> getMyAddress(String addrUser);
    List<UserOrder> getMyOrder(String orderUser, String state);
    UserOrder getOrderById(String id);
    String getTimeDifferce(Long id);
    List<UserRotation> getRotation();
    List<UserCar> getCarList();
    UserDriver getDriverById(String id);
    int updateOrder(UpdateOrder updateOrder);
    UserCar getCarById(String id);
    List<UserTicket> getTicketNum();
    String insertMyOrder(OrderDto orderDto,HttpSession session);
}
