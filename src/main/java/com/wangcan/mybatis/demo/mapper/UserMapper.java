package com.wangcan.mybatis.demo.mapper;

import com.wangcan.mybatis.demo.domain.User;

public interface UserMapper {
    User select(Integer id);
}
