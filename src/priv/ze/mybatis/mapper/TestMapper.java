package priv.ze.mybatis.mapper;

import priv.ze.mybatis.domain.test;

/**
 * ClassName:TestMapper
 * Package:priv.ze.mybatis.mapper
 *
 * @date:2019/11/24 13:37
 */
public interface TestMapper {
     int insert(test t);
     test selectByPojo(test t);
}
