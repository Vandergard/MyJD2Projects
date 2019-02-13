package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference to an external entity that can be tipically queried with another API such as a customer account, a ticket, etc.
 */
@ApiModel(description = "Reference to an external entity that can be tipically queried with another API such as a customer account, a ticket, etc.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class EntityRefType   {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private String id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("type")
  private String type = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("description")
  private String description = null;

  public EntityRefType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the entity
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the entity")
//  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityRefType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI where to query or perform actions on the entity
   * @return href
  **/
  @ApiModelProperty(required = true, value = "URI where to query or perform actions on the entity")
//  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public EntityRefType type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of entity (e.g.: account, customer, ticket, etc.)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of entity (e.g.: account, customer, ticket, etc.)")
//  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EntityRefType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the entity
   * @return name
  **/
  @ApiModelProperty(value = "Screen name of the entity")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityRefType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the entity
   * @return description
  **/
  @ApiModelProperty(value = "Description of the entity")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRefType entityRefType = (EntityRefType) o;
    return Objects.equals(this.id, entityRefType.id) &&
        Objects.equals(this.href, entityRefType.href) &&
        Objects.equals(this.type, entityRefType.type) &&
        Objects.equals(this.name, entityRefType.name) &&
        Objects.equals(this.description, entityRefType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRefType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

