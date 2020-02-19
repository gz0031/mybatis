package priv.ze.mybatis.domain;

/**
 * ClassName:test
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/24 13:39
 */
public class test {
    int id;
    String stuName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                ", stuName=" + stuName +
                '}';
    }
}
