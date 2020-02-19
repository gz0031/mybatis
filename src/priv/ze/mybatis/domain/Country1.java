package priv.ze.mybatis.domain;

/**
 * ClassName:Country1
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/20 20:10
 */
public class Country1 {
    String cname;
    String countryid;

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "Country1{" +
                "cname='" + cname + '\'' +
                ", countryid='" + countryid + '\'' +
                '}';
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }
}
