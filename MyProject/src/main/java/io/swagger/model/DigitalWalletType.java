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
 * Details of a digital wallet
 */
@ApiModel(description = "Details of a digital wallet")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class DigitalWalletType extends BasePOJO  {

  @Column
  @JsonProperty("service")
  private String service = null;

  @Column
  @JsonProperty("walletId")
  private String walletId = null;

  @Column
  @JsonProperty("walletUrl")
  private String walletUrl = null;

  public DigitalWalletType service(String service) {
    this.service = service;
    return this;
  }

  /**
   * Wallet service (e.g.: PayPal)
   * @return service
  **/
  @ApiModelProperty(required = true, value = "Wallet service (e.g.: PayPal)")
  @NotNull


  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public DigitalWalletType walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

  /**
   * Unique Id of the account in the service
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "Unique Id of the account in the service")
  @NotNull


  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  public DigitalWalletType walletUrl(String walletUrl) {
    this.walletUrl = walletUrl;
    return this;
  }

  /**
   * URI pointing at the digital wallet (e.g.: https://paypal.me/johndoe)
   * @return walletUrl
  **/
  @ApiModelProperty(value = "URI pointing at the digital wallet (e.g.: https://paypal.me/johndoe)")


  public String getWalletUrl() {
    return walletUrl;
  }

  public void setWalletUrl(String walletUrl) {
    this.walletUrl = walletUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalWalletType digitalWalletType = (DigitalWalletType) o;
    return Objects.equals(this.service, digitalWalletType.service) &&
        Objects.equals(this.walletId, digitalWalletType.walletId) &&
        Objects.equals(this.walletUrl, digitalWalletType.walletUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, walletId, walletUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalWalletType {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletUrl: ").append(toIndentedString(walletUrl)).append("\n");
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

