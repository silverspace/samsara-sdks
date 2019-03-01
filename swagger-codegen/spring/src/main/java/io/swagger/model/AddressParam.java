package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AddressParam   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("radius")
  private Integer radius = null;

  public AddressParam address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address of the entry to add, as it would be recognized if provided to maps.google.com.
   * @return address
  **/
  @ApiModelProperty(example = "501 York St", required = true, value = "The address of the entry to add, as it would be recognized if provided to maps.google.com.")
  @NotNull


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AddressParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @NotNull


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public AddressParam name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the location to add to the address book.
   * @return name
  **/
  @ApiModelProperty(example = "HQ", required = true, value = "Name of the location to add to the address book.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressParam radius(Integer radius) {
    this.radius = radius;
    return this;
  }

  /**
   * Radius in meters of the address (used for matching vehicle trip stops to this location).
   * @return radius
  **/
  @ApiModelProperty(example = "10", required = true, value = "Radius in meters of the address (used for matching vehicle trip stops to this location).")
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
    return Objects.equals(this.address, addressParam.address) &&
        Objects.equals(this.groupId, addressParam.groupId) &&
        Objects.equals(this.name, addressParam.name) &&
        Objects.equals(this.radius, addressParam.radius);
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

