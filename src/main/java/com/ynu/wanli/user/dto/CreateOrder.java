package com.ynu.wanli.user.dto;

import com.ynu.wanli.user.entity.UserCar;
import com.ynu.wanli.user.entity.UserCont;
import com.ynu.wanli.user.entity.UserOrder;
import com.ynu.wanli.user.entity.UserPass;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class CreateOrder implements Serializable {
    private UserCar userCar;
    private UserOrder userOrder;
    private List<UserPass> passes;
    private List<UserCont> contacts;
}
