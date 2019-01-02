package io.swagger.dao;

import io.swagger.model.PaymentType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDaoImpl<T> {


    public List<T> find(){

    return List.of(testData("1"), testData("2"), testData("3"));
    }


    public boolean add(List<T> items){

        return false;
    }
//
//    Session openSession(){
//        return sessionFactory.getCurrentSession();
//    }


    private T testData(String prefix){
        PaymentType paymentType = new PaymentType();

        paymentType.setId(prefix);
        paymentType.setName("Name"+prefix);
        paymentType.setDescription("Description"+prefix);
        paymentType.setAuthorizationCode("AuthorizationCode"+prefix);


        return (T)paymentType;
    }


}
