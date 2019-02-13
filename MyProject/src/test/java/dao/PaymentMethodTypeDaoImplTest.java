package dao;


import configuration.HibernateXMLConfTest;
import io.swagger.configuration.HibernateXMLConf;
import io.swagger.dao.PaymentMethodTypeDaoImpl;
import io.swagger.model.PaymentMethodType;
import io.swagger.service.PaymentTypeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.util.List;
import java.util.logging.Logger;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class PaymentMethodTypeDaoImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    PaymentMethodTypeDaoImpl<PaymentMethodType> objUnderTest;

    private static Logger log = Logger.getLogger(PaymentMethodTypeDaoImplTest.class.getName());
//
    @Test
    @Commit
    public void getbyType() {
        // given
        PaymentMethodType paymentMethodType = new PaymentMethodType();
        paymentMethodType.setName("Test payment method type");
//        paymentMethodType.setDetails("Details");
//        paymentMethodType.setType(PaymentMethodType.TypeEnum.BANKACCOUNTDEBIT);
        paymentMethodType.setHref("http://localhost/paymentmethodtype/{id}");
//
        // when
        objUnderTest.save(paymentMethodType);
        assertNotNull(paymentMethodType.getId());
        log.info("PaymentMethodType ID=" + paymentMethodType.getId());

        PaymentMethodType paymentMethodTypePers = objUnderTest.get(paymentMethodType.getId());
        log.info("PaymentMethodType ID=" + paymentMethodTypePers.getId());
        assertEquals(paymentMethodType.getId(), paymentMethodTypePers.getId());

        // then
        List res = objUnderTest.getbyType(paymentMethodType.getName());
        assertTrue(res.size() > 0);
    }

}
