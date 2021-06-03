package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeConfig.xml");
        Student s = (Student)context.getBean("student");
        System.out.println(s);
        System.out.println(s.hashCode());



        Student s1 = context.getBean("student",Student.class);
        System.out.println(s1.hashCode());


        //Scope xml
        System.out.println("=>Teacher objects hashcode ");

        Teacher t1 = (Teacher) context.getBean("teacher");
        Teacher t2 = (Teacher) context.getBean("teacher");
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());


    }
}
