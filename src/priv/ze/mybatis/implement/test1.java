package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.test;
import priv.ze.mybatis.mapper.TestMapper;

/**
 * ClassName:test
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/24 15:59
 */
public class test1 {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TestMapper testMapper=sqlSession.getMapper(TestMapper.class);
        test test1=new test();
        test1.setId(3);
        test1.setStuName("李");
        System.out.println(testMapper.selectByPojo(test1));
    }
}
