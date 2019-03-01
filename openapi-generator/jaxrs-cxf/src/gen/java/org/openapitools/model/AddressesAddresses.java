package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressesAddresses  {
  
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
 /**
   * Notes associated with an address.
  **/
  private String notes;

  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", required = true, value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
  **/
  private String formattedAddress;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AddressGeofence geofence = null;

  @ApiModelProperty(value = "A list of tag IDs.")
 /**
   * A list of tag IDs.
  **/
  private List<Long> tagIds = null;

  @ApiModelProperty(example = "Samsara HQ", required = true, value = "The name of this address/geofence")
 /**
   * The name of this address/geofence
  **/
  private String name;

  @ApiModelProperty(value = "A list of IDs for contact book entries.")
 /**
   * A list of IDs for contact book entries.
  **/
  private List<Long> contactIds = null;
 /**
   * Notes associated with an address.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AddressesAddresses notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
  @JsonProperty("formattedAddress")
  @NotNull
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public AddressesAddresses formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

 /**
   * Get geofence
   * @return geofence
  **/
  @JsonProperty("geofence")
  @NotNull
  public AddressGeofence getGeofence() {
    return geofence;
  }

  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  public AddressesAddresses geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

 /**
   * A list of tag IDs.
   * @return tagIds
  **/
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

  public AddressesAddresses tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public AddressesAddresses addTagIdsItem(Long tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }

 /**
   * The name of this address/geofence
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressesAddresses name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A list of IDs for contact book entries.
   * @return contactIds
  **/
  @JsonProperty("contactIds")
  public List<Long> getContactIds() {
    return contactIds;
  }

  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
  }

  public AddressesAddresses contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public AddressesAddresses addContactIdsItem(Long contactIdsItem) {
    this.contactIds.add(contactIdsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

