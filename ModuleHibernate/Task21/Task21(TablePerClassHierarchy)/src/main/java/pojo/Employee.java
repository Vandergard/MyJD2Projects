package pojo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "EMPLOYEE")
@DiscriminatorValue("E")
public class Employee extends Person{
    private static final long serialVersionUID = 4L;

    private String company;
    private Double salary;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
