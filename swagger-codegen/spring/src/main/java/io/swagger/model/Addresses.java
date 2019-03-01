package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressesAddresses;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Addresses
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class Addresses   {
  @JsonProperty("addresses")
  @Valid
  private List<AddressesAddresses> addresses = new ArrayList<AddressesAddresses>();

  public Addresses addresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Addresses addAddressesItem(AddressesAddresses addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<AddressesAddresses> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addresses addresses = (Addresses) o;
    return Objects.equals(this.addresses, addresses.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

