package priv.ze.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import priv.ze.mybatis.domain.Student;
import java.util.List;

/**
 * ClassName:StudentMapper
 * Package:priv.ze.mybatis.mapperDao
 *
 * @date:2019/11/10 17:34
 */

//定义mapper
public interface StudentMapper {

//    返回值类型是resultType的类型,没有返回值为void,对于pojo类型的数据要根据是单个还是多个进行相应的判断
//    参数类型是parameterType
//    参数的数量均为1个

//    此时的@Param("stuID")表示传入的参数s表示的是stuID
    Student getByStuID(@Param("stuID") String s) throws Exception;

    List<Student> getAll() throws  Exception;

    void save(Student s) throws Exception;

    void deleteone(String tel) throws Exception;

    void updateone(Student s) throws Exception;

    List<Student> findByMajor(String s) throws Exception;

 }

