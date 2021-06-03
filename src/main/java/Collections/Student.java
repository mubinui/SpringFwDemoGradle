package Collections;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Student {
    private String name;
    private int id;
    private String dept;
    private List<String> depBooks;
    private Set<String> exams;
    private Properties login;

    public Student() {
    }

    public Student(String name, int id, String dept, List<String> depBooks, Set<String> exams, Properties login) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.depBooks = depBooks;
        this.exams = exams;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getDepBooks() {
        return depBooks;
    }

    public void setDepBooks(List<String> depBooks) {
        this.depBooks = depBooks;
    }

    public Set<String> getExams() {
        return exams;
    }

    public void setExams(Set<String> exams) {
        this.exams = exams;
    }

    public Properties getLogin() {
        return login;
    }

    public void setLogin(Properties login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                ", depBooks=" + depBooks +
                ", exams=" + exams +
                ", login=" + login +
                '}';
    }
}
