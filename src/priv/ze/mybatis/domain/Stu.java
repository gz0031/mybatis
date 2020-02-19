package priv.ze.mybatis.domain;

import java.util.Set;

/**
 * ClassName:Stu
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/21 16:03
 */
public class Stu {
    private int stuid;
    private String stuname;

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", courses=" + courses +
                '}';
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    private Set<Course> courses;
}
