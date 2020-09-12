package com.hzy.mapper;

import com.hzy.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUserList();
    int addUser(User user);

}
