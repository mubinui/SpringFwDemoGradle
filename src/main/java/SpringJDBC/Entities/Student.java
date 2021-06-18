package SpringJDBC.Entities;

public class Student {
    private int id;
    private String name;
    private String Dept;
    private String city;

    public Student(){

    }

    public Student(int id, String name, String dept, String city) {
        this.id = id;
        this.name = name;
        Dept = dept;
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
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
