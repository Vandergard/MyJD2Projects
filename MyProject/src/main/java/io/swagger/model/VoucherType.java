package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.QuantityType;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.websocket.OnMessage;

/**
 * Details of a voucher
 */
@ApiModel(description = "Details of a voucher")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class VoucherType  extends BasePOJO {

  @Column
  @JsonProperty("code")
  private String code = null;

  @Column
  @JsonProperty("description")
  private String description = null;

  @OneToMany
  @JsonProperty("value")
  @Valid
  private List<QuantityType> value = null;

  @Column
  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @Column
  @JsonProperty("campaign")
  private String campaign = null;

  public VoucherType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code that identifies the voucher or provides the discount
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Code that identifies the voucher or provides the discount")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VoucherType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the voucher (e.g.: get one and receive one free)
   * @return description
  **/
  @ApiModelProperty(value = "Description of the voucher (e.g.: get one and receive one free)")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VoucherType value(List<QuantityType> value) {
    this.value = value;
    return this;
  }

  public VoucherType addValueItem(QuantityType valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<QuantityType>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Discount that the voucher applies when it's a discount voucher
   * @return value
  **/
  @ApiModelProperty(value = "Discount that the voucher applies when it's a discount voucher")

  @Valid

  public List<QuantityType> getValue() {
    return value;
  }

  public void setValue(List<QuantityType> value) {
    this.value = value;
  }

  public VoucherType expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * the voucher's expiration date
   * @return expirationDate
  **/
  @ApiModelProperty(value = "the voucher's expiration date")

  @Valid

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VoucherType campaign(String campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Campaign this voucher belongs to
   * @return campaign
  **/
  @ApiModelProperty(value = "Campaign this voucher belongs to")


  public String getCampaign() {
    return campaign;
  }

  public void setCampaign(String campaign) {
    this.campaign = campaign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherType voucherType = (VoucherType) o;
    return Objects.equals(this.code, voucherType.code) &&
        Objects.equals(this.description, voucherType.description) &&
        Objects.equals(this.value, voucherType.value) &&
        Objects.equals(this.expirationDate, voucherType.expirationDate) &&
        Objects.equals(this.campaign, voucherType.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, value, expirationDate, campaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

