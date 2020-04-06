package com.csq.shopmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.csq.shopmall.bean.BaseCatalog1;
import com.csq.shopmall.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @ClassName ManageController
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/4/5 19:39
 */
@Controller
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        return manageService.getCatalog1();
    }
}
