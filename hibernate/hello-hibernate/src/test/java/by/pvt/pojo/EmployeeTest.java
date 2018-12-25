package by.pvt.pojo;

import by.pvt.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeTest {

    Session session;

    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getInstance().getTestSession();
    }

    @Test
    public void createInstance(){
        Employee employee1 = new Employee();
        employee1.setFirstName("Name1");
        employee1.setLastName("LastName1");
        employee1.setCellPhone("111111");

        Employee employee2 = new Employee();
        employee2.setFirstName("Name2");
        employee2.setLastName("LastName2");
        employee2.setCellPhone("2222222");

        Employee employee3 = new Employee();
        employee3.setFirstName("Name3");
        employee3.setLastName("LastName3");
        employee3.setCellPhone("333333");

        Department department1 = new Department();
        department1.setDepartmentName("Department1");
        department1.setEmployees(Set.of(employee1,employee2));

        Department department2 = new Department();
        department2.setDepartmentName("Department2");
        department2.setEmployees(Set.of(employee3));

        employee1.setDepartment(department1);
        employee2.setDepartment(department1);
        employee3.setDepartment(department2);

        EmployeeDetails employeeDetails1 = new EmployeeDetails();
        Address address1 = new Address("Minsk", "Lenina", "1", 101);
        address1.setOfficeNumber("111");

        employeeDetails1.setAddress(address1);
        employeeDetails1.setPositon("position1");
        employeeDetails1.setPrivateNr("ea1");
        employeeDetails1.setEmployee(employee1);
        employee1.setEmployeeDetails(employeeDetails1);

        EmployeeDetails employeeDetails2 = new EmployeeDetails();
        Address address2 = new Address("Minsk", "Lenina", "2", 102);
        address2.setOfficeNumber("222");

        employeeDetails2.setAddress(address2);
        employeeDetails2.setPositon("position2");
        employeeDetails2.setPrivateNr("ea2");
        employeeDetails2.setEmployee(employee2);
        employee2.setEmployeeDetails(employeeDetails2);

        EmployeeDetails employeeDetails3 = new EmployeeDetails();
        Address address3 = new Address("Minsk", "Lenina", "3", 103);
        address3.setOfficeNumber("333");

        employeeDetails3.setAddress(address3);
        employeeDetails3.setPositon("position3");
        employeeDetails3.setPrivateNr("ea3");
        employeeDetails3.setEmployee(employee3);
        employee3.setEmployeeDetails(employeeDetails3);


        try {
            session.beginTransaction();
            session.saveOrUpdate(employee1);
            session.saveOrUpdate(employee2);
            session.saveOrUpdate(employee3);
            session.getTransaction().commit();

            assertTrue(employee1.getId()>0);
            assertTrue(employee2.getId()>0);
            assertTrue(employee3.getId()>0);

        }
        catch(Exception e){
            e.printStackTrace();
            if(session !=null) session.getTransaction().rollback();
        }

    }

    @After
    public void tearDown() throws Exception {
        if(session != null && session.isOpen()){
            session = null;
        }
    }
}