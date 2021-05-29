package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
        Employee e = (Employee) context.getBean("employee");
        System.out.println(e);
    }
}
