package apimodels;

import apimodels.AddressesAddresses;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject   {
  @JsonProperty("addresses")
  private List<AddressesAddresses> addresses = new ArrayList<>();

  public InlineObject addresses(List<AddressesAddresses> addresses) {
    this.addresses = addresses;
    return this;
  }

  public InlineObject addAddressesItem(AddressesAddresses addressesItem) {
    addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
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
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(addresses, inlineObject.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

