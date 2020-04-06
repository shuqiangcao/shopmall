package com.csq.shopmall.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.csq.shopmall.bean.UserAddress;
import com.csq.shopmall.bean.UserInfo;
import com.csq.shopmall.service.UserService;
import com.csq.shopmall.user.mapper.UserAddressMapper;
import com.csq.shopmall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/3/22 18:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }
}
