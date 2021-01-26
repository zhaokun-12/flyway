package com.example.flyway.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/1/12
 * @Version 1.0
 **/
@Data
@Accessors(chain = true)
@TableName(value = "user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer userAge;
}
