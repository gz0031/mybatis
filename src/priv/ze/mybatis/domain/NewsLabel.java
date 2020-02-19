package priv.ze.mybatis.domain;

import java.util.Set;

/**
 * ClassName:newslabel
 * Package:priv.ze.mybatis.domain
 *自关联
 * @date:2019/11/20 21:41
 */
public class NewsLabel {
    private int id;//栏目id
    private String name;//栏目名称
    private int pid;//此栏目父栏目id
    private Set<NewsLabel> children;//子栏目
    private NewsLabel parent;//父栏目

    @Override
    public String toString() {
        return "NewsLabel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", children=" + children +
                ", parent=" + parent +
                '}';
    }

    public NewsLabel getParent() {
        return parent;
    }

    public void setParent(NewsLabel parent) {
        this.parent = parent;
    }

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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Set<NewsLabel> getChildren() {
        return children;
    }

    public void setChildren(Set<NewsLabel> children) {
        this.children = children;
    }

}
