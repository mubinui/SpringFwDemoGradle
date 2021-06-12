package XMLRemoving;

import org.springframework.stereotype.Component;

//@Component("student")

public class Student {
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void  study(){
        System.out.println("Student is studying ");
        this.samosa.display();
    }

}
