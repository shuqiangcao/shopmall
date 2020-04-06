package com.csq.shopmall.service;

import com.csq.shopmall.bean.BaseAttrInfo;
import com.csq.shopmall.bean.BaseCatalog1;
import com.csq.shopmall.bean.BaseCatalog2;
import com.csq.shopmall.bean.BaseCatalog3;

import java.util.List;

/**
 * @ClassName ManageService
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/4/6 23:43
 */
public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

}
