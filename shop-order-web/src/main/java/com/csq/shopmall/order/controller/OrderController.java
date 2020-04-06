package com.csq.shopmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.csq.shopmall.bean.UserAddress;
import com.csq.shopmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/3/22 23:04
 */
@Controller
public class OrderController {

    @Reference
    private UserService userService;

    @RequestMapping("trade")
    public String trade(){
        return "index";
    }

    @RequestMapping("findaddress")
    @ResponseBody
    public List<UserAddress> findAddress(String userId){
        return userService.getUserAddressList(userId);
    }

}
