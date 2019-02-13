package service;


import configuration.HibernateXMLConfTest;
import io.swagger.model.*;
import io.swagger.service.PaymentTypeServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.threeten.bp.OffsetDateTime;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class PaymentTypeServiceImplTest {

    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    PaymentTypeServiceImpl objUnderTest;


    public static PaymentType paymentType(String prefix) {
        PaymentType paymentType = new PaymentType();
        paymentType.setDescription("Description" + prefix);
        paymentType.setName("Name" + prefix);
        paymentType.setHref("localhost/" + prefix);
        paymentType.setStatus("Status" + prefix);
        paymentType.setPaymentDate(OffsetDateTime.now());
        MoneyType moneyType = new MoneyType();
        moneyType.amount(new BigDecimal(123));
        moneyType.units("euro");
        paymentType.setTotalAmount(moneyType);
        paymentType.setPaymentItem(List.of(new PaymentItemType(), new PaymentItemType(), new PaymentItemType()));
        paymentType.setPaymentMethod(List.of(
                new PaymentMethodType()
                    .type(PaymentMethodType.TypeEnum.CASH)
                        .href("localhost/" + prefix)));
        RelatedPartyRefType relatedPartyRefType = new RelatedPartyRefType();
        relatedPartyRefType.setHref("localhost/payer"+prefix);
        relatedPartyRefType.setName("payer"+prefix);
        relatedPartyRefType.setRole("role"+prefix);
        paymentType.setPayer(relatedPartyRefType);
        return paymentType;
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void saveObj() throws Exception {

        //given
       PaymentType paymentType1 =  paymentType("1");
       objUnderTest.saveOne(paymentType1);

       //when
        Serializable id = paymentType1.getId();
        assertNotNull(id);

        List<PaymentType> paymentTypesList = objUnderTest.list();
        PaymentType paymentType2 = paymentTypesList.get(0);
        assertTrue(paymentTypesList.size()==1);
        assertNotNull(paymentType2);

        assertEquals(id, paymentType2.getId());

    }
}
