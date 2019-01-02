package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a bank card
 */
@ApiModel(description = "Details of a bank card")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class TokenizedCardType extends BasePOJO   {

  @Column
  @JsonProperty("brand")
  private String brand = null;

  /**
   * Card type. Might be used for display purposes
   */
  public enum TypeEnum {
    DEBIT("Debit"),
    
    CREDIT("Credit");

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

  @Column
  @JsonProperty("type")
  private TypeEnum type = null;

  @Column
  @JsonProperty("lastFourDigits")
  private String lastFourDigits = null;

  @Column
  @JsonProperty("cvv")
  private String cvv = null;

  @Column
  @JsonProperty("tokenType")
  private String tokenType = null;

  @Column
  @JsonProperty("token")
  private String token = null;

  @Column
  @JsonProperty("issuer")
  private String issuer = null;

  public TokenizedCardType brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Credit card brand. E.g.: Visa, MasterCard, AmericanExpress... Might be used for display purposes
   * @return brand
  **/
  @ApiModelProperty(value = "Credit card brand. E.g.: Visa, MasterCard, AmericanExpress... Might be used for display purposes")


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public TokenizedCardType type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Card type. Might be used for display purposes
   * @return type
  **/
  @ApiModelProperty(value = "Card type. Might be used for display purposes")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TokenizedCardType lastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

  /**
   * Last four digits of the credit card. Might be used for display purposes
   * @return lastFourDigits
  **/
  @ApiModelProperty(value = "Last four digits of the credit card. Might be used for display purposes")


  public String getLastFourDigits() {
    return lastFourDigits;
  }

  public void setLastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
  }

  public TokenizedCardType cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * security code (e.g.:cvv, cvv2) of the card. Even when the card is tokenized, in some countries it is still necessary to send the cvv to perform payments
   * @return cvv
  **/
  @ApiModelProperty(value = "security code (e.g.:cvv, cvv2) of the card. Even when the card is tokenized, in some countries it is still necessary to send the cvv to perform payments")


  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public TokenizedCardType tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Token type (e.g.: emv)
   * @return tokenType
  **/
  @ApiModelProperty(required = true, value = "Token type (e.g.: emv)")
  @NotNull


  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public TokenizedCardType token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token itself
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The token itself")
  @NotNull


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public TokenizedCardType issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Whoever issued the token
   * @return issuer
  **/
  @ApiModelProperty(value = "Whoever issued the token")


  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizedCardType tokenizedCardType = (TokenizedCardType) o;
    return Objects.equals(this.brand, tokenizedCardType.brand) &&
        Objects.equals(this.type, tokenizedCardType.type) &&
        Objects.equals(this.lastFourDigits, tokenizedCardType.lastFourDigits) &&
        Objects.equals(this.cvv, tokenizedCardType.cvv) &&
        Objects.equals(this.tokenType, tokenizedCardType.tokenType) &&
        Objects.equals(this.token, tokenizedCardType.token) &&
        Objects.equals(this.issuer, tokenizedCardType.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, type, lastFourDigits, cvv, tokenType, token, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedCardType {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

