package io.swagger.dao;


import io.swagger.model.RelatedPartyRefType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class RelatedPartyRefTypeDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(RelatedPartyRefTypeDaoImpl.class.getName());

    private Class<RelatedPartyRefType> tClass = RelatedPartyRefType.class;

    @Autowired
    public RelatedPartyRefTypeDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<RelatedPartyRefType> find(){
        log.info("Call find() by RelatedPartyRefType");
        return openSession().createQuery("from RelatedPartyRefType").list();
    }

    public void save(T item){
        log.info("Call save() by RelatedPartyRefType");
        openSession().save(item);
    }

    public RelatedPartyRefType get(Serializable id){
        log.info("Call find() by RelatedPartyRefType");
        return (RelatedPartyRefType)openSession().get(tClass, id);
    }

}
