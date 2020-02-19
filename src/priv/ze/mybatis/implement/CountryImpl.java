package priv.ze.mybatis.implement;

import org.apache.ibatis.session.SqlSession;
import priv.ze.mybatis.Utils.MybatisUtils;
import priv.ze.mybatis.domain.Country;
import priv.ze.mybatis.mapper.CountryMapper;

/**
 * ClassName:CountryImpl
 * Package:priv.ze.mybatis.implement
 *
 * @date:2019/11/20 18:21
 */
public class CountryImpl implements CountryMapper {
    private CountryMapper countryMapper;
    @Override
    public Country selectCountryById(int countryid) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        countryMapper= sqlSession.getMapper(CountryMapper.class);
        return countryMapper.selectCountryById(countryid);
    }

    public static void main(String[] args) {
        CountryImpl country=new CountryImpl();
        Country country1 = country.selectCountryById(2);
        System.out.println(country1);
    }
}
