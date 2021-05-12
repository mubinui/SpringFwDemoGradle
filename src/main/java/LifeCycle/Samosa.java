package LifeCycle;

public class Samosa {
    private double prize;
    private String rLocation;

    public Samosa() {
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getrLocation() {
        return rLocation;
    }

    public void setrLocation(String rLocation) {
        this.rLocation = rLocation;
    }
    //signature must be public void alphanumeric
    public void init(){
        System.out.println("->Inside init method ");

    }
    public void destroy(){
        System.out.println("->Inside destroy method");

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "prize=" + prize +
                ", rLocation='" + rLocation + '\'' +
                '}';
    }
}
