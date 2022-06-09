package com.lyh.mybatis.mapper;

import com.lyh.mybatis.pojo.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/06/13:47
 */
public interface SelectMapper {

    List<TUser> getTUser(@Param("id1") Integer id1,@Param("id2") Integer id2);
}
