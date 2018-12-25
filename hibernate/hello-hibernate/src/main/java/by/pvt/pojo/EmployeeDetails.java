package by.pvt.pojo;

public class EmployeeDetails {

    private long id;
    private String positon;
    private Address address;
    private String privateNr;
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPrivateNr() {
        return privateNr;
    }

    public void setPrivateNr(String privateNr) {
        this.privateNr = privateNr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
