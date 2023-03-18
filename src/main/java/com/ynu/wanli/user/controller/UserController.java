package com.ynu.wanli.user.controller;

import com.ynu.wanli.user.dto.CreateOrder;
import com.ynu.wanli.user.dto.OrderDetails;
import com.ynu.wanli.user.dto.OrderDto;
import com.ynu.wanli.user.dto.UpdateOrder;
import com.ynu.wanli.user.dto.UserLoginDto;
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
import com.ynu.wanli.user.service.UserService;
import com.ynu.wanli.utils.MyResult;
import com.ynu.wanli.utils.VerifyCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    private String userCarId;
    @Resource
    private UserService userService;
    //跳转到首页
    @GetMapping("/index")
    public ModelAndView toIndex(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping("/toDetails")
    public ModelAndView toDetails(HttpServletRequest request,ModelAndView modelAndView){
        String carId = request.getParameter("carId");
        UserCar car = userService.getCarById(carId);
        UserDriver driver = userService.getDriverById(car.getCarPerson());
        List<UserTicket> ticketNum = userService.getTicketNum();
        car.setCarPersonName(driver.getDriverName());
        modelAndView.addObject("carMess",car);
        modelAndView.addObject("ticketNum",ticketNum);
        modelAndView.setViewName("proinfo");
        return modelAndView;
    }
    @PostMapping("/addOrder")
    @ResponseBody
    public MyResult addOrder(@RequestBody OrderDto orderDto,HttpSession session){
        MyResult result = new MyResult();
        String orderId = userService.insertMyOrder(orderDto, session);
        userCarId=orderDto.getCarId();
        if (orderId==null){
            result.setCode("0000");
            result.setMsg("加入订单失败，请重新登陆后重试！");
            return result;
        }
        result.setData(orderId);
        result.setCode("1111");
        return result;
    }
    @GetMapping("/viewOrder")
    public ModelAndView viewOrder(HttpServletRequest request,ModelAndView modelAndView,HttpSession session){
        MyResult result = new MyResult();
        CreateOrder createOrder = new CreateOrder();
        String carId = request.getParameter("carId");
        String orderId = request.getParameter("orderId");
        UserCar car = userService.getCarById(carId);
        UserOrder order = userService.getOrderById(orderId);
        List<UserPass> passes = userService.getUserPass(session);
        List<UserCont> contacts = userService.getMyContacts(order.getOrderUser());
        createOrder.setUserCar(car);
        createOrder.setUserOrder(order);
        createOrder.setPasses(passes);
        createOrder.setContacts(contacts);
        modelAndView.addObject("createOrder",createOrder);
        modelAndView.setViewName("viewOrder");
        return modelAndView;
    }
    @PostMapping("/toOrderDetails")
    public ModelAndView toOrderDetails(@RequestBody OrderDetails orderDetails, ModelAndView modelAndView,HttpSession session){
        CreateOrder createOrder = new CreateOrder();
        UserOrder order = userService.getOrderById(orderDetails.getOrderId());
        createOrder.setUserOrder(order);
        UserCar userCar = new UserCar();
        userCar.setCarCard(orderDetails.getCarCard());
        createOrder.setUserCar(userCar);
        UserCar car = userService.getCarById(userCarId);
        List<UserPass> passes = userService.getUserPass(session);
        List<UserCont> contacts = userService.getMyContacts(order.getOrderUser());
        createOrder.setUserCar(car);
        createOrder.setUserOrder(order);
        createOrder.setPasses(passes);
        createOrder.setContacts(contacts);
        if (order.getOrderState().equals("1")) {//就要去支付
            modelAndView.addObject("createOrder",createOrder);
            modelAndView.setViewName("viewOrder");
        }else{
            modelAndView.addObject("viewOrder",createOrder);
            modelAndView.setViewName("orderDetails");
        }
        return modelAndView;
    }
    @GetMapping("/getRotation")
    @ResponseBody
    public MyResult getRotation(){
        MyResult result = new MyResult();
        List<UserRotation> rotations = userService.getRotation();
        if (rotations.size()<1){
            result.setCode("0000");
            result.setMsg("系统出现异常，请刷新重试！");
            return result;
        }
        result.setCode("1111");
        result.setData(rotations);
        return result;
    }
    @PostMapping("/getCarList")
    @ResponseBody
    public MyResult getCarList(){
        MyResult result = new MyResult();
        List<UserCar> carList = userService.getCarList();
        if (carList.size()<1){
            result.setCode("0000");
            result.setMsg("系统出现异常，请刷新重试！");
            return result;
        }
        for (int i = 0; i < carList.size(); i++) {
            String driverId = carList.get(i).getCarPerson();
            UserDriver driver = userService.getDriverById(driverId);
            carList.get(i).setCarPersonName(driver.getDriverName());
        }
        result.setCode("1111");
        result.setData(carList);
        return result;
    }
    //执行注册操作
    @PostMapping("/register")
    @ResponseBody
    public MyResult doRegister(@RequestBody UserRegisterDto userMess,HttpSession session){
        MyResult result;
        result = userService.register(userMess);
        session.setMaxInactiveInterval(60*2);
        return result;
    }

    public static void main(String[] args) {

    }
    //跳转到登录界面
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/toBuy",method = RequestMethod.POST)
    @ResponseBody
    public MyResult result(@RequestBody UpdateOrder updateOrder){
        MyResult result = new MyResult();
        int i = userService.updateOrder(updateOrder);
        if (i<1){
            result.setCode("0000");
            result.setMsg("购买失败！");
            return result;
        }
        result.setCode("1111");
        return result;
    }
    //登录相关操作
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doLogin(@RequestBody UserLoginDto user, HttpSession session){
        MyResult result = new MyResult();
        Object reqCode = session.getAttribute("reqCode");
        if (reqCode==null){
            result.setCode("9998");
            result.setMsg("验证码过期，请刷新页面！");
            return result;
        }else{
            String reqCodeStr = (String) reqCode;
            if (!reqCodeStr.equalsIgnoreCase(user.getReqCode())){
                result.setCode("9999");
                result.setMsg("验证码错误，请重新输入！");
                return result;
            }
        }
        List<UserUser> userUsers = userService.UserLogin(user.getUserName(), user.getUserPwd());
        if (userUsers.size()==0){
            result.setCode("0000");
            result.setMsg("用户名或密码错误！");
            return result;
        }
        session.setAttribute("userName",userUsers.get(0).getUserName());
        session.setAttribute("userNameId",userUsers.get(0).getUserId());
        session.setMaxInactiveInterval(60*30);
        result.setCode("1111");
        return result;
    }
    //退出登录
    @RequestMapping(value = "/logOut",method = RequestMethod.GET)
    public String logOut(HttpSession session){
        session.invalidate();   //销毁session
        return "index";     //跳转到首页
    }
    //跳转到个人中心页面
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public ModelAndView toAboutMe(ModelAndView modelAndView){
        modelAndView.setViewName("about");
        return modelAndView;
    }
    //跳转到“常用乘客信息”页面
    @RequestMapping(value = "/contacts",method = RequestMethod.GET)
    public ModelAndView contacts(ModelAndView modelAndView){
        modelAndView.setViewName("contacts");
        return modelAndView;
    }
    @RequestMapping(value = "/doContacts",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doContacts(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserCont> contacts = userService.getMyContacts((String) userId);
        if (contacts.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到常用联系人信息！");
            return result;
        }
        result.setCode("1111");
        result.setData(contacts);
        return result;
    }
    //跳转到“常用联系人”页面
    @RequestMapping(value = "/toAccount",method = RequestMethod.GET)
    public String toAccount(){
        return "account";
    }
    @RequestMapping(value = "/doAccount",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doAccount(HttpSession session){
        MyResult result = new MyResult();
        List<UserAccount> userAccountList = userService.getUserAccountList(Long.parseLong((String) session.getAttribute("userNameId")));
        if (userAccountList.size()==0){
            result.setCode("0000");
            result.setMsg("未查询到订单信息！");
            return result;
        }
        result.setCode("1111");
        result.setData(userAccountList);
        return result;
    }
    //跳转到“常用地址”页面
    @RequestMapping(value = "/address",method = RequestMethod.GET)
    public ModelAndView address(ModelAndView modelAndView){
        modelAndView.setViewName("address");
        return modelAndView;
    }
    @RequestMapping(value = "/doAddress",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doAddress(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserAddr> myAddress = userService.getMyAddress((String) userId);
        if (myAddress.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到常用地址信息！");
            return result;
        }
        result.setCode("1111");
        result.setData(myAddress);
        return result;
    }
    //跳转到“我的信息”页面
//    @RequestMapping(value = "/editMess",method = RequestMethod.GET)
//    public String editMess(){
//        return "editMess";
//    }
    @RequestMapping(value = "/toEditMess",method = RequestMethod.GET)
    public ModelAndView doEditMess(ModelAndView modelAndView,HttpSession session){
        String userMess = (String) session.getAttribute("userNameId");
        UserUser user = userService.getMyMess(Long.parseLong(userMess));
        modelAndView.addObject("userMess",user);
        modelAndView.setViewName("editMess");
        return modelAndView;
    }
    @RequestMapping(value = "/doEditMess",method = RequestMethod.POST)
    @ResponseBody
    public MyResult toEditMess(@RequestBody UserUser user,HttpSession session){
        MyResult result = new MyResult();
        if (userService.reviseMyMess(user,session)>0){
            session.setAttribute("userName",user.getUserName());
            result.setCode("1111");
        }else{
            result.setCode("0000");
            result.setMsg("修改失败，请尝试重新登陆后再试！");
        }
        return result;
    }
    //跳转到订单页面
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public ModelAndView order(ModelAndView modelAndView){
        modelAndView.setViewName("order");
        return modelAndView;
    }
    @RequestMapping(value = "/doOrder",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doOrder(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserOrder> myOrder = userService.getMyOrder((String) userId,"all");
        if (myOrder.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到我的订单信息！");
            return result;
        }
        result.setCode("1111");
        for (int i = 0; i < myOrder.size(); i++) {
            Long orderId = myOrder.get(i).getOrderId().longValue();
            String[] timeDifferce = userService.getTimeDifferce(orderId).split(":");
            Integer hours = Integer.valueOf(timeDifferce[0]);
            Integer minute = Integer.valueOf(timeDifferce[1]);
            myOrder.get(i).setTimeDifferce(hours+"时"+minute+"分");
        }
        result.setData(myOrder);
        return result;
    }
    @RequestMapping(value = "/doTravelOrder",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doTravelOrder(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserOrder> myOrder = userService.getMyOrder((String) userId,"0");
        if (myOrder.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到未出行订单信息！");
            return result;
        }
        result.setCode("1111");
        for (int i = 0; i < myOrder.size(); i++) {
            Long orderId = myOrder.get(i).getOrderId().longValue();
            String[] timeDifferce = userService.getTimeDifferce(orderId).split(":");
            Integer hours = Integer.valueOf(timeDifferce[0]);
            Integer minute = Integer.valueOf(timeDifferce[1]);
            myOrder.get(i).setTimeDifferce(hours+"时"+minute+"分");
        }
        result.setData(myOrder);
        return result;
    }
    @RequestMapping(value = "/doUnpaidOrder",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doUnpaidOrder(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserOrder> myOrder = userService.getMyOrder((String) userId,"1");
        if (myOrder.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到未支付订单信息！");
            return result;
        }
        result.setCode("1111");
        for (int i = 0; i < myOrder.size(); i++) {
            Long orderId = myOrder.get(i).getOrderId().longValue();
            String[] timeDifferce = userService.getTimeDifferce(orderId).split(":");
            Integer hours = Integer.valueOf(timeDifferce[0]);
            Integer minute = Integer.valueOf(timeDifferce[1]);
            myOrder.get(i).setTimeDifferce(hours+"时"+minute+"分");
        }
        result.setData(myOrder);
        return result;
    }
    @RequestMapping(value = "/doCommOrder",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doCommOrder(HttpSession session){
        MyResult result = new MyResult();
        Object userId = session.getAttribute("userNameId");
        if (userId==null){
            result.setCode("9999");
            result.setMsg("登录已过期，请重新登录后再试！");
            return result;
        }
        List<UserOrder> myOrder = userService.getMyOrder((String) userId,"2");
        if (myOrder.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到未支付订单信息！");
            return result;
        }
        result.setCode("1111");
        for (int i = 0; i < myOrder.size(); i++) {
            Long orderId = myOrder.get(i).getOrderId().longValue();
            String[] timeDifferce = userService.getTimeDifferce(orderId).split(":");
            Integer hours = Integer.valueOf(timeDifferce[0]);
            Integer minute = Integer.valueOf(timeDifferce[1]);
            myOrder.get(i).setTimeDifferce(hours+"时"+minute+"分");
        }
        result.setData(myOrder);
        return result;
    }
    @RequestMapping(value = "/toEditPass",method = RequestMethod.GET)
    public String toEditPass(HttpServletRequest request,HttpSession session){
        String userPassId = request.getParameter("userPassId");
        session.setMaxInactiveInterval(60);
        session.setAttribute("userPassId",userPassId);
        return "editPass";
    }
    @RequestMapping(value = "/doEditPass",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doEditPass(HttpSession session){
        MyResult result = new MyResult();
        String userPassId = (String) session.getAttribute("userPassId");
        UserPass userPassById = userService.getUserPassById(userPassId);
        if (userPassById==null){
            result.setCode("0000");
            result.setMsg("获取信息失败，请尝试重新登陆后再试！");
            return result;
        }
        result.setCode("1111");
        result.setData(userPassById);
        return result;
    }
    @RequestMapping(value = "/deletePass",method = RequestMethod.POST)
    @ResponseBody
    public MyResult deletePass(@RequestBody String passId){
        MyResult result = new MyResult();
        System.out.println(passId);
        if (passId==null){
            result.setCode("9999");
            result.setMsg("请求出错，请刷新页面后重试！");
            return result;
        }
        String[] string = passId.split("passId%3D");
        int i = userService.deletePassenger(string[1]);
        if (i<0){
            result.setCode("0000");
            result.setMsg("修改信息失败，请尝试重新登陆后再试！");
            return result;
        }
        result.setCode("1111");
        return result;
    }
    @RequestMapping(value = "/editPass",method = RequestMethod.POST)
    @ResponseBody
    public MyResult editPass(@RequestBody UserPass userPass, HttpSession session){
        MyResult result = new MyResult();
        String userPassId = (String) session.getAttribute("userPassId");
        if (userPassId==null){
            result.setCode("9999");
            result.setMsg("请求出错，请刷新页面后重试！");
            return result;
        }
        userPass.setPassId(userPassId);
        int i = userService.updatePassenger(userPass);
        if (i<0){
            result.setCode("0000");
            result.setMsg("修改信息失败，请尝试重新登陆后再试！");
            return result;
        }
        result.setCode("1111");
        return result;
    }
    @RequestMapping(value = "/passenger",method = RequestMethod.GET)
    public ModelAndView passenger(ModelAndView modelAndView){
        modelAndView.setViewName("passenger");
        return modelAndView;
    }
    @RequestMapping(value = "/doPassenger",method = RequestMethod.POST)
    @ResponseBody
    public MyResult doPassenger(HttpSession session){
        MyResult result = new MyResult();
        List<UserPass> userPassList = userService.getUserPass(session);
        if (userPassList.size()<1){
            result.setCode("0000");
            result.setMsg("未查询到乘客信息！");
            return result;
        }
        result.setCode("1111");
        result.setData(userPassList);
        return result;
    }
    //获取验证码
    @GetMapping("/reCode")
    public void getReCode(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String text = VerifyCodeUtil.generateVerifyCode(4);
        //验证码放入session
        session.setAttribute("reqCode", text);
        //验证码存入图片
        response.setContentType("image/png");
        ServletOutputStream outputStream = response.getOutputStream();
        VerifyCodeUtil.outputImage(105, 45, outputStream, text);
    }

}
