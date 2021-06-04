package SpringExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("SpELconfig.xml");
        Citizen citizen = con.getBean("c1",Citizen.class);
        System.out.println(citizen);

        System.out.println("----------->>>>--------->>>>---------->>>");

        Teacher t = con.getBean("teacher",Teacher.class);
        System.out.println(t);

    }
}
