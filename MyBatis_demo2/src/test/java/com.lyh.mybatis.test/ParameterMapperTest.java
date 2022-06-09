package com.lyh.mybatis.test;

import com.lyh.mybatis.mapper.ParameterMapper;
import com.lyh.mybatis.pojo.TUser;
import com.lyh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/05/18:09
 */
public class ParameterMapperTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        TUser user = mapper.selectUser();
        System.out.println(user);
    }
    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<TUser> allUser = mapper.getAllUser();
        allUser.forEach(user -> System.out.println(user));
    }
}
