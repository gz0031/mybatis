package priv.ze.mybatis.implement;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.Student;
import priv.ze.mybatis.mapper.StudentMapper;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:StudentImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/10 17:35
 */
public class StudentImpl {

    public Student getByStuID(String s) throws Exception {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        //创建StudentMapper对象，mybatis自动生成mapper代理对象(也就是帮助实现mapper接口)
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        //调用StudentMapper的方法
        Student student= studentMapper.getByStuID(s);
        return student;
    }

    public List<Student> findByMajor(String s) throws Exception {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        List list= studentMapper.findByMajor(s);
        return list;
    }

    public static void main(String[] args) throws Exception {
        StudentImpl student=new StudentImpl();
        Student student1= student.getByStuID("04183184");
        System.out.println(student1);
    }
}
