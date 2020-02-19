package priv.ze.mybatis.domain;

/**
 * ClassName:Student1
 * Package:priv.ze.domain
 *
 * @date:2019/11/10 14:37
 */
public class Student1 {

    String username;
    String stuID;
    String pwd;
    String tel;

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "username='" + username + '\'' +
                ", stuId='" + stuID + '\'' +
                ", pwd='" + pwd + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
