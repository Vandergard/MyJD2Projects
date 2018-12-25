package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private ThreadLocal<Session> threadLocal = new ThreadLocal<>();
    private static SessionFactory sessionFactory;
    private static HibernateUtil hibernateUtil;

    private HibernateUtil(){
        try{
            sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();

        }
        catch( Exception e){
            e.printStackTrace();
        }
    }

    public static HibernateUtil getInstance() {
        if (hibernateUtil == null) {
            hibernateUtil = new HibernateUtil();
        }
        return hibernateUtil;
    }

    public static Session getSession(){
        return sessionFactory.openSession();
    }

}
