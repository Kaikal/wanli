package com.ynu.wanli.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ynu.wanli.Business.order.mapper.OrderMapper;
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
import com.ynu.wanli.user.mapper.UserAccountMapper;
import com.ynu.wanli.user.mapper.UserAddrMapper;
import com.ynu.wanli.user.mapper.UserCarMapper;
import com.ynu.wanli.user.mapper.UserContMapper;
import com.ynu.wanli.user.mapper.UserDriverMapper;
import com.ynu.wanli.user.mapper.UserOrderMapper;
import com.ynu.wanli.user.mapper.UserPassMapper;
import com.ynu.wanli.user.mapper.UserRotationMapper;
import com.ynu.wanli.user.mapper.UserTicketMapper;
import com.ynu.wanli.user.mapper.UserUserMapper;
import com.ynu.wanli.user.service.UserService;
import com.ynu.wanli.utils.MyResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserUserMapper userMapper;
    @Resource
    private UserAccountMapper accountMapper;
    @Resource
    private UserPassMapper userPassMapper;
    @Resource
    private UserContMapper userContMapper;
    @Resource
    private UserAddrMapper userAddrMapper;
    @Resource
    private UserOrderMapper userOrderMapper;
    @Resource
    private UserRotationMapper userRotationMapper;
    @Resource
    private UserCarMapper userCarMapper;
    @Resource
    private UserDriverMapper userDriverMapper;
    @Resource
    private UserTicketMapper userTicketMapper;
    @Override
    public List<UserUser> UserLogin(String userName, String pwd) {
        MyResult result = new MyResult();
        QueryWrapper<UserUser> userQuery = new QueryWrapper<>();
        userQuery.eq("userAccount",userName);
        userQuery.eq("userPwd",pwd);
        List<UserUser> users = userMapper.selectList(userQuery);
        result.setData(users);
        System.out.println(users);
        return users;
    }

    @Override
    public MyResult register(UserRegisterDto userRegister) {
        MyResult result = new MyResult();
        UserUser user = new UserUser();
        QueryWrapper<UserUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount", userRegister.getAccount());
        List<UserUser> users = userMapper.selectList(queryWrapper);
        if(users.size()>0){
            result.setCode("0000");
            result.setMsg("该用户已经注册，请换个账号注册！");
        }else{
            user.setUserAccount(userRegister.getAccount());
            user.setUserPhone(userRegister.getPhone());
            user.setUserName(userRegister.getUserName());
            user.setUserEmail(userRegister.getEmail());
            user.setUserPwd(userRegister.getPassword());
            int insert = userMapper.insert(user);
            if (insert>0){
                result.setCode("1111");
                result.setMsg("注册成功！");
                result.setData(userRegister.getAccount());
            }
        }
        return result;
    }

    @Override
    public List<UserAccount> getUserAccountList(Long id) {
        QueryWrapper<UserAccount> query = new QueryWrapper<>();
        query.eq("userId", id);
        List<UserAccount> userAccounts = accountMapper.selectList(query);
        return userAccounts;
    }

    @Override
    public UserUser getMyMess(Long id) {
        QueryWrapper<UserUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId",id);
        UserUser user = userMapper.selectOne(queryWrapper);
        return user;
    }

    @Override
    public int reviseMyMess(@RequestParam UserUser user, HttpSession session) {
        UserUser userUser = new UserUser();
        userUser.setUserAccount(user.getUserAccount());
        userUser.setUserPhone(user.getUserPhone());
        userUser.setUserName(user.getUserName());
        userUser.setUserEmail(user.getUserEmail());
        userUser.setUserCode(user.getUserCode());
        userUser.setUserBirth(user.getUserBirth());
        userUser.setUserSex(user.getUserSex());
        QueryWrapper<UserUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId",session.getAttribute("userNameId"));
        int i = userMapper.update(userUser,queryWrapper);
        return i;
    }

    @Override
    public List<UserPass> getUserPass(HttpSession session) {
        QueryWrapper<UserPass> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("passUser",session.getAttribute("userNameId"));
        List<UserPass> userPasses = userPassMapper.selectList(queryWrapper);
        return userPasses;
    }

    @Override
    public UserPass getUserPassById(String id) {
        QueryWrapper<UserPass> queryWrapper = new QueryWrapper<>();
        QueryWrapper<UserPass> passId = queryWrapper.eq("passId", id);
        UserPass userPass = userPassMapper.selectOne(passId);
        return userPass;
    }

    @Override
    public int updatePassenger(UserPass userPass) {
        UserPass pass = new UserPass();
        pass.setPassName(userPass.getPassName());
        pass.setPassPhone(userPass.getPassPhone());
        pass.setPassCode(userPass.getPassCode());
        pass.setPassSex(userPass.getPassSex());
        QueryWrapper<UserPass> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("passId",userPass.getPassId());
        int i = userPassMapper.update(pass,queryWrapper);
        return i;
    }

    @Override
    public int deletePassenger(String passId) {
        UserPass pass = new UserPass();
        pass.setPassId(passId);
        long passLong = Long.parseLong(passId);
        int delete = userPassMapper.deletePassById(passLong);
        return delete;
    }

    @Override
    public List<UserCont> getMyContacts(String contUser) {
        QueryWrapper<UserCont> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("contUser", contUser);
        List<UserCont> userConts = userContMapper.selectList(queryWrapper);
        return userConts;
    }

    @Override
    public List<UserAddr> getMyAddress(String addrUser) {
        QueryWrapper<UserAddr> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("addrUser", addrUser);
        List<UserAddr> userAddrs = userAddrMapper.selectList(queryWrapper);
        return userAddrs;
    }

    @Override
    public List<UserOrder> getMyOrder(String orderUser, String state) {
        QueryWrapper<UserOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderUser", orderUser);
        if (!state.equals("all")){
            queryWrapper.eq("orderState",state);
        }
        List<UserOrder> userOrders = userOrderMapper.selectList(queryWrapper);
        return userOrders;
    }

    @Override
    public UserOrder getOrderById(String id) {
        QueryWrapper<UserOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderId",id);
        UserOrder userOrder = userOrderMapper.selectOne(queryWrapper);
        return userOrder;
    }

    @Override
    public String getTimeDifferce(Long id) {
        String timeDifferce = userOrderMapper.getTimeDifferce(id);
        return timeDifferce;
    }

    @Override
    public List<UserRotation> getRotation() {
        QueryWrapper<UserRotation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("rotationState","0");
        List<UserRotation> rotations = userRotationMapper.selectList(queryWrapper);
        return rotations;
    }

    @Override
    public List<UserCar> getCarList() {
        QueryWrapper<UserCar> queryWrapper = new QueryWrapper<>();
        List<UserCar> userCars = userCarMapper.selectList(queryWrapper);
        return userCars;
    }

    @Override
    public UserDriver getDriverById(String id) {
        QueryWrapper<UserDriver> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("driverId",id);
        UserDriver driver = userDriverMapper.selectOne(queryWrapper);
        return driver;
    }

    @Override
    public int updateOrder(UpdateOrder updateOrder) {
        UserOrder userOrder = new UserOrder();
        userOrder.setOrderPerson(updateOrder.getOrderId());
        userOrder.setOrderState("0");
        QueryWrapper<UserOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderId",updateOrder.getOrderId());
        int update = userOrderMapper.update(userOrder, queryWrapper);
        return update;
    }

    @Override
    public UserCar getCarById(String id) {
        QueryWrapper<UserCar> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("carId",id);
        UserCar userCar = userCarMapper.selectOne(queryWrapper);
        return userCar;
    }

    @Override
    public List<UserTicket> getTicketNum() {
        QueryWrapper<UserTicket> queryWrapper = new QueryWrapper<>();
        List<UserTicket> tickets = userTicketMapper.selectList(queryWrapper);
        return tickets;
    }

    @Override
    public String insertMyOrder(OrderDto orderDto,HttpSession session) {
        UserOrder order = new UserOrder();
        String format = "yyyy-MM-dd HH:mm:ss";
        order.setOrderUser((String) session.getAttribute("userNameId"));
        order.setOrderCard(orderDto.getCarCard());
        order.setOrderVipSite(orderDto.getVip());
        order.setOrderOrdinary(orderDto.getOrdinary());
        order.setOrderNoSite(orderDto.getNos());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date startDate = null,endDate = null;
        try {
            startDate = simpleDateFormat.parse(orderDto.getStartTime());
            endDate = simpleDateFormat.parse(orderDto.getEndTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        order.setOrderStartTime(startDate);
        order.setOrderEndTime(endDate);
        order.setOrderState("1");
        userOrderMapper.insert(order);
        String Id = String.valueOf(order.getOrderId());
        return Id;
    }

}
