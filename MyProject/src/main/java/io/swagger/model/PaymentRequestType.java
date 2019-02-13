package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountRefType;
import io.swagger.model.ChannelRefType;
import io.swagger.model.MoneyType;
import io.swagger.model.PaymentItemType;
import io.swagger.model.PaymentMethodType;
import io.swagger.model.RelatedPartyRefType;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentRequestType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
//@Entity
public class PaymentRequestType   {

//  @Column
  @JsonProperty("correlatorId")
  private String correlatorId = null;

//  @Column
  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

//  @Column
  @JsonProperty("name")
  private String name = null;

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

//  @OneToMany
  @JsonProperty("paymentItem")
  @Valid
  private List<PaymentItemType> paymentItem = null;

//  @OneToMany
  @JsonProperty("paymentMethod")
  @Valid
  private List<PaymentMethodType> paymentMethod = null;

//  @Column
  @JsonProperty("status")
  private String status = null;

//  @Column
  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

//  @OneToOne
  @JsonProperty("payer")
  private RelatedPartyRefType payer = null;

  public PaymentRequestType correlatorId(String correlatorId) {
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

  public PaymentRequestType paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentRequestType name(String name) {
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

  public PaymentRequestType description(String description) {
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

  public PaymentRequestType authorizationCode(String authorizationCode) {
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

  public PaymentRequestType amount(MoneyType amount) {
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

  public PaymentRequestType taxAmount(MoneyType taxAmount) {
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

  public PaymentRequestType totalAmount(MoneyType totalAmount) {
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

  public PaymentRequestType channel(ChannelRefType channel) {
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

  public PaymentRequestType account(AccountRefType account) {
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

  public PaymentRequestType paymentItem(List<PaymentItemType> paymentItem) {
    this.paymentItem = paymentItem;
    return this;
  }

  public PaymentRequestType addPaymentItemItem(PaymentItemType paymentItemItem) {
    if (this.paymentItem == null) {
      this.paymentItem = new ArrayList<PaymentItemType>();
    }
    this.paymentItem.add(paymentItemItem);
    return this;
  }

  /**
   * Get paymentItem
   * @return paymentItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentItemType> getPaymentItem() {
    return paymentItem;
  }

  public void setPaymentItem(List<PaymentItemType> paymentItem) {
    this.paymentItem = paymentItem;
  }

  public PaymentRequestType paymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public PaymentRequestType addPaymentMethodItem(PaymentMethodType paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new ArrayList<PaymentMethodType>();
    }
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentMethodType> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentRequestType status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentRequestType statusDate(OffsetDateTime statusDate) {
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

  public PaymentRequestType payer(RelatedPartyRefType payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Get payer
   * @return payer
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RelatedPartyRefType getPayer() {
    return payer;
  }

  public void setPayer(RelatedPartyRefType payer) {
    this.payer = payer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestType paymentRequestType = (PaymentRequestType) o;
    return Objects.equals(this.correlatorId, paymentRequestType.correlatorId) &&
        Objects.equals(this.paymentDate, paymentRequestType.paymentDate) &&
        Objects.equals(this.name, paymentRequestType.name) &&
        Objects.equals(this.description, paymentRequestType.description) &&
        Objects.equals(this.authorizationCode, paymentRequestType.authorizationCode) &&
        Objects.equals(this.amount, paymentRequestType.amount) &&
        Objects.equals(this.taxAmount, paymentRequestType.taxAmount) &&
        Objects.equals(this.totalAmount, paymentRequestType.totalAmount) &&
        Objects.equals(this.channel, paymentRequestType.channel) &&
        Objects.equals(this.account, paymentRequestType.account) &&
        Objects.equals(this.paymentItem, paymentRequestType.paymentItem) &&
        Objects.equals(this.paymentMethod, paymentRequestType.paymentMethod) &&
        Objects.equals(this.status, paymentRequestType.status) &&
        Objects.equals(this.statusDate, paymentRequestType.statusDate) &&
        Objects.equals(this.payer, paymentRequestType.payer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlatorId, paymentDate, name, description, authorizationCode, amount, taxAmount, totalAmount, channel, account, paymentItem, paymentMethod, status, statusDate, payer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestType {\n");
    
    sb.append("    correlatorId: ").append(toIndentedString(correlatorId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    paymentItem: ").append(toIndentedString(paymentItem)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
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

