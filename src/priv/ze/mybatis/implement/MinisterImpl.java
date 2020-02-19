package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.Minister;
import priv.ze.mybatis.domain.Minister1;
import priv.ze.mybatis.mapper.MinisterMapper;

/**
 * ClassName:MinisterImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/20 20:21
 */
public class MinisterImpl implements MinisterMapper {
    @Override
    public Minister1  selectMinisterById(int Cid) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        MinisterMapper ministerMapper= sqlSession.getMapper(MinisterMapper.class);
        return ministerMapper.selectMinisterById(Cid);
    }

    public static void main(String[] args) {
        MinisterImpl minister=new MinisterImpl();
        Minister1 minister1 = minister.selectMinisterById(2);
        System.out.println(minister1);
    }
}
