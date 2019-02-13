package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference to an external party that can be tipically queried with another API.
 */
@ApiModel(description = "Reference to an external party that can be tipically queried with another API.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class RelatedPartyRefType   {

  @Id
  @GeneratedValue(generator = "UUID")
  @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  @JsonProperty("id")
  private String id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("role")
  private String role = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  public RelatedPartyRefType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the party entity
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the party entity")
//  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPartyRefType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * A resource URI pointing to the resource in the OB that stores the party entity information
   * @return href
  **/
  @ApiModelProperty(required = false, value = "A resource URI pointing to the resource in the OB that stores the party entity information")
//  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedPartyRefType role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the entity (customer, user, agent)
   * @return role
  **/
  @ApiModelProperty(value = "Role of the entity (customer, user, agent)")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPartyRefType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the party
   * @return name
  **/
  @ApiModelProperty(value = "Name of the party")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPartyRefType relatedPartyRefType = (RelatedPartyRefType) o;
    return Objects.equals(this.id, relatedPartyRefType.id) &&
        Objects.equals(this.href, relatedPartyRefType.href) &&
        Objects.equals(this.role, relatedPartyRefType.role) &&
        Objects.equals(this.name, relatedPartyRefType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, role, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPartyRefType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

