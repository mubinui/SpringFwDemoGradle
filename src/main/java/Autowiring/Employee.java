package Autowiring;

public class Employee {
    private Address address;

    public Employee() {
    }

    public Address getAddress() {
        System.out.println("->Constructor Running ");
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
