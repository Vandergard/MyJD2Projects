package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedPartyRefType;
import io.swagger.model.TimePeriodType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Type;
import org.springframework.transaction.annotation.Transactional;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Representation of a payment method
 */
@ApiModel(description = "Representation of a payment method")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class PaymentMethodType   {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @JsonProperty("id")
  private String id = null;


  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("description")
  private String description = null;

//  @Transient
  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("validFor")
  private TimePeriodType validFor = null;

  @Column
  @JsonProperty("preferred")
  private Boolean preferred = null;

  @Transient
//  @OneToMany(cascade = CascadeType.ALL)
//  @LazyCollection(LazyCollectionOption.FALSE)
//  @JsonProperty("relatedParty")
//  @Valid
  private List<RelatedPartyRefType> relatedParty = null;

  /**
   * Payment method type. The content of the details field depends on the value of this one
   */


  public enum TypeEnum {
    CASH("cash"),

    DIGITALWALLET("digitalWallet"),

    TOKENIZEDCARD("tokenizedCard"),

    BANKACCOUNTTRANSFER("bankAccountTransfer"),

    BANKACCOUNTDEBIT("bankAccountDebit"),

    BANKCARD("bankCard"),

    ACCOUNT("account"),

    BUCKET("bucket"),

    VOUCHER("voucher"),

    CHECK("check"),

    LOYALTYACCOUNT("loyaltyAccount");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

//  @Transient
  @Enumerated (EnumType.STRING)
  @Column
  @JsonProperty("type")
  private TypeEnum type = null;

  @Column
  @JsonProperty("authorizationCode")
  private String authorizationCode = null;

  @Column
  @JsonProperty("status")
  private String status = null;

  @Column
  @JsonProperty("statusDate")
  private OffsetDateTime statusDate = null;

//  @Transient
////  @Column
//  @JsonProperty("details")
//  private Object details = null;

  public PaymentMethodType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique id of the payment method in the server
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique id of the payment method in the server")
//  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentMethodType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI where to perform actions on the payment method
   * @return href
  **/
  @ApiModelProperty(required = true, value = "URI where to perform actions on the payment method")
//  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PaymentMethodType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the payment method
   * @return name
  **/
  @ApiModelProperty(value = "Screen name of the payment method")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentMethodType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the payment method
   * @return description
  **/
  @ApiModelProperty(value = "Description of the payment method")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentMethodType validFor(TimePeriodType validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Validity period of the payment method
   * @return validFor
  **/
  @ApiModelProperty(value = "Validity period of the payment method")

  @Valid

  public TimePeriodType getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriodType validFor) {
    this.validFor = validFor;
  }

  public PaymentMethodType preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

  /**
   * Defines whether this particular method is the preferred one
   * @return preferred
  **/
  @ApiModelProperty(value = "Defines whether this particular method is the preferred one")


  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public PaymentMethodType relatedParty(List<RelatedPartyRefType> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public PaymentMethodType addRelatedPartyItem(RelatedPartyRefType relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyRefType>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Account that owns the payment method
   * @return relatedParty
  **/
  @ApiModelProperty(value = "Account that owns the payment method")

  @Valid

  public List<RelatedPartyRefType> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRefType> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public PaymentMethodType type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Payment method type. The content of the details field depends on the value of this one
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Payment method type. The content of the details field depends on the value of this one")
//  @NotNull

  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PaymentMethodType authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

  /**
   * Authorization code provided by a financial institution. Typically this would be populated for recurring payments using the method, as payments have an authorization code of their own.
   * @return authorizationCode
  **/
  @ApiModelProperty(value = "Authorization code provided by a financial institution. Typically this would be populated for recurring payments using the method, as payments have an authorization code of their own.")


  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public PaymentMethodType status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the payment method
   * @return status
  **/
  @ApiModelProperty(value = "Current status of the payment method")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentMethodType statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

  /**
   * Last time the status changed
   * @return statusDate
  **/
  @ApiModelProperty(value = "Last time the status changed")

  @Valid

  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

//  public PaymentMethodType details(Object details) {
//    this.details = details;
//    return this;
//  }

  /**
   * Details of the payment method. This object's type depends on the value of the type field above
   * @return details
  **/
//  @ApiModelProperty(required = true, value = "Details of the payment method. This object's type depends on the value of the type field above")
//  @NotNull


//  public Object getDetails() {
//    return details;
//  }
//
//  public void setDetails(Object details) {
//    this.details = details;
//  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodType paymentMethodType = (PaymentMethodType) o;
    return Objects.equals(this.id, paymentMethodType.id) &&
        Objects.equals(this.href, paymentMethodType.href) &&
        Objects.equals(this.name, paymentMethodType.name) &&
        Objects.equals(this.description, paymentMethodType.description) &&
        Objects.equals(this.validFor, paymentMethodType.validFor) &&
        Objects.equals(this.preferred, paymentMethodType.preferred) &&
        Objects.equals(this.relatedParty, paymentMethodType.relatedParty) &&
        Objects.equals(this.type, paymentMethodType.type) &&
        Objects.equals(this.authorizationCode, paymentMethodType.authorizationCode) &&
        Objects.equals(this.status, paymentMethodType.status) &&
        Objects.equals(this.statusDate, paymentMethodType.statusDate);
//        Objects.equals(this.details, paymentMethodType.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description, validFor, preferred, relatedParty, type, authorizationCode, status, statusDate); //details
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodType {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
//    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

