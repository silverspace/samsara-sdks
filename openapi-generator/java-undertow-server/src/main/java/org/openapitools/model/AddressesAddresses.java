package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class AddressesAddresses   {
  
  private String notes;
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private List<Long> tagIds = new ArrayList<Long>();
  private String name;
  private List<Long> contactIds = new ArrayList<Long>();

  /**
   * Notes associated with an address.
   **/
  public AddressesAddresses notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   **/
  public AddressesAddresses formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", required = true, value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
  @JsonProperty("formattedAddress")
  public String getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  /**
   **/
  public AddressesAddresses geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("geofence")
  public AddressGeofence getGeofence() {
    return geofence;
  }
  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  /**
   * A list of tag IDs.
   **/
  public AddressesAddresses tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tag IDs.")
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

  /**
   * The name of this address/geofence
   **/
  public AddressesAddresses name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Samsara HQ", required = true, value = "The name of this address/geofence")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of IDs for contact book entries.
   **/
  public AddressesAddresses contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of IDs for contact book entries.")
  @JsonProperty("contactIds")
  public List<Long> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesAddresses addressesAddresses = (AddressesAddresses) o;
    return Objects.equals(notes, addressesAddresses.notes) &&
        Objects.equals(formattedAddress, addressesAddresses.formattedAddress) &&
        Objects.equals(geofence, addressesAddresses.geofence) &&
        Objects.equals(tagIds, addressesAddresses.tagIds) &&
        Objects.equals(name, addressesAddresses.name) &&
        Objects.equals(contactIds, addressesAddresses.contactIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, formattedAddress, geofence, tagIds, name, contactIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesAddresses {\n");
    
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geofence: ").append(toIndentedString(geofence)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
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

