package io.swagger.model;

import io.swagger.model.AddressesAddresses;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Addresses  {
  
  @ApiModelProperty(required = true, value = "")
  private List<AddressesAddresses> addresses = new ArrayList<AddressesAddresses>();
 /**
   * Get addresses
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<AddressesAddresses> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
  }

  public Addresses addresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Addresses addAddressesItem(AddressesAddresses addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addresses {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

