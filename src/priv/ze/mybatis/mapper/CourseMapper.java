package priv.ze.mybatis.mapper;

import priv.ze.mybatis.domain.Course;

/**
 * ClassName:CourseMapper
 * Package:priv.ze.mybatis.mapper
 *
 * @date:2019/11/21 16:06
 */
public interface CourseMapper {
    Course selectByCourse(int courseid);
}
