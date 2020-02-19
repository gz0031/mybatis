package priv.ze.mybatis.mapper;

import priv.ze.mybatis.domain.Minister1;

/**
 * ClassName:MinisterMapper
 * Package:priv.ze.mybatis.mapper
 *
 * @date:2019/11/20 20:08
 */
public interface MinisterMapper {
    Minister1 selectMinisterById(int Cid);
}
