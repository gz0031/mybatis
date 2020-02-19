package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.NewsLabel;
import priv.ze.mybatis.mapper.newslabelMapper;

/**
 * ClassName:newslabelImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/20 21:54
 */
public class newslabelImpl implements newslabelMapper {
    @Override
    public NewsLabel selectSonByParent(int pid) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        newslabelMapper newslabelMapper=sqlSession.getMapper(newslabelMapper.class);
        return newslabelMapper.selectSonByParent(pid);
    }

    @Override
    public NewsLabel selectParentByChildren(int id) {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        newslabelMapper newslabelMapper=sqlSession.getMapper(priv.ze.mybatis.mapper.newslabelMapper.class);
        return newslabelMapper.selectParentByChildren(id);
    }

    public static void main(String[] args) {
        newslabelImpl newslabel=new newslabelImpl();
        System.out.println(newslabel.selectParentByChildren(4));
        System.out.println(newslabel.selectSonByParent(0));
    }
}
