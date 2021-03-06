/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.threeten.bp.OffsetDateTime;
import io.swagger.model.PaymentRequestType;
import io.swagger.model.PaymentType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")

@Api(value = "payment", description = "the payment API")
public interface PaymentApi {

    @ApiOperation(value = "Create a new payment", nickname = "createPayment", notes = "", tags={ "payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Payment created successfully") })
    @RequestMapping(value = "/payment",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentType> createPayment(@ApiParam(value = "Payment that is created" ,required=true )  @Valid @RequestBody PaymentRequestType paymentRequest);


    @ApiOperation(value = "Retrieve a payment", nickname = "retrievePayment", notes = "", response = PaymentType.class, tags={ "payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payment retrieved successfully", response = PaymentType.class) })
    @RequestMapping(value = "/payment/{paymentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PaymentType> retrievePayment(@ApiParam(value = "ID of the payment that needs to be fetched",required=true) @PathVariable("paymentId") String paymentId);


    @ApiOperation(value = "Retrieve a list of payments", nickname = "retrievePayments", notes = "", response = PaymentType.class, responseContainer = "List", tags={ "payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Payments retrieved successfully", response = PaymentType.class, responseContainer = "List") })
    @RequestMapping(value = "/payment",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PaymentType>> retrievePayments(
//            @ApiParam(value = "To retrieve the payments from a specific customer")
//            @Valid @RequestParam(value = "customerId", required = false) String customerId,
//            @ApiParam(value = "To retrieve the payments from a specific account")
//            @Valid @RequestParam(value = "accountId", required = false) String accountId,
            @ApiParam(value = "To retrieve the payments performed with a specific method",
                    allowableValues = "directToBill, digitalWallet, bankAccount, bankCard, prepaidCard, voucher, check, loyalty")
            @Valid @RequestParam(value = "paymentMethod.type", required = false) String paymentMethodType);
//            @ApiParam(value = "To retrieve the payments performed after this date")
//            @Valid @RequestParam(value = "startDate", required = false) OffsetDateTime startDate,
//            @ApiParam(value = "To retrieve the payments performed before this date")
//            @Valid @RequestParam(value = "endDate", required = false) OffsetDateTime endDate,
//            @ApiParam(value = "") @Valid @RequestParam(value = "limit", required = false) Integer limit,
//            @ApiParam(value = "") @Valid @RequestParam(value = "offset", required = false) Integer offset);

}
