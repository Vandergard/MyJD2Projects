package io.swagger.dao;


import io.swagger.model.PaymentMethodType;
import io.swagger.model.PaymentType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class PaymentMethodTypeDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(PaymentMethodTypeDaoImpl.class.getName());

    private Class<PaymentMethodType> tClass = PaymentMethodType.class;

    @Autowired
    public PaymentMethodTypeDaoImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<PaymentMethodType> find(){
        log.info("Call find() by PaymentMethodType");
        return openSession().createQuery("from PaymentMethodType").list();
    }

    public void save(T item){
        log.info("Call save() by PaymentMethodType");
        openSession().save(item);
    }

    public PaymentMethodType get(Serializable id){
        log.info("Call get() by PaymentMethodType");
        return (PaymentMethodType)openSession().get(tClass, id);
    }

    public List<PaymentMethodType> getbyType(String paymentMethodType){
        log.info("Call getByType() by PaymentMethodType");
        String query = "from PaymentMethodType type where type.name like'" + paymentMethodType + "'";
        return openSession().createQuery(query).list();
    }
}
