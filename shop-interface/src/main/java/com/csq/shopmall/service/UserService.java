package com.csq.shopmall.service;

import com.csq.shopmall.bean.UserAddress;
import com.csq.shopmall.bean.UserInfo;

import java.util.List;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/3/22 17:29
 */
public interface UserService {
    /**
    *@Author caoshuqiang
    *@Description 查询所有数据
    *@Param
    *@Return
    *@Date 2020/3/22 17:31
    */
    List<UserInfo> findAll();

    /**
    *@Author caoshuqiang
    *@Description 根据用户id查询地址列表
    *@Param
    *@Return
    *@Date 2020/3/23 23:12
    */
    List<UserAddress> getUserAddressList(String userId);
}
