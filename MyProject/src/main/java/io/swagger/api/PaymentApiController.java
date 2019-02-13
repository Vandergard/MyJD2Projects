package io.swagger.api;

import io.swagger.model.*;
import io.swagger.service.PaymentTypeServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")

@Controller
public class PaymentApiController implements PaymentApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    // Spring автоматически создает объект подходящий интерфейсу и дает на него ссылку
    @Autowired
    private PaymentTypeServiceImpl<PaymentType> paymentTypeBaseService;


    @org.springframework.beans.factory.annotation.Autowired
    public PaymentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PaymentType> createPayment(@ApiParam(value = "Payment that is created" ,required=true )  @Valid @RequestBody PaymentRequestType paymentRequest) {
        String accept = request.getHeader("Accept");

        PaymentType paymentTypeNew = new PaymentType();
        BeanUtils.copyProperties(paymentRequest, paymentTypeNew);
        paymentTypeBaseService.saveOne(paymentTypeNew);
//        paymentTypeBaseService.create(List.of(
//                paymentType("1"),
//                paymentType("2"),
//                paymentType("3"),
//                paymentType("4"),
//                paymentType("5")
//        ));


        return new ResponseEntity<PaymentType>(HttpStatus.OK);
    }

    public ResponseEntity<PaymentType> retrievePayment(@ApiParam(value = "ID of the payment that needs to be fetched",required=true) @PathVariable("paymentId") String paymentId) {
        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
            try {

                return new ResponseEntity<PaymentType>(paymentTypeBaseService.findId(paymentId), HttpStatus.OK);
//                return new ResponseEntity<PaymentType>(objectMapper.readValue("{  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"payer\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"paymentItem\" : [ {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  }, {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  } ],  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"status\"}", PaymentType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
//        }

//        return new ResponseEntity<PaymentType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PaymentType>> retrievePayments(
//                                                        @ApiParam(value = "To retrieve the payments from a specific customer")
//                                                              @Valid @RequestParam(value = "customerId", required = false) String customerId,
//                                                              @ApiParam(value = "To retrieve the payments from a specific account")
//                                                              @Valid @RequestParam(value = "accountId", required = false) String accountId,
                                                              @ApiParam(value = "To retrieve the payments performed with a specific method",
                                                                      allowableValues = "cash, directToBill, digitalWallet, bankAccount, bankCard, prepaidCard, voucher, check, loyalty")
                                                              @Valid @RequestParam(value = "paymentMethod.type", required = false) String paymentMethodType)
//                                                              @ApiParam(value = "To retrieve the payments performed after this date")
//                                                              @Valid @RequestParam(value = "startDate", required = false) OffsetDateTime startDate,
//                                                              @ApiParam(value = "To retrieve the payments performed before this date")
//                                                              @Valid @RequestParam(value = "endDate", required = false) OffsetDateTime endDate,
//                                                              @ApiParam(value = "")
//                                                              @Valid @RequestParam(value = "limit", required = false) Integer limit,
//                                                              @ApiParam(value = "")
//                                                              @Valid @RequestParam(value = "offset", required = false) Integer offset)
 {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            if(paymentMethodType != null){
                try {

//                return new ResponseEntity<List<PaymentType>>(objectMapper.readValue("[ {  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"payer\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"paymentItem\" : [ {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  }, {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  } ],  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"status\"}, {  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"payer\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"paymentItem\" : [ {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  }, {    \"totalAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"amount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    },    \"item\" : {      \"name\" : \"name\",      \"description\" : \"description\",      \"id\" : \"id\",      \"href\" : \"href\",      \"type\" : \"type\"    },    \"taxAmount\" : {      \"amount\" : 0.80082819046101150206595775671303272247314453125,      \"units\" : \"units\"    }  } ],  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"status\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                    return new ResponseEntity<List<PaymentType>>(
                            paymentTypeBaseService.findByPaymentMethodType(paymentMethodType),
                            HttpStatus.OK
                    );
                } catch (Exception e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<List<PaymentType>>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            }


        return new ResponseEntity<List<PaymentType>>(HttpStatus.NOT_IMPLEMENTED);
    }

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
//                    .type(PaymentMethodType.TypeEnum.CASH)
                    .href("localhost/" + prefix),
//                    .details(new Object()),
                new PaymentMethodType()
//                        .type(PaymentMethodType.TypeEnum.BANKACCOUNTDEBIT)
                        .href("localhost/" + prefix)));
//                        .details(new Object())));
        return paymentType;
    }

}
