package com.hzy.mapper;

import com.hzy.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
    List<User> getUserByNameAndPassword(@Param("username") String username,@Param("password") String password);
    // List<User> getUserByNameAndPassword(Map map);

    int addUser(User user);
    int beachAddUser(List<User> list);

}
