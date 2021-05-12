package LifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.List;
import java.util.Set;
import java.util.Vector;
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

public class Chocolate {
    private double prize;
    private List<String> ing;
    private List<String> size;
    private Vector<String> cocoQuality;

    public Chocolate() {
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public List<String> getIng() {
        return ing;
    }

    public void setIng(List<String> ing) {
        this.ing = ing;
    }

    public List<String> getSize() {
        return size;
    }

    public void setSize(List<String> size) {
        this.size = size;
    }

    public Vector<String> getCocoQuality() {
        return cocoQuality;
    }

    public void setCocoQuality(Vector<String> cocoQuality) {
        this.cocoQuality = cocoQuality;
    }
    @PostConstruct
    public void init(){
        //Java EE annotation
        System.out.println("Init Method ->Annotation");

    }
    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy Method ->Annotation");


    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "prize=" + prize +
                ", ing=" + ing +
                ", size=" + size +
                ", cocoQuality=" + cocoQuality +
                '}';
    }
}
