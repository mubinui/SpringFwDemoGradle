package SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {
    @Value("#{10+30}")
    private int x ;
    @Value("#{1>0? 10:10}")
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
