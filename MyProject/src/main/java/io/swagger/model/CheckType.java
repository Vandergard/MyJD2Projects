package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a check
 */
@ApiModel(description = "Details of a check")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class CheckType extends BasePOJO  {

  @Column
  @JsonProperty("checkId")
  private String checkId = null;

  @Column
  @JsonProperty("drawer")
  private String drawer = null;

  @Column
  @JsonProperty("payee")
  private String payee = null;

  @Column
  @JsonProperty("bank")
  private String bank = null;

  @Column
  @JsonProperty("date")
  private OffsetDateTime date = null;

  public CheckType checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  /**
   * Unique identifier of the check in the bank that issues them. Typically writen on them and comprises bank, account and serial number.
   * @return checkId
  **/
  @ApiModelProperty(value = "Unique identifier of the check in the bank that issues them. Typically writen on them and comprises bank, account and serial number.")


  public String getCheckId() {
    return checkId;
  }

  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }

  public CheckType drawer(String drawer) {
    this.drawer = drawer;
    return this;
  }

  /**
   * Person or entity writing the check
   * @return drawer
  **/
  @ApiModelProperty(required = true, value = "Person or entity writing the check")
  @NotNull


  public String getDrawer() {
    return drawer;
  }

  public void setDrawer(String drawer) {
    this.drawer = drawer;
  }

  public CheckType payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Person or entity the check is addressed to
   * @return payee
  **/
  @ApiModelProperty(required = true, value = "Person or entity the check is addressed to")
  @NotNull


  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public CheckType bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Entity, typically a bank, performing the payment of the check
   * @return bank
  **/
  @ApiModelProperty(required = true, value = "Entity, typically a bank, performing the payment of the check")
  @NotNull


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public CheckType date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date when the check was signed
   * @return date
  **/
  @ApiModelProperty(value = "Date when the check was signed")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckType checkType = (CheckType) o;
    return Objects.equals(this.checkId, checkType.checkId) &&
        Objects.equals(this.drawer, checkType.drawer) &&
        Objects.equals(this.payee, checkType.payee) &&
        Objects.equals(this.bank, checkType.bank) &&
        Objects.equals(this.date, checkType.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkId, drawer, payee, bank, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckType {\n");
    
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    drawer: ").append(toIndentedString(drawer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

