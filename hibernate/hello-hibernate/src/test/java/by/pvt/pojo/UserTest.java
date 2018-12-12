package by.pvt.pojo;


import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.*;

import by.pvt.util.HibernateUtil;
import java.sql.Timestamp;


public class UserTest {

    Session session;

    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getInstance().getTestSession();
    }

    @Test
    public void createInstance(){
        User user = new User();

        user.setUserName("User");
        user.setEmail("mail@mail.ru");

        UserDetails userDetails = new UserDetails();
        userDetails.setUserPassword("password");

        userDetails.setLoginAttemps(3);
        userDetails.setExpiredDate(new Timestamp(System.currentTimeMillis()));

        user.setUserDetails(userDetails);
        userDetails.setUser(user);

        try{
            session.beginTransaction();
            session.saveOrUpdate(user);
            session.saveOrUpdate(userDetails);
            session.getTransaction().commit();
            assertTrue(user.getId()>0);
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
