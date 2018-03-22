package com.test.service;

import com.test.dao.UserMapper;
import com.test.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(String id){
        return userMapper.selectByPrimaryKey(id);
    }
}
