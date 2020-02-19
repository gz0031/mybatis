package priv.ze.mybatis.domain;

/**
 * ClassName:Minister1
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/20 20:10
 */
public class Minister1 {
    int mid;
    String name;
    String Cid;
    Country1 country;

    @Override
    public String toString() {
        return "Minister1{" +
                "mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                ", Cid='" + Cid + '\'' +
                ", country=" + country +
                '}';
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public Country1 getCountry() {
        return country;
    }

    public void setCountry(Country1 country) {
        this.country = country;
    }
}
