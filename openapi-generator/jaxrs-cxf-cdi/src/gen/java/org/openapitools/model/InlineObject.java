package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressesAddresses;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineObject   {
  
  private List<AddressesAddresses> addresses = new ArrayList<AddressesAddresses>();


  /**
   **/
  public InlineObject addresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("addresses")
  @NotNull
  public List<AddressesAddresses> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
  }

  public InlineObject addAddressesItem(AddressesAddresses addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(addresses, inlineObject.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

