package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityRefType;
import io.swagger.model.MoneyType;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentItemType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class PaymentItemType extends BasePOJO  {

  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("amount")
  private MoneyType amount = null;

  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("taxAmount")
  private MoneyType taxAmount = null;

  @OneToOne (cascade = CascadeType.ALL)
  @JsonProperty("totalAmount")
  private MoneyType totalAmount = null;

  @Transient
//  @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JsonProperty("item")
  private EntityRefType item = null;

  public PaymentItemType amount(MoneyType amount) {
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

  public PaymentItemType taxAmount(MoneyType taxAmount) {
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

  public PaymentItemType totalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MoneyType getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyType totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PaymentItemType item(EntityRefType item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(value = "")

  @Valid

  public EntityRefType getItem() {
    return item;
  }

  public void setItem(EntityRefType item) {
    this.item = item;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentItemType paymentItemType = (PaymentItemType) o;
    return Objects.equals(this.amount, paymentItemType.amount) &&
        Objects.equals(this.taxAmount, paymentItemType.taxAmount) &&
        Objects.equals(this.totalAmount, paymentItemType.totalAmount) &&
        Objects.equals(this.item, paymentItemType.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, taxAmount, totalAmount, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentItemType {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

