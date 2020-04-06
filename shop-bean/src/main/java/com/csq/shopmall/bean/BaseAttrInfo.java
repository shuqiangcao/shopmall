package com.csq.shopmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName BaseAttrInfo
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/4/6 23:32
 */
@Data
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;
}
