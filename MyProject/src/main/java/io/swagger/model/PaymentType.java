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
import java.util.Set;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.context.annotation.Configuration;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")

@Entity
public class PaymentType   {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @JsonProperty("id")
  private String id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("correlatorId")
  private String correlatorId = null;

  @Column
  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("description")
  private String description = null;

  @Column
  @JsonProperty("authorizationCode")
  private String authorizationCode = null;


  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("amount")
  private MoneyType amount = null;

  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("taxAmount")
  private MoneyType taxAmount = null;

  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("totalAmount")
  private MoneyType totalAmount = null;


  @OneToOne
  @JsonProperty("channel")
  private ChannelRefType channel = null;


  @OneToOne
  @JsonProperty("account")
  private AccountRefType account = null;


  @OneToMany(cascade = CascadeType.ALL)
  @LazyCollection(LazyCollectionOption.FALSE)
  @JsonProperty("paymentItem")
  @Valid
  private List<PaymentItemType> paymentItem = null;

//    @Transient

  @Valid
  @OneToMany (cascade = CascadeType.ALL)
  @LazyCollection(LazyCollectionOption.FALSE)
//  @JoinTable(
//                                     name="PaymentType_PaymentMethodType",
//          joinColumns = @JoinColumn( name="PaymentTypeId", referencedColumnName="id"),
//          inverseJoinColumns = @JoinColumn( name="PaymentMethodTypeId", referencedColumnName="id")
//  )
  @JsonProperty("paymentMethod")
  private List<PaymentMethodType> paymentMethod = null;

  @Column
  @JsonProperty("status")
  private String status = null;

  @Column
  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

  @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @LazyCollection(LazyCollectionOption.FALSE)
  @JsonProperty("payer")
  private RelatedPartyRefType payer = null;

  public PaymentType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
//  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(required = true, value = "")
//  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PaymentType correlatorId(String correlatorId) {
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

  public PaymentType paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(required = true, value = "")
//  @NotNull

  @Valid

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentType name(String name) {
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

  public PaymentType description(String description) {
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

  public PaymentType authorizationCode(String authorizationCode) {
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

  public PaymentType amount(MoneyType amount) {
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

  public PaymentType taxAmount(MoneyType taxAmount) {
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

  public PaymentType totalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(required = true, value = "")
//  @NotNull

  @Valid

  public MoneyType getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PaymentType channel(ChannelRefType channel) {
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

  public PaymentType account(AccountRefType account) {
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

  public PaymentType paymentItem(List<PaymentItemType> paymentItem) {
    this.paymentItem = paymentItem;
    return this;
  }

  public PaymentType addPaymentItemItem(PaymentItemType paymentItemItem) {
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

  public PaymentType paymentMethod(List<PaymentMethodType> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public PaymentType addPaymentMethodItem(PaymentMethodType paymentMethodItem) {
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

  public PaymentType status(String status) {
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

  public PaymentType statusDate(OffsetDateTime statusDate) {
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

  public PaymentType payer(RelatedPartyRefType payer) {
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
    PaymentType paymentType = (PaymentType) o;
    return Objects.equals(this.id, paymentType.id) &&
        Objects.equals(this.href, paymentType.href) &&
        Objects.equals(this.correlatorId, paymentType.correlatorId) &&
        Objects.equals(this.paymentDate, paymentType.paymentDate) &&
        Objects.equals(this.name, paymentType.name) &&
        Objects.equals(this.description, paymentType.description) &&
        Objects.equals(this.authorizationCode, paymentType.authorizationCode) &&
        Objects.equals(this.amount, paymentType.amount) &&
        Objects.equals(this.taxAmount, paymentType.taxAmount) &&
        Objects.equals(this.totalAmount, paymentType.totalAmount) &&
        Objects.equals(this.channel, paymentType.channel) &&
        Objects.equals(this.account, paymentType.account) &&
        Objects.equals(this.paymentItem, paymentType.paymentItem) &&
        Objects.equals(this.paymentMethod, paymentType.paymentMethod) &&
        Objects.equals(this.status, paymentType.status) &&
        Objects.equals(this.statusDate, paymentType.statusDate) &&
        Objects.equals(this.payer, paymentType.payer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, correlatorId, paymentDate, name, description, authorizationCode, amount, taxAmount, totalAmount, channel, account, paymentItem, paymentMethod, status, statusDate, payer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

