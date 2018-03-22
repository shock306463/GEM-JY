package com.gemjy.service;

import com.gemjy.dao.System_userMapper;
import com.gemjy.pojo.System_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class System_userService {

    @Autowired
    private System_userMapper system_userMapper;

    public System_user getSystem_userByID(String id){
        return system_userMapper.selectByPrimaryKey(id);
    }

}
