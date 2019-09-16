package com.wangcan.mybatis.demo.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private GenderEnum gender;
    private EnableEnum  enable;
}
