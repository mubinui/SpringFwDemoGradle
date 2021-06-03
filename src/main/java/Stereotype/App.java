package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereotypeConfig.xml");
        Student s = (Student) context.getBean("st");
        System.out.println(s);
    }
}
