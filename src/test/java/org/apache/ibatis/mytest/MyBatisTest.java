package org.apache.ibatis.mytest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mytest.mapper.IdDO;
import org.apache.ibatis.mytest.mapper.IdMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description:
 * @author: xiaohaotian
 * @date: 2023/7/14 14:08
 */
public class MyBatisTest {

  @Test
  public void teststart() throws IOException {
    InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
    SqlSession sqlSession = new SqlSessionFactoryBuilder().build(resourceAsStream).openSession();
    IdMapper mapper = sqlSession.getMapper(IdMapper.class);
    List<IdDO> select = mapper.select();
    System.out.println(select);
  }

}
