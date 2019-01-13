package io.swagger.dao;

import io.swagger.model.AccountRefType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class AccountRefTypeDaoImpl<T> extends BaseDaoImpl {
    private static Logger log = Logger.getLogger(AccountRefTypeDaoImpl.class.getName());

    private Class<AccountRefType> tClass = AccountRefType.class;

    @Autowired
    public AccountRefTypeDaoImpl (SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> find() {
        log.info("Call find() by AccountRefType");
        return openSession().createQuery("from AccountRefType").list();
    }

//    @Override
    public void save(T item){
        log.info("Call save() by AccountRefType");
        openSession().saveOrUpdate(item);
    }

    @Override
    public AccountRefType get(Serializable id){
        log.info("Call get() by AccountRefType");
        return (AccountRefType)openSession().get(tClass, id);
    }

}
