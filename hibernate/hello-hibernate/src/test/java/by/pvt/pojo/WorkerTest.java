package by.pvt.pojo;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import by.pvt.util.TestData;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.*;

import by.pvt.util.HibernateUtil;

/**
 * @author alve
 */
public class WorkerTest {

    Session session;

    @Before
    public void setUp() throws Exception {
        session = HibernateUtil.getInstance().getTestSession();
    }

    @Test
    public void createInstance() {
        Worker worker = createWorker("");


        try {
            session.beginTransaction();
            session.saveOrUpdate(worker);
            session.getTransaction().commit();
            assertNotNull(worker.getId());
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

    }

    private Worker createWorker(String suffix){
        if(suffix == null) suffix="";

        Worker worker = new Worker();
        worker.setName("Worker");
        worker.setSecondName("Worker2");
        worker.setCompanyName("OOO Romashka");
        worker.setSalary(BigDecimal.valueOf(Math.random()*1000.00+500));
        return worker;

    }

    @Test
    public void testCriteria(){
        @TestData
        Worker worker1 = createWorker("1");
        @TestData
        Worker worker2 = createWorker("2");
        @TestData
        Worker worker3 = createWorker("3");
        @TestData
        Worker worker4 = createWorker("4");

        try {
            session.beginTransaction();
            session.saveOrUpdate(worker1);
            session.saveOrUpdate(worker2);
            session.saveOrUpdate(worker3);
            session.saveOrUpdate(worker4);
            session.getTransaction().commit();
            assertNotNull(worker1.getId());
            assertNotNull(worker2.getId());
            assertNotNull(worker3.getId());
            assertNotNull(worker4.getId());
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

//        session = HibernateUtil.getInstance().getTestSession();

      Criteria criteria = session.createCriteria(Worker.class);
        criteria.add(Restrictions.ge("salary", new BigDecimal(1000.00)));
        List list = criteria.list();

        System.out.println(list);

        criteria = session.createCriteria(Worker.class);
        criteria.setProjection(Projections.rowCount());
        System.out.println(criteria.list());

    }

    @After
    public void tearDown() throws Exception {
        if (session != null && session.isOpen()) {
            session.close();
            session = null;
        }
    }
}