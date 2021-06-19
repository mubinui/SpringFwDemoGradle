package SpringJDBC.Entities;

public class Student {
    private int id;
    private String name;
    private String dept;
    private String city;

    public Student(){

    }

    public Student( String name, String dept, String city) {
        this.name = name;
        this.dept = dept;
        this.city = city;
    }

    public Student(int id, String name, String dept, String city) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.city = city;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Dept='" + dept + '\'' +
                ", City='" + city + '\''
                ;
    }
}
