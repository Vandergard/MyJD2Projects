package io.swagger.dao;

import io.swagger.model.PaymentItemType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class PaymentItemTypeDaoImpl<T> extends BaseDaoImpl{

    private static Logger log = Logger.getLogger(PaymentItemTypeDaoImpl.class.getName());

    private Class<PaymentItemType> tClass = PaymentItemType.class;

    @Autowired
    public PaymentItemTypeDaoImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<PaymentItemType> find(){
        log.info("Call find() by PaymentItemType");
        return openSession().createQuery("from PaymentItemType").list();
    }

    public void save(T item){
        log.info("Call save() by PaymentItemType");
        openSession().saveOrUpdate(item);
    }

    public PaymentItemType get(Serializable id){
        log.info("Call get() by PaymentItemType");
        return (PaymentItemType)openSession().get(tClass, id);
    }
}
