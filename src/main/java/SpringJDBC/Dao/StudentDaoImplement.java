package SpringJDBC.Dao;

import SpringJDBC.Entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImplement implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        //Insertion operation
        String query = "INSERT INTO students(name,dept,city) VALUES(?,?,?)";
        int rows_affected = this.jdbcTemplate.update(query,student.getName(),student.getDept(),student.getCity());
        return rows_affected;
    }



    @Override
    public int update(Student student) {
        //update operation
        String query = "UPDATE students SET name = ? , dept = ? , city = ? WHERE id = ?";
        int rows_affected = this.jdbcTemplate.update(query,student.getName(),student.getDept(),student.getCity(),student.getId());
        return rows_affected;
    }

    @Override
    public int delete(int id ) {
        // Delete operation
        String query = "DELETE FROM students WHERE id = ? ";
        int rows_affected = this.jdbcTemplate.update(query,id);
        return rows_affected;
    }

    @Override
    public Student display(int id ) {
        RowMapperImplement row = new RowMapperImplement();
        String query = "SELECT * FROM students WHERE id = ?";
        Student student = (Student) this.jdbcTemplate.queryForObject(query,row,id);
        //query for object
        //query row_mapper_implement
        return  student;

    }

    @Override
    public List<Student> displayAll() {
        RowMapperImplement row = new RowMapperImplement();
        String query = "SELECT * FROM students";
        List<Student> students = this.jdbcTemplate.query(query,row);
        //For getting a list only query

        return students;

    }
}
