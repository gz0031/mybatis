package priv.ze.mybatis.domain;

import java.util.Set;

/**
 * ClassName:Country
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/20 17:56
 */
public class Country {
    String cname;
    String countryid;
    Set<Minister> ministers;

    public String getCname() {
        return cname;
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

    public Set<Minister> getMinisters() {
        return ministers;
    }

    public void setMinisters(Set<Minister> ministers) {
        this.ministers = ministers;
    }

    @Override
    public String toString() {
        return "Country{" +
                "cname='" + cname + '\'' +
                ", countryid='" + countryid + '\'' +
                ", ministers=" + ministers +
                '}';
    }
}
