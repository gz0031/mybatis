package priv.ze.mybatis.mapper;

import priv.ze.mybatis.domain.NewsLabel;

/**
 * ClassName:newslabel
 * Package:priv.ze.mybatis.mapper
 *
 * @date:2019/11/20 21:39
 */
public interface newslabelMapper {
    NewsLabel selectSonByParent(int pid);
    NewsLabel selectParentByChildren(int id);
}
