package priv.ze.mybatis.domain;

/**
 * ClassName:Student
 * Package:priv.ze.domain
 *
 * @date:2019/11/8 17:12
 */
public class Student {
    String stuName;
    String stuID;
    String major;
    String direction;
    String tel;
    String state;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuID='" + stuID + '\'' +
                ", major='" + major + '\'' +
                ", direction='" + direction + '\'' +
                ", tel='" + tel + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
