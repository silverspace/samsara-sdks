package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class InlineObject2   {
  

  private String address;

  private Long groupId;

  private String name;

  private Integer radius;

  /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   **/
  
  @ApiModelProperty(example = "501 York St", required = true, value = "The address of the entry to add, as it would be recognized if provided to maps.google.com.")
  @JsonProperty("address")
  @NotNull
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Group ID to query.
   **/
  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Name of the location to add to the address book.
   **/
  
  @ApiModelProperty(example = "HQ", required = true, value = "Name of the location to add to the address book.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Radius in meters of the address (used for matching vehicle trip stops to this location).
   **/
  
  @ApiModelProperty(example = "10", required = true, value = "Radius in meters of the address (used for matching vehicle trip stops to this location).")
  @JsonProperty("radius")
  @NotNull
  public Integer getRadius() {
    return radius;
  }
  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(address, inlineObject2.address) &&
        Objects.equals(groupId, inlineObject2.groupId) &&
        Objects.equals(name, inlineObject2.name) &&
        Objects.equals(radius, inlineObject2.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, groupId, name, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

