package dao;

import org.hibernate.annotations.Target;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.*;
import pojo.Person;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class PersonDaoImplTest {
    DaoImplPerson daoImplPerson = new DaoImplPerson();

    @Test
    public void step1_createOrUpdate(){
        Person person = new Person();
        person.setName("Bob");
        person.setEmail("bob@m.ru");
        daoImplPerson.saveOrUpdate(person);
        assertTrue(person.getId()>0);
    }

    @Test
    public void step2_load(){
        Person person = daoImplPerson.find(1L);
        System.out.println(person.getId());
        assertNotNull(person);
    }

    @Test
    public void step3_update(){
        daoImplPerson.update(1L, "Charli");
        assertEquals(daoImplPerson.find(1L).getName(), "Charli");
    }

    @Test
    public void step4_delete(){
        daoImplPerson.delete(1L);
        Person person = daoImplPerson.find(1L);
        assertNull(person);
    }



}
