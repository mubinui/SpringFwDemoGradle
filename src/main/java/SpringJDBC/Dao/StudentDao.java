package SpringJDBC.Dao;

import SpringJDBC.Entities.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);
    public int update(Student student);
    public int delete(int id);
    public Student  display(int id);
    public List<Student> displayAll();


}
