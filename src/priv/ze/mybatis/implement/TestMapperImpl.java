package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.test;
import priv.ze.mybatis.mapper.TestMapper;

/**
 * ClassName:TestMapperImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/24 13:46
 */
public class TestMapperImpl implements TestMapper {
    @Override
    public int insert(test t){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TestMapper testMapper=sqlSession.getMapper(TestMapper.class);
        int i=testMapper.insert(t);
        sqlSession.commit();
        return i;
    }

    @Override
    public test selectByPojo(test t){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        TestMapper testMapper=sqlSession.getMapper(TestMapper.class);
        return testMapper.selectByPojo(t);
    }

    public static void main(String[] args){
        test test1= new test();
        test1.setId(3);
        test1.setStuName("李");
        TestMapperImpl testMapper=new TestMapperImpl();
        System.out.println(testMapper.insert(test1));
    }
}
