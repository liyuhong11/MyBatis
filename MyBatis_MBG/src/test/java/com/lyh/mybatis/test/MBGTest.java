package com.lyh.mybatis.test;

import com.lyh.mybatis.mapper.EmpMapper;
import com.lyh.mybatis.pojo.Emp;
import com.lyh.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: lyhstart
 * @Date: 2022/06/07/17:51
 */
public class MBGTest {
    @Test
    public void testMBG(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sessionFactory.openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //1查询所有数据
            //List<Emp> emps = mapper.selectByExample(null);
            //emps.forEach(emp -> System.out.println(emp));
            //2条件查询
            EmpExample empExample = new EmpExample();
            //创建条件对象，通过andXXX方法为SQL添加查询添加，每个条件之间是and关系
            empExample.createCriteria().andEmpNameLike("a").andAgeGreaterThan(20).andDidIsNotNull();
            //将之前添加的条件通过or拼接其他条件
            empExample.or().andSexEqualTo("男");
            List<Emp> list = mapper.selectByExample(empExample);
            for (Emp emp : list) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
