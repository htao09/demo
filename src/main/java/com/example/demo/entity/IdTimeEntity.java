package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IdTimeEntity implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;
}
