package priv.ze.mybatis.implement;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import priv.ze.mybatis.domain.Student1;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:Test01
 * Package:priv.ze.test
 *
 * @date:2019/10/18 18:31
 */
public class Test01 {
    public static void main(String[] args) {
         SqlSession sqlSession=null;
        try {
            String resource= "config/mybatis-config.xml";
            InputStream inputStream= Resources.getResourceAsStream(resource);
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
            //开启事务
            sqlSession=factory.openSession();
            //sqlSession用来执行sql语句，且openSession()被执行，事务自动提交自动关闭
//            查询单个人
//            Student student=sqlSession.selectOne("getByStuID","04183184");
//            System.out.println(student);
//            查询quan'bu'r全部人
//            List<Student> studentList=sqlSession.selectList("getAll");
//            System.out.println(studentList);

//            插入人
//            Student student=new Student();
//            student.setStuID("111111111");
//            student.setStuName("asdf");
//            student.setMajor("软工");
//            student.setTel("1311336111");
//            student.setState("已报名");
//            student.setDirection("后台");
//            System.out.println(student);
//            sqlSession.insert("priv.ze.domain.Student1.save",student);

////删除一个人
//            int i= sqlSession.delete("deleteone","4");
//            System.out.println(i);

//            修改一个人
            Student1 s=new Student1();
            s.setTel("123");
            s.setStuID("04183184");
            s.setPwd("6543210");
            s.setUsername("管理员");
            System.out.println(s);
            int i=sqlSession.update("updateone",s);
            System.out.println(i);
            sqlSession.commit();
            //手动提交事务
        } catch (IOException e){
            //手动回滚事务
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
        }finally {
            //释放资源
            if(sqlSession!=null){
                sqlSession.close();
            }
        }
    }
}
