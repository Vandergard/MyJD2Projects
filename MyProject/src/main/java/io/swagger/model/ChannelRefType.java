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
 * Reference to a channel that can be queried with an API call.
 */
@ApiModel(description = "Reference to a channel that can be queried with an API call.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-22T13:14:44.496+03:00")
@Entity
public class ChannelRefType   {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private String id = null;

  @Column
  @JsonProperty("href")
  private String href = null;

  @Column
  @JsonProperty("name")
  private String name = null;

  @Column
  @JsonProperty("description")
  private String description = null;

  public ChannelRefType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the channel
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the channel")
//  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChannelRefType href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URI where to query or perform actions on the channel
   * @return href
  **/
  @ApiModelProperty(required = true, value = "URI where to query or perform actions on the channel")
//  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ChannelRefType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Screen name of the channel
   * @return name
  **/
  @ApiModelProperty(value = "Screen name of the channel")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChannelRefType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the channel
   * @return description
  **/
  @ApiModelProperty(value = "Description of the channel")


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
    ChannelRefType channelRefType = (ChannelRefType) o;
    return Objects.equals(this.id, channelRefType.id) &&
        Objects.equals(this.href, channelRefType.href) &&
        Objects.equals(this.name, channelRefType.name) &&
        Objects.equals(this.description, channelRefType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelRefType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

