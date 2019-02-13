//package io.swagger.api;
//
//import org.threeten.bp.OffsetDateTime;
//import io.swagger.model.RefundRequestType;
//import io.swagger.model.RefundType;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.swagger.annotations.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestPart;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.validation.constraints.*;
//import javax.validation.Valid;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.util.List;
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
//
//@Controller
//public class RefundApiController implements RefundApi {
//
//    private static final Logger log = LoggerFactory.getLogger(RefundApiController.class);
//
//    private final ObjectMapper objectMapper;
//
//    private final HttpServletRequest request;
//
//    @org.springframework.beans.factory.annotation.Autowired
//    public RefundApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//        this.objectMapper = objectMapper;
//        this.request = request;
//    }
//
//    public ResponseEntity<Void> createRefund(@ApiParam(value = "Data necessary to request a refund" ,required=true )  @Valid @RequestBody RefundRequestType refundRequest) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    public ResponseEntity<RefundType> retrieveRefund(@ApiParam(value = "ID of the refund that needs to be fetched",required=true) @PathVariable("refundId") String refundId) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<RefundType>(objectMapper.readValue("{  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"reason\" : \"reason\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"requestor\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"relatedPayment\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"pendingAuthorization\"}", RefundType.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<RefundType>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<RefundType>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    public ResponseEntity<List<RefundType>> retrieveRefunds(@ApiParam(value = "To retrieve the refunds from a specific customer") @Valid @RequestParam(value = "customerId", required = false) String customerId,@ApiParam(value = "To retrieve the refunds from a specific account") @Valid @RequestParam(value = "accountId", required = false) String accountId,@ApiParam(value = "To retrieve the refunds performed with a specific method", allowableValues = "directToBill, eMoney, bankAccount, debitCard, creditCard, prepaidCard") @Valid @RequestParam(value = "paymentMethod_type", required = false) String paymentMethodType,@ApiParam(value = "To retrieve the refunds with a specific reference code") @Valid @RequestParam(value = "referenceCode", required = false) String referenceCode,@ApiParam(value = "To retrieve the refunds performed after this date") @Valid @RequestParam(value = "startDate", required = false) OffsetDateTime startDate,@ApiParam(value = "To retrieve the refunds performed before this date") @Valid @RequestParam(value = "endDate", required = false) OffsetDateTime endDate,@ApiParam(value = "") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<RefundType>>(objectMapper.readValue("[ {  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"reason\" : \"reason\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"requestor\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"relatedPayment\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"pendingAuthorization\"}, {  \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"reason\" : \"reason\",  \"amount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"authorizationCode\" : \"authorizationCode\",  \"channel\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"description\" : \"description\",  \"requestor\" : {    \"role\" : \"role\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"totalAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"name\" : \"name\",  \"paymentMethod\" : [ {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  }, {    \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"validFor\" : {      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"    },    \"authorizationCode\" : \"authorizationCode\",    \"name\" : \"name\",    \"description\" : \"description\",    \"details\" : \"{}\",    \"id\" : \"id\",    \"href\" : \"href\",    \"relatedParty\" : [ {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    }, {      \"role\" : \"role\",      \"name\" : \"name\",      \"id\" : \"id\",      \"href\" : \"href\"    } ],    \"type\" : \"cash\",    \"preferred\" : true,    \"status\" : \"status\"  } ],  \"correlatorId\" : \"correlatorId\",  \"id\" : \"id\",  \"href\" : \"href\",  \"relatedPayment\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"taxAmount\" : {    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"units\" : \"units\"  },  \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"account\" : {    \"name\" : \"name\",    \"description\" : \"description\",    \"id\" : \"id\",    \"href\" : \"href\"  },  \"status\" : \"pendingAuthorization\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<RefundType>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<List<RefundType>>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//}
