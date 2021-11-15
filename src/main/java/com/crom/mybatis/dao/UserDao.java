package com.crom.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import com.crom.mybatis.entity.UserDTO;

@Mapper
public interface UserDao {
    UserDTO get(Integer id);
}
