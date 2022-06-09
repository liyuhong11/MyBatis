package com.lyh.mybatis.mapper;

import com.lyh.mybatis.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/05/10:32
 */
public interface UserMapper {
    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserByid();
    List<User> getAllUser();
}
