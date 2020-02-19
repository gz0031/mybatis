package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.mapper.Test1Mapper;

/**
 * ClassName:test1Impl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2020/1/29 18:23
 */
public class test1Impl {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        Test1Mapper test1Mapper = sqlSession.getMapper(Test1Mapper.class);
        System.out.println(test1Mapper.selectByID(10));
    }
}
