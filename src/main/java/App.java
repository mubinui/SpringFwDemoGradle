import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
        Student student = (Student)context.getBean("s");
//        Setter Injection
        System.out.println(student);
        System.out.println("----->");
        Student student1 = (Student)context.getBean("student01");
//        p schema -> Construnter injection
        System.out.println(student1);
    }
}
