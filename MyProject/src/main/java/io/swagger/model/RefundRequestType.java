package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountRefType;
import io.swagger.model.ChannelRefType;
import io.swagger.model.MoneyType;
import io.swagger.model.PaymentMethodType;
import io.swagger.model.PaymentRefType;
import io.swagger.model.RelatedPartyRefType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.websocket.OnOpen;

/**
 * RefundRequestType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
//@Entity
public class RefundRequestType   {

//  @Id
//  @GeneratedValue (strategy = GenerationType.AUTO)
  @JsonProperty("correlatorId")
  private String correlatorId = null;

//  @Column
  @JsonProperty("name")
  private String name = null;

//  @Column
  @JsonProperty("refundDate")
  private OffsetDateTime refundDate = null;

//  @Column
  @JsonProperty("description")
  private String description = null;

//  @Column
  @JsonProperty("authorizationCode")
  private String authorizationCode = null;

//  @OneToOne
  @JsonProperty("amount")
  private MoneyType amount = null;

//  @OneToOne
  @JsonProperty("taxAmount")
  private MoneyType taxAmount = null;

//  @OneToOne
  @JsonProperty("totalAmount")
  private MoneyType totalAmount = null;

//  @OneToOne
  @JsonProperty("channel")
  private ChannelRefType channel = null;

//  @OneToOne
  @JsonProperty("account")
  private AccountRefType account = null;

  @JsonProperty("paymentMethod")
//  @Valid
//  @OneToMany(cascade = CascadeType.ALL)
//  @LazyCollection(LazyCollectionOption.FALSE)
  private List<PaymentMethodType> paymentMethod = new ArrayList<PaymentMethodType>();

//  @OneToOne
  @JsonProperty("relatedPayment")
  private PaymentRefType relatedPayment = null;

//  @Column
  @JsonProperty("reason")
  private String reason = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDINGAUTHORIZATION("pendingAuthorization"),
    
    AUTHORIZED("authorized"),
    
    PROCESSING("processing"),
    
    CHARGED("charged"),
    
    UNAUTHORIZED("unAuthorized"),
    
    DENIEDBYUSER("deniedByUser"),
    
    DENIED("denied"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

//  @Column
  @JsonProperty("status")
  private StatusEnum status = null;

  @Column
  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

  @OneToOne
  @JsonProperty("requestor")
  private RelatedPartyRefType requestor = null;

  public RefundRequestType correlatorId(String correlatorId) {
    this.correlatorId = correlatorId;
    return this;
  }

  /**
   * Get correlatorId
   * @return correlatorId
  **/
  @ApiModelProperty(value = "")


  public String getCorrelatorId() {
    return correlatorId;
  }

  public void setCorrelatorId(String correlatorId) {
    this.correlatorId = correlatorId;
  }

  public RefundRequestType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RefundRequestType refundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
    return this;
  }

  /**
   * Get refundDate
   * @return refundDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
  }

  public RefundRequestType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RefundRequestType authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * Get authorizationCode
   * @return authorizationCode
  **/
  @ApiModelProperty(value = "")


  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public RefundRequestType amount(MoneyType amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MoneyType getAmount() {
    return amount;
  }

  public void setAmount(MoneyType amount) {
    this.amount = amount;
  }

  public RefundRequestType taxAmount(MoneyType taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MoneyType getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(MoneyType taxAmount) {
    this.taxAmount = taxAmount;
  }

  public RefundRequestType totalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MoneyType getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
  }

  public RefundRequestType channel(ChannelRefType channel) {
    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ChannelRefType getChannel() {
    return channel;
  }

  public void setChannel(ChannelRefType channel) {
    this.channel = channel;
  }

  public RefundRequestType account(AccountRefType account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountRefType getAccount() {
    return account;
  }

  public void setAccount(AccountRefType account) {
    this.account = account;
  }

  public RefundRequestType paymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public RefundRequestType addPaymentMethodItem(PaymentMethodType paymentMethodItem) {
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<PaymentMethodType> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public RefundRequestType relatedPayment(PaymentRefType relatedPayment) {
    this.relatedPayment = relatedPayment;
    return this;
  }

  /**
   * Get relatedPayment
   * @return relatedPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentRefType getRelatedPayment() {
    return relatedPayment;
  }

  public void setRelatedPayment(PaymentRefType relatedPayment) {
    this.relatedPayment = relatedPayment;
  }

  public RefundRequestType reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public RefundRequestType status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RefundRequestType statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Get statusDate
   * @return statusDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

  public RefundRequestType requestor(RelatedPartyRefType requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelatedPartyRefType getRequestor() {
    return requestor;
  }

  public void setRequestor(RelatedPartyRefType requestor) {
    this.requestor = requestor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequestType refundRequestType = (RefundRequestType) o;
    return Objects.equals(this.correlatorId, refundRequestType.correlatorId) &&
        Objects.equals(this.name, refundRequestType.name) &&
        Objects.equals(this.refundDate, refundRequestType.refundDate) &&
        Objects.equals(this.description, refundRequestType.description) &&
        Objects.equals(this.authorizationCode, refundRequestType.authorizationCode) &&
        Objects.equals(this.amount, refundRequestType.amount) &&
        Objects.equals(this.taxAmount, refundRequestType.taxAmount) &&
        Objects.equals(this.totalAmount, refundRequestType.totalAmount) &&
        Objects.equals(this.channel, refundRequestType.channel) &&
        Objects.equals(this.account, refundRequestType.account) &&
        Objects.equals(this.paymentMethod, refundRequestType.paymentMethod) &&
        Objects.equals(this.relatedPayment, refundRequestType.relatedPayment) &&
        Objects.equals(this.reason, refundRequestType.reason) &&
        Objects.equals(this.status, refundRequestType.status) &&
        Objects.equals(this.statusDate, refundRequestType.statusDate) &&
        Objects.equals(this.requestor, refundRequestType.requestor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlatorId, name, refundDate, description, authorizationCode, amount, taxAmount, totalAmount, channel, account, paymentMethod, relatedPayment, reason, status, statusDate, requestor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequestType {\n");
    
    sb.append("    correlatorId: ").append(toIndentedString(correlatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    refundDate: ").append(toIndentedString(refundDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    relatedPayment: ").append(toIndentedString(relatedPayment)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

