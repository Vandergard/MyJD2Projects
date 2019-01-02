package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of cash payer
 */
@ApiModel(description = "Details of cash payer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class CashType extends BasePOJO  {

  @Column
  @JsonProperty("cashierInfo")
  private String cashierInfo = null;

  public CashType cashierInfo(String cashierInfo) {
    this.cashierInfo = cashierInfo;
    return this;
  }

  /**
   * Information about who performed the payment
   * @return cashierInfo
  **/
  @ApiModelProperty(value = "Information about who performed the payment")


  public String getCashierInfo() {
    return cashierInfo;
  }

  public void setCashierInfo(String cashierInfo) {
    this.cashierInfo = cashierInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CashType cashType = (CashType) o;
    return Objects.equals(this.cashierInfo, cashType.cashierInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashierInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CashType {\n");
    
    sb.append("    cashierInfo: ").append(toIndentedString(cashierInfo)).append("\n");
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

