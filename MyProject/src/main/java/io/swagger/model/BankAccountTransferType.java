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
 * Details of a bank account
 */
@ApiModel(description = "Details of a bank account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class BankAccountTransferType  extends BasePOJO {

  @Column
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @Column
  @JsonProperty("accountNumberType")
  private String accountNumberType = null;

  @Column
  @JsonProperty("BIC")
  private String BIC = null;

  @Column
  @JsonProperty("owner")
  private String owner = null;

  @Column
  @JsonProperty("bank")
  private String bank = null;

  public BankAccountTransferType accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Bank Account Number (this could refer to the IBAN or SWIFT number)
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Bank Account Number (this could refer to the IBAN or SWIFT number)")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BankAccountTransferType accountNumberType(String accountNumberType) {
    this.accountNumberType = accountNumberType;
    return this;
  }

  /**
   * Type of account number (e.g.: IBAN, SWIFT, ...)
   * @return accountNumberType
  **/
  @ApiModelProperty(required = true, value = "Type of account number (e.g.: IBAN, SWIFT, ...)")
  @NotNull


  public String getAccountNumberType() {
    return accountNumberType;
  }

  public void setAccountNumberType(String accountNumberType) {
    this.accountNumberType = accountNumberType;
  }

  public BankAccountTransferType BIC(String BIC) {
    this.BIC = BIC;
    return this;
  }

  /**
   * Business Identifier Code/Swift code of the financial institution where the account is located
   * @return BIC
  **/
  @ApiModelProperty(value = "Business Identifier Code/Swift code of the financial institution where the account is located")


  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public BankAccountTransferType owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Owner of the bank account
   * @return owner
  **/
  @ApiModelProperty(value = "Owner of the bank account")


  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BankAccountTransferType bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Screen name of the bank
   * @return bank
  **/
  @ApiModelProperty(value = "Screen name of the bank")


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
    BankAccountTransferType bankAccountTransferType = (BankAccountTransferType) o;
    return Objects.equals(this.accountNumber, bankAccountTransferType.accountNumber) &&
        Objects.equals(this.accountNumberType, bankAccountTransferType.accountNumberType) &&
        Objects.equals(this.BIC, bankAccountTransferType.BIC) &&
        Objects.equals(this.owner, bankAccountTransferType.owner) &&
        Objects.equals(this.bank, bankAccountTransferType.bank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountNumberType, BIC, owner, bank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountTransferType {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNumberType: ").append(toIndentedString(accountNumberType)).append("\n");
    sb.append("    BIC: ").append(toIndentedString(BIC)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

