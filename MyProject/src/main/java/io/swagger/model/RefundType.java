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

/**
 * RefundType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class RefundType   {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private String id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("correlatorId")
  private String correlatorId = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("refundDate")
  private OffsetDateTime refundDate = null;

  @Column
  @JsonProperty("description")
  private String description = null;

  @Column
  @JsonProperty("authorizationCode")
  private String authorizationCode = null;

  @OneToOne
  @JsonProperty("amount")
  private MoneyType amount = null;

  @OneToOne
  @JsonProperty("taxAmount")
  private MoneyType taxAmount = null;

  @OneToOne
  @JsonProperty("totalAmount")
  private MoneyType totalAmount = null;

  @OneToOne
  @JsonProperty("channel")
  private ChannelRefType channel = null;

  @OneToOne
  @JsonProperty("account")
  private AccountRefType account = null;

  @JsonProperty("paymentMethod")
  @Valid
  @OneToMany(cascade = CascadeType.ALL)
  @LazyCollection(LazyCollectionOption.FALSE)
  private List<PaymentMethodType> paymentMethod = new ArrayList<PaymentMethodType>();

  @OneToOne
  @JsonProperty("relatedPayment")
  private PaymentRefType relatedPayment = null;

  @Column
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

  @Column
  @JsonProperty("status")
  private StatusEnum status = null;

  @Column
  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

  @OneToOne
  @JsonProperty("requestor")
  private RelatedPartyRefType requestor = null;

  public RefundType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RefundType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RefundType correlatorId(String correlatorId) {
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

  public RefundType name(String name) {
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

  public RefundType refundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
    return this;
  }

  /**
   * Get refundDate
   * @return refundDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getRefundDate() {
    return refundDate;
  }

  public void setRefundDate(OffsetDateTime refundDate) {
    this.refundDate = refundDate;
  }

  public RefundType description(String description) {
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

  public RefundType authorizationCode(String authorizationCode) {
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

  public RefundType amount(MoneyType amount) {
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

  public RefundType taxAmount(MoneyType taxAmount) {
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

  public RefundType totalAmount(MoneyType totalAmount) {
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

  public RefundType channel(ChannelRefType channel) {
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

  public RefundType account(AccountRefType account) {
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

  public RefundType paymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public RefundType addPaymentMethodItem(PaymentMethodType paymentMethodItem) {
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

  public RefundType relatedPayment(PaymentRefType relatedPayment) {
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

  public RefundType reason(String reason) {
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

  public RefundType status(StatusEnum status) {
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

  public RefundType statusDate(OffsetDateTime statusDate) {
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

  public RefundType requestor(RelatedPartyRefType requestor) {
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
    RefundType refundType = (RefundType) o;
    return Objects.equals(this.id, refundType.id) &&
        Objects.equals(this.href, refundType.href) &&
        Objects.equals(this.correlatorId, refundType.correlatorId) &&
        Objects.equals(this.name, refundType.name) &&
        Objects.equals(this.refundDate, refundType.refundDate) &&
        Objects.equals(this.description, refundType.description) &&
        Objects.equals(this.authorizationCode, refundType.authorizationCode) &&
        Objects.equals(this.amount, refundType.amount) &&
        Objects.equals(this.taxAmount, refundType.taxAmount) &&
        Objects.equals(this.totalAmount, refundType.totalAmount) &&
        Objects.equals(this.channel, refundType.channel) &&
        Objects.equals(this.account, refundType.account) &&
        Objects.equals(this.paymentMethod, refundType.paymentMethod) &&
        Objects.equals(this.relatedPayment, refundType.relatedPayment) &&
        Objects.equals(this.reason, refundType.reason) &&
        Objects.equals(this.status, refundType.status) &&
        Objects.equals(this.statusDate, refundType.statusDate) &&
        Objects.equals(this.requestor, refundType.requestor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, correlatorId, name, refundDate, description, authorizationCode, amount, taxAmount, totalAmount, channel, account, paymentMethod, relatedPayment, reason, status, statusDate, requestor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

