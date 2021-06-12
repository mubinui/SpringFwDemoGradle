package SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teacher")
public class Teacher {
    @Value("#{20+30}")
    private int x ;
    @Value("#{1>0? 10:10}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(25.00)}") //Calling value from
    private double z;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{ new java.lang.String('Mubin UIC')}")
    private String name;
    //We can use any datatype like this
    @Value("#{new java.lang.Boolean(true)}")
    private boolean flag;

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

    public double getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
