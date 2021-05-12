package LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public List<String> ind;

    public Pepsi() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getInd() {
        return ind;
    }

    public void setInd(List<String> ind) {
        this.ind = ind;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                ", ind=" + ind +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method->Interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method ->Interface");

    }
}
