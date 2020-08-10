package com.mozat.service.impl;

import com.mozat.bean.User;
import com.mozat.dao.UserDao;
import com.mozat.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
