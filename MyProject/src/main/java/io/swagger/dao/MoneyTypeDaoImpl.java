package io.swagger.dao;

import io.swagger.model.MoneyType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;


@Repository
public class MoneyTypeDaoImpl<T> extends BaseDaoImpl{

    private static Logger log = Logger.getLogger(MoneyTypeDaoImpl.class.getName());

    private Class<MoneyType> tClass = MoneyType.class;

    @Autowired
    public MoneyTypeDaoImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<T> find(){
        log.info("Call find()  by MoneyType");
        return openSession().createQuery("from MoneyType").list();
    }

//    @Override
    public void save(T item){
        log.info("Call save() by MoneyType");
        openSession().saveOrUpdate(item);
    }

    @Override
    public MoneyType get(Serializable id){
        log.info("Call get() by MoneyType");
        return (MoneyType)openSession().get(tClass, id);
    }

}
