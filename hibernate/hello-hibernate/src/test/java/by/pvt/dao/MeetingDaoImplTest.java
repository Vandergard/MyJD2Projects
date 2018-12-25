package by.pvt.dao;

import by.pvt.pojo.Employee;
import by.pvt.pojo.Meeting;
import by.pvt.pojo.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

import static junit.framework.TestCase.assertNull;
import static junit.framework.TestCase.assertTrue;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MeetingDaoImplTest {

    DaoImpl<Meeting> meetingDao;
    DaoImpl<Employee> employeeDao;

    @Before
    public void setUp(){
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        meetingDao = new DaoImpl<>(Meeting.class);
        employeeDao = new DaoImpl<>(Employee.class);
        DaoImpl.isTestInstance = true;


        lock.unlock();
    }


    @Test
    public void step1_createInstance(){
        Employee employee1 = createEmployee("1");


        employeeDao.saveOrUpdate(employee1);

        Employee employee2 = createEmployee("2");

        employeeDao.saveOrUpdate(employee2);

        Employee employee3 = createEmployee("3");

        employeeDao.saveOrUpdate(employee3);

        Employee employee4 = createEmployee("4");
        employeeDao.saveOrUpdate(employee4);

        Meeting meeting1 = createMeeting("1");
//        Meeting meeting2 = createMeeting("2");

        meeting1.setAttendies(Set.of(employee1,employee2));
        meeting1.setOrganiser(employee1);
        meetingDao.saveOrUpdate(meeting1);
        assertTrue(meeting1.getId()>0);

        Meeting meeting2 = createMeeting("2");
        meeting2.setOrganiser(employee4);
        meeting2.setAttendies(Set.of(employee1, employee2, employee3, employee4));
        meetingDao.saveOrUpdate(meeting2);
        assertTrue(meeting2.getId()>0);

    }

    private Meeting createMeeting (String postfix){
        Meeting meeting = new Meeting();
        meeting.setSubject("Subject" + postfix);
        meeting.setDateTime(Calendar.getInstance().getTime());
        meeting.setStatus(Status.NEW);

        return  meeting;
    }

    private Employee createEmployee (String postfix){
        Employee employee = new Employee();
        employee.setFirstName("FirstName"+ postfix);
        employee.setLastName("LastName"+postfix);
        return employee;
    }

    @Test
    public void step2_deleteInstance(){
        meetingDao.delete(1L);
        meetingDao.delete(2L);
        assertNull(meetingDao.find(1L));
        assertNull(meetingDao.find(2L));

    }


    @After
    public void tierDown(){
        DaoImpl.isTestInstance = false;
    }

}
