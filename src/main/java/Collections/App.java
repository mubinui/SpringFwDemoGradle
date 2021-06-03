package Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Student s = (Student) context.getBean("student");
        System.out.println(s);



    }
}
