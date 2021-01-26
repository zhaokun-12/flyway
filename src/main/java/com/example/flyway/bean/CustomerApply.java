package com.example.flyway.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/1/22
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CustomerApply implements Serializable {
    private static final long serialVersionUID = -685159517061122900L;

    private Long id;

    private Long customerId;

    private String customerName;

    private Long productId;

    private String productName;

    private String productFullName;

    private Long companyCode;

    private Integer applyType;

    private Integer applySource;

    private BigDecimal applyMoney;

    private Integer status;

    private Integer isDelete;

    private String referrer;

    private String remark;

    private Long userId;

    private String userName;

    private Date createTime;

    private Date updateTime;

    private String productScale;

}
