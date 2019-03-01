package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddressParam   {
  
  private @Valid String address = null;
  private @Valid Long groupId = null;
  private @Valid String name = null;
  private @Valid Integer radius = null;

  /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   **/
  public AddressParam address(String address) {
    this.address = address;
    return this;
  }

  
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
  public AddressParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
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
  public AddressParam name(String name) {
    this.name = name;
    return this;
  }

  
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
  public AddressParam radius(Integer radius) {
    this.radius = radius;
    return this;
  }

  
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressParam addressParam = (AddressParam) o;
    return Objects.equals(address, addressParam.address) &&
        Objects.equals(groupId, addressParam.groupId) &&
        Objects.equals(name, addressParam.name) &&
        Objects.equals(radius, addressParam.radius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, groupId, name, radius);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressParam {\n");
    
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

