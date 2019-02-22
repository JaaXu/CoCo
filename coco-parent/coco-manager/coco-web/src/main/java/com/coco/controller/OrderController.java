package com.coco.controller;


import com.coco.commom.Const;
import com.coco.commom.ResponseCode;
import com.coco.commom.ServerResponse;
import com.coco.pojo.User;
import com.coco.service.OrdersService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private OrdersService ordersService;

    @ResponseBody
    @RequestMapping("create.do")
    public ServerResponse create(HttpSession session)throws Exception {
        //User user = (User) session.getAttribute(Const.CURRENT_USER);
        User user = new User();
        user.setId(2);
        if (user == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
        }
            ServerResponse serverResponse= ordersService.createOrder(user.getId());
        System.out.println(serverResponse.toString());
        return serverResponse;
    }
    @RequestMapping("cancel.do")
    @ResponseBody
    public ServerResponse cancel(HttpSession session, Long orderNo){
        //User user = (User)session.getAttribute(Const.CURRENT_USER);
        User user = new User();
        user.setId(2);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        ServerResponse serverResponse=ordersService.cancel(user.getId(),orderNo);
        System.out.println(serverResponse.toString());
        return serverResponse;
    }

    @RequestMapping("detail.do")
    @ResponseBody
    public ServerResponse detail(HttpSession session,Long orderNo){
        //User user = (User)session.getAttribute(Const.CURRENT_USER);
        User user = new User();
        user.setId(2);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        ServerResponse serverResponse= ordersService.getOrderDetail(user.getId(),orderNo);
        System.out.println(serverResponse.toString());
        return serverResponse;
    }

    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse list(HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        //User user = new User();
        //user.setId(2);
        if(user ==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        ServerResponse serverResponse=  ordersService.getOrderList(user.getId());

        System.out.println(serverResponse.toString());
        return serverResponse;
    }




}
