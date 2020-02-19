package priv.ze.mybatis.mapper;

import priv.ze.mybatis.domain.Country;


/**
 * ClassName:CountryMapper
 * Package:priv.ze.mybatis.mapper
 *
 * @date:2019/11/20 17:59
 */
public interface CountryMapper {
    Country selectCountryById(int countryid);
}
