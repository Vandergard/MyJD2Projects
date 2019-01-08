package io.swagger.dao;

import io.swagger.model.PaymentType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class PaymentTypeDaoImpl<T> extends BaseDaoImpl{

    private static Logger log = Logger.getLogger(PaymentTypeDaoImpl.class.getName());

    private Class<PaymentType> tClass = PaymentType.class;

    @Autowired
    public PaymentTypeDaoImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> find() {
        log.info("Call find()");
        return openSession().createQuery("from PaymentType").list();
    }

    public void save(T item) {
        openSession().saveOrUpdate(item);
    }



    public PaymentType get(Serializable id){
        return (PaymentType)openSession().get(tClass, id);
    }

}
