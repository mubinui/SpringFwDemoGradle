package XMLRemoving;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages ="XMLRemoving")
public class JavaConfig {
    // Replacement of XML configuration
    @Bean
    public Samosa getSamosa(){


        return new Samosa();
    }

    @Bean(name ={"student","temp","con"})
    public Student getStudent(){
        //Creating a new Student Object
        Student student = new Student(getSamosa());
        return student;
    }

}
