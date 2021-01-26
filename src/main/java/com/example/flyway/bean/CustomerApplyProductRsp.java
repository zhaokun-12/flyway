package com.example.flyway.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/1/22
 * @Version 1.0
 **/
@Data
public class CustomerApplyProductRsp extends CustomerApply implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer customerType;

    private String saleUserId;

    private String saleUserName;

    private List applyProductList;

    private Integer pageNum;

    private Integer pageSize;

    /**
     * 数据权限
     */
    private List<Long> customerIdList;

    /**
     *是否拥有全数据权限(0:否 1:是)
     */
    private Integer authorityStatus;
}
