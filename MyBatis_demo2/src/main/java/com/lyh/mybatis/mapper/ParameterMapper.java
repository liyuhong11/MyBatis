package com.lyh.mybatis.mapper;

import com.lyh.mybatis.pojo.TUser;


import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/05/17:51
 */
public interface ParameterMapper {

    TUser selectUser();
    List<TUser> getAllUser();
}
