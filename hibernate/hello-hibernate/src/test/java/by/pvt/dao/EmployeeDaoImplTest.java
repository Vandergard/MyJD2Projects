package by.pvt.dao;

import by.pvt.pojo.Address;
import by.pvt.pojo.Department;
import by.pvt.pojo.Employee;
import by.pvt.pojo.EmployeeDetails;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Iterator;
import java.util.Set;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoImplTest {

    DaoImpl<Employee> employeeDao;
    DaoImpl<Department> departmentDao;

    @Before
    public void setUp(){
        employeeDao = new DaoImpl<>(Employee.class);
        departmentDao = new DaoImpl<>(Department.class);
        DaoImpl.isTestInstance = true;

    }

    @Test
    public void step1_createEmployee(){
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
        department1.setEmployees(Set.of(employee1));

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

        employeeDao.saveOrUpdate(employee1);
        employeeDao.saveOrUpdate(employee2);
        employeeDao.saveOrUpdate(employee3);

        assertTrue(employee1.getId()==1L);
        assertTrue(employee2.getId()==2L);
        assertTrue(employee3.getId()==3L);

    }

//    @Test
//    public void step2_deleteEmployee(){
//        Employee employee1 = employeeDao.find(1L);
//        Department department = departmentDao.find(employee1.getDepartment().getId());
//        Set<Employee> employees = department.getEmployees();
//        Iterator<Employee> iterator = employees.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().getId() == 1L){
//                iterator.remove();
//            }
//        }
//
//
//        department.setEmployees(employees);
//        departmentDao.saveOrUpdate(department);
//
//        employeeDao.delete(employee1.getId());
//
//        Employee employee2 = employeeDao.find(1L);
//
//        assertNull(employee2);
//    }

    @Test
    public void step2_udateEmployees(){
        assertTrue(true);
    }

    @Ignore
    public void step3_deleteEmployees(){
        employeeDao.delete(2L);
        employeeDao.delete(1L);
//        employeeDao.delete(2L);
        employeeDao.delete(3L);
    }

    @After
    public void tierDown(){
        DaoImpl.isTestInstance =true;
        employeeDao = null;

    }
}
