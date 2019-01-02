package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
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
public class BankCardType  extends BasePOJO {

  @Column
  @JsonProperty("brand")
  private String brand = null;

  /**
   * Debit or credit
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

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("expirationDate")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("cvv")
  private String cvv = null;

  @JsonProperty("lastFourDigits")
  private String lastFourDigits = null;

  @JsonProperty("nameOnCard")
  private String nameOnCard = null;

  @JsonProperty("bank")
  private String bank = null;

  public BankCardType brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Credit card brand. E.g.: Visa, MasterCard, AmericanExpress...
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "Credit card brand. E.g.: Visa, MasterCard, AmericanExpress...")
  @NotNull


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BankCardType type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Debit or credit
   * @return type
  **/
  @ApiModelProperty(value = "Debit or credit")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BankCardType cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Credit card number
   * @return cardNumber
  **/
  @ApiModelProperty(required = true, value = "Credit card number")
  @NotNull


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public BankCardType expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * the card's expiration date
   * @return expirationDate
  **/
  @ApiModelProperty(required = true, value = "the card's expiration date")
  @NotNull

  @Valid

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public BankCardType cvv(String cvv) {
    this.cvv = cvv;
    return this;
  }

  /**
   * the CVV or CVV2 code of the card
   * @return cvv
  **/
  @ApiModelProperty(value = "the CVV or CVV2 code of the card")


  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }

  public BankCardType lastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

  /**
   * Last four digits of the card
   * @return lastFourDigits
  **/
  @ApiModelProperty(value = "Last four digits of the card")


  public String getLastFourDigits() {
    return lastFourDigits;
  }

  public void setLastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
  }

  public BankCardType nameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
    return this;
  }

  /**
   * Name writen on the card
   * @return nameOnCard
  **/
  @ApiModelProperty(value = "Name writen on the card")


  public String getNameOnCard() {
    return nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  public BankCardType bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Bank that issued the card
   * @return bank
  **/
  @ApiModelProperty(value = "Bank that issued the card")


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankCardType bankCardType = (BankCardType) o;
    return Objects.equals(this.brand, bankCardType.brand) &&
        Objects.equals(this.type, bankCardType.type) &&
        Objects.equals(this.cardNumber, bankCardType.cardNumber) &&
        Objects.equals(this.expirationDate, bankCardType.expirationDate) &&
        Objects.equals(this.cvv, bankCardType.cvv) &&
        Objects.equals(this.lastFourDigits, bankCardType.lastFourDigits) &&
        Objects.equals(this.nameOnCard, bankCardType.nameOnCard) &&
        Objects.equals(this.bank, bankCardType.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, type, cardNumber, expirationDate, cvv, lastFourDigits, nameOnCard, bank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankCardType {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    cvv: ").append(toIndentedString(cvv)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
    sb.append("    nameOnCard: ").append(toIndentedString(nameOnCard)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
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

