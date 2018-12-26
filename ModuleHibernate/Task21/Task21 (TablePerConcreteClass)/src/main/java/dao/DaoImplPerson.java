package dao;

import org.hibernate.Session;
import pojo.Person;
import util.HibernateUtil;

import java.io.Serializable;

public class DaoImplPerson {

    HibernateUtil hibernateUtil = HibernateUtil.getInstance();



    public Person saveOrUpdate (Person person){
        Session session = hibernateUtil.getSession();
        try{
            session.beginTransaction();
            session.saveOrUpdate(person);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return person;
    }


    public Person find(Serializable id){
        Session session = hibernateUtil.getSession();
        session.beginTransaction();
        Person p = null;
        try{
            p = (Person)session.get(Person.class, id);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
        return p;
    }


    public void update(Serializable id, String name){
        Session session = hibernateUtil.getSession();
        try{
            session.beginTransaction();
            Person person = session.get(Person.class, id);
            person.setName(name);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }
    }
    public void delete(Serializable id){
        Session session = hibernateUtil.getSession();
        try{
            session.beginTransaction();
            Person p = session.get(Person.class, id);
            session.delete(p);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
            session.close();
        }

    }


}
