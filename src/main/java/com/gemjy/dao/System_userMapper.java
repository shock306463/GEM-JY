package com.gemjy.dao;

import com.gemjy.pojo.System_user;

public interface System_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(System_user record);

    int insertSelective(System_user record);

    System_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(System_user record);

    int updateByPrimaryKey(System_user record);
}