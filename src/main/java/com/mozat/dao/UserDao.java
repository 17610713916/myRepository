package com.mozat.dao;


import com.mozat.bean.User;

public interface UserDao {

    User findById(int id);
}
