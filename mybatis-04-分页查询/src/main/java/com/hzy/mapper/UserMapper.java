package com.hzy.mapper;

import com.hzy.pojo.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();
    // 分页查询，需要起始下标和每一页的大小两个参数
    // 当有多个参数的时候，我们习惯用map
    // map的key存参数名，value存参数值
    List<User> getUserByLimit(Map<String,Integer> map);
    List<User> getUserByRowBounds(RowBounds rowBounds);
    List<User> getUserByPageHelper();
    int addUser(User user);

}
