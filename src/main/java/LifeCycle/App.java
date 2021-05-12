package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
//        Samosa samosa = (Samosa) context.getBean("s1");
//        System.out.println(samosa);
//        Pepsi p1 = (Pepsi) context.getBean("pepsi");
//        System.out.println(p1);
        Chocolate chocolate = (Chocolate) context.getBean("c1");
        System.out.println(chocolate);
        context.registerShutdownHook();




    }
}
