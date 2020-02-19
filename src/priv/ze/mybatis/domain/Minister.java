package priv.ze.mybatis.domain;

/**
 * ClassName:Minister
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/20 17:57
 */
public class Minister {
    String mid;
    String Cid;
    String name;

    @Override
    public String toString() {
        return "Minister{" +
                "mid='" + mid + '\'' +
                ", Cid='" + Cid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
