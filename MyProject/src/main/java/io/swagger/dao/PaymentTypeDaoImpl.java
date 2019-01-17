package io.swagger.dao;

import io.swagger.model.PaymentType;
import org.hibernate.SessionFactory;
import  org.hibernate.query.Query ;
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
        log.info("Call find() by PaymentType");
        return openSession().createQuery("from PaymentType").list();
    }

//    @Override
    public void save(T item) {
        log.info("Call save() by PaymentType");
        openSession().saveOrUpdate(item);
    }


    @Override
    public PaymentType get(Serializable id){
        log.info("Call get() by PaymentType");
        return (PaymentType) openSession().get(tClass, id);
    }

    public void update(T item) {
        log.info("Call update() by PaymentType");
        openSession().update(item);
    }

    public void delete(T item) {
        log.info("Call delete() by PaymentType");
        openSession().delete(item);
    }

    public List<T> findByCriteria(String findCriteria){
        log.info("Call findByCriteria() by PaymentType");


        String hql = "SELECT PT.id, PT.name, PT.href, PT.paymentDate, PMT.id, PMT.href, PMT.type "+
                "FROM PaymentType as PT JOIN PT.PaymentMethodType as PMT "+
                "WHERE PT.paymentMethod like : f_paymentMethod";

        Query query = openSession().createQuery(hql);
        query.setParameter("f_paymentMethod", findCriteria);

        return query.list();
    }


}
