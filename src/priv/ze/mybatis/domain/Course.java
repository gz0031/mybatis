package priv.ze.mybatis.domain;

import java.util.Set;

/**
 * ClassName:Course
 * Package:priv.ze.mybatis.domain
 *
 * @date:2019/11/21 16:02
 */
public class Course {
    private int courseid;
    private String coursename;
    private Set<Stu> students;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                ", students=" + students +
                '}';
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }



    public Set<Stu> getStudents() {
        return students;
    }

    public void setStudents(Set<Stu> students) {
        this.students = students;
    }
}
