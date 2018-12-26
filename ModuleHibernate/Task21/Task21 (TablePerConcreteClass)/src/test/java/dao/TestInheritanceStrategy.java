package dao;
import org.hibernate.annotations.Target;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.*;
import pojo.Adress;
import pojo.Employee;
import pojo.Person;
import pojo.Student;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class TestInheritanceStrategy {
    DaoImplPerson daoImplPerson = new DaoImplPerson();

    @Test
    public void step1_createOrUpdate(){
        Person person = new Person();
        person.setName("Bob");
        person.setEmail("bob@m.ru");
        Adress adress = new Adress();
        adress.setCity("Minsk");
        adress.setStreet("LiliSt");
        adress.setPostalCode("220022");
        person.setAdress(adress);

        Student student = new Student();
        student.setFaculty("FTC");
        student.setMark(7.99);

        Employee employee = new Employee();
        employee.setCompany("PVT");
        employee.setSalary((double) 10000);

        daoImplPerson.saveOrUpdate(person);
        daoImplPerson.saveOrUpdate(student);
        daoImplPerson.saveOrUpdate(employee);
        assertTrue(person.getId()>0);
        assertTrue(student.getId()>0);
        assertTrue(employee.getId()>0);
    }
}
