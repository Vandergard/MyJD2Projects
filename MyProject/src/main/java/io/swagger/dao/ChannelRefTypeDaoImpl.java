package io.swagger.dao;

import io.swagger.model.ChannelRefType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ChannelRefTypeDaoImpl<T> extends BaseDaoImpl{
    private static Logger log = Logger.getLogger(ChannelRefTypeDaoImpl.class.getName());

    private Class<ChannelRefType> tClass = ChannelRefType.class;

    @Autowired
    public ChannelRefTypeDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<T> find(){
        log.info("Call find() by ChannelRefType");
        return openSession().createQuery("from ChannelRefType").list();
    }

//    @Override
    public void save(T item){
        log.info("Call save() by ChannelRefType");
        openSession().saveOrUpdate(item);
    }

    @Override
    public ChannelRefType get(Serializable id){
        log.info("Call get() by ChannelRefType");
        return (ChannelRefType)openSession().get(tClass, id);
    }
}
