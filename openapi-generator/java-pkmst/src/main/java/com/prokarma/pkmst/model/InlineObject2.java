package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InlineObject2
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class InlineObject2   {
  @JsonProperty("address")
  private String address;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("radius")
  private Integer radius;

  public InlineObject2 address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   * @return address
  **/
  @ApiModelProperty(example = "501 York St", required = true, value = "The address of the entry to add, as it would be recognized if provided to maps.google.com.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InlineObject2 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the location to add to the address book.
   * @return name
  **/
  @ApiModelProperty(example = "HQ", required = true, value = "Name of the location to add to the address book.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineObject2 radius(Integer radius) {
    this.radius = radius;
    return this;
  }

   /**
   * Radius in meters of the address (used for matching vehicle trip stops to this location).
   * @return radius
  **/
  @ApiModelProperty(example = "10", required = true, value = "Radius in meters of the address (used for matching vehicle trip stops to this location).")
  public Integer getRadius() {
    return radius;
  }

  public void setRadius(Integer radius) {
    this.radius = radius;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.address, inlineObject2.address) &&
        Objects.equals(this.groupId, inlineObject2.groupId) &&
        Objects.equals(this.name, inlineObject2.name) &&
        Objects.equals(this.radius, inlineObject2.radius);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

