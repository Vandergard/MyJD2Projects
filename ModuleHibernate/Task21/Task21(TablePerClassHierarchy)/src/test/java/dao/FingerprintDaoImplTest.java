package dao;
import org.junit.Test;
import pojo.Fingerprint;
import pojo.Person;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FingerprintDaoImplTest {

    DaoImpl<Fingerprint> daoImpl = new DaoImpl<>(Fingerprint.class);
    DaoImplPerson daoImplPerson = new DaoImplPerson();

    @Test
    public void idTest(){
        Fingerprint fingerprint = new Fingerprint();
        Person person = new Person();

        fingerprint= daoImpl.saveOrUpdate(fingerprint);
        System.out.println(fingerprint.getId());
        person = daoImplPerson.saveOrUpdate(person);
        System.out.println(person.getId());





    }
}
