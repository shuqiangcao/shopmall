package com.csq.shopmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @ClassName BaseCatalog1
 * @Description TODO
 * @Author caoshuqiang
 * @Date 2020/4/6 23:28
 */
@Data
public class BaseCatalog1 implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String name;
}
