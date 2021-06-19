package SpringJDBC;

import SpringJDBC.Dao.StudentDao;
import SpringJDBC.Entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBCCon.xml");
        StudentDao sd = (StudentDao) context.getBean("studentDao");
        while(true){
            System.out.println("🎈🎈Welcome to Student Management System 🎭");
            System.out.println(" 📲 Press => [1] For inserting new Student");
            System.out.println(" 📲 Press => [2] For update existing Student");
            System.out.println(" 📲 Press => [3] For delete Student ");
            System.out.println(" 📲 Press => [4] For Display Single Student ");
            System.out.println(" 📲 Press => [5] For Display All Student ");
            System.out.println(" 📲 Press => [6] For Exit the System ");
            System.out.println(" 🌐 Insert a number here => ");
            String y = br.readLine();
            int x = Integer.parseInt(y);

            if (x == 1){
                System.out.println(" 📲 Input Student Name ");
                String name = br.readLine();
                System.out.println(" 📲 Input Student Dept (Example (CSE,EEE))");
                String dept = br.readLine();
                System.out.println(" 📲 Input Student City ");
                String city = br.readLine();
                Student student = new Student(name,dept,city);
                int row_affected = sd.insert(student);
                if (row_affected>0){
                    System.out.println(" 🥦 Insertion Successful");
                }

            }
            else if (x==2){
                System.out.println(" 📲 Input New Name ");
                String name = br.readLine();
                System.out.println(" 📲 Input Changed Dept (Example (CSE,EEE))");
                String dept = br.readLine();
                System.out.println(" 📲 Input New City ");
                String city = br.readLine();
                System.out.println(" 📲 Input Id of the Student ");
                int id = Integer.parseInt(br.readLine());
                Student student = new Student(id,name,dept,city);
                int row_affected = sd.update(student);
                if (row_affected>1){
                    System.out.println(" 🥦 Update Successful !");
                }

            }
            else if (x == 3){
                System.out.println(" 📲 Input Id of the Student ");
                int id = Integer.parseInt(br.readLine());
                int row_affected = sd.delete(id);
                if (row_affected>1){
                    System.out.println(" 🥦 Deletion Successful !");
                }

            }
            else if (x ==4 ){
                System.out.println(" 📲 Input Id of the Student ");
                int id = Integer.parseInt(br.readLine());
                Student student = sd.display(id);
                System.out.println(student);


            }
            else if (x == 5 ){
                List<Student> students = sd.displayAll();
                for(Student s : students){
                    System.out.println(s);
                }

            }
            else if (x == 6 ){
                System.out.println("🍟🍟 See You Again !");
                break;

            }
            else {
                System.out.println("❌ Input valid Number");
                continue;
            }


        }


    }
}
