package com.lyh.mybatis.test;

import com.lyh.mybatis.mapper.ParameterMapper;
import com.lyh.mybatis.mapper.SelectMapper;
import com.lyh.mybatis.pojo.TUser;
import com.lyh.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/06/13:49
 */
public class SelectMapperTest {
    @Test
    public void selectTUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<TUser> tUser = mapper.getTUser(1,2);
        tUser.forEach(tUser1 -> System.out.println(tUser1));
    }
}
