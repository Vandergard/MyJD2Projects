package io.swagger.dao;

import io.swagger.model.PaymentType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class BaseDaoImpl<T> {

    @Autowired
    SessionFactory sessionFactory;

    public abstract List<T> find();

    public boolean add(List<T> items){
        return false;
    }

    Session openSession(){
        return sessionFactory.getCurrentSession();
    }


}
