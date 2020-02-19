package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.Course;
import priv.ze.mybatis.mapper.CourseMapper;

/**
 * ClassName:CourseImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/21 16:01
 */
public class CourseImpl implements CourseMapper {
    @Override
    public Course selectByCourse(int courseid) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        CourseMapper courseMapper=sqlSession.getMapper(CourseMapper.class);
        return courseMapper.selectByCourse(courseid);
    }

    public static void main(String[] args) {
        CourseImpl courseMapper=new CourseImpl();
        Course course= courseMapper.selectByCourse(1);
        System.out.println(course);
    }
}
