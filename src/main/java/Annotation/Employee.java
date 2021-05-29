package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private String name;
    private String id;
    private String phone;
//    @Autowired
//    @Qualifier("add")
    private Address address;
//    @Autowired
//    @Qualifier("c1")
    private Car car;

    public Employee() {
    }
//  @Autowired can be used in constructor
    public Employee(String name, String id, String phone, Address address, Car car) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    @Qualifier("add")
    public void setAddress(Address address) {
        System.out.println("->Running Setter");
        this.address = address;
    }

    public Car getCar() {
        return car;
    }
    @Autowired
    @Qualifier("c1")
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                ", car=" + car +
                '}';
    }
}
