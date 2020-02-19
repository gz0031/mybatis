package priv.ze.mybatis.domain;

/**
 * ClassName:test1
 * Package:priv.ze.mybatis.domain
 *
 * @date:2020/1/29 18:17
 */
public class test1 {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "test1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
