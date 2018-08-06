package com.ailife.module.user.dao;


import com.ailife.module.user.bean.User;

import java.util.List;

public interface UserDao {


    int insert(User record);



    List<User> selectUsers();
}