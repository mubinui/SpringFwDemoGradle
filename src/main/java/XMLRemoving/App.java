package XMLRemoving;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        //Java configuration handler

        Student s1 = (Student) context.getBean("student");
        System.out.println(s1);
        s1.study();


    }
}
