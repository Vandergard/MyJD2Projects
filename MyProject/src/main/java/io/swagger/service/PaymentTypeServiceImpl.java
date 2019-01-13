package io.swagger.service;

//import io.swagger.Validator.Validator;
import io.swagger.dao.BaseDaoImpl;
import io.swagger.dao.MoneyTypeDaoImpl;
import io.swagger.dao.PaymentTypeDaoImpl;
import io.swagger.model.MoneyType;
import io.swagger.model.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;


@Service
@Transactional
public class PaymentTypeServiceImpl<T> extends BaseServiceImpl {


    private static Logger log = Logger.getLogger(PaymentTypeServiceImpl.class.getName());

    // Use it in method update
//    @Autowired
//    private Validator validator;


    @Autowired
    private PaymentTypeDaoImpl<T> paymentTypeDao;

    @Autowired
    private MoneyTypeDaoImpl<T> moneyTypeDao;

    @Override
    @Transactional(propagation =  Propagation.REQUIRED, readOnly = true)
    public List<T> list() {
        log.info("paymentTypeDao: " + paymentTypeDao);
        return paymentTypeDao.find();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void save(T item) {
        log.info("save(): " + item);
        paymentTypeDao.save(item);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void create(List<T> items) {
        log.info("create(): " + items);
        for (T t : items) {
            saveOne(t);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOne(T item) {
        PaymentType paymentType = (PaymentType)item;
        moneyTypeDao.save((T) paymentType.getTotalAmount());
        paymentTypeDao.save(item);


    }

    @Transactional(propagation = Propagation.REQUIRED)
    public PaymentType findId(String id){
      return paymentTypeDao.get(id);
    }

}
