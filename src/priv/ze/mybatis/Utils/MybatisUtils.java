package priv.ze.mybatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:priv.ze.mybatis.Utils.MybatisUtils
 * Package:PACKAGE_NAME
 *
 * @date:2019/11/19 20:03
 */
public class MybatisUtils {
    //多个mapper可以公用一个SqlSession
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession(){
        //      通过config来得到SqlSession
        String resource= "config/mybatis-config.xml";
        try {
            InputStream inputStream= Resources.getResourceAsStream(resource);
            if(sqlSessionFactory==null){
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            }
            return sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
