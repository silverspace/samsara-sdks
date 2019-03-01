package io.swagger.model;

import io.swagger.model.AddressGeofence;
import io.swagger.model.ContactIds;
import io.swagger.model.TagIds;

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
  
  @ApiModelProperty(value = "")
  private ContactIds contactIds = null;

  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", required = true, value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
  **/
  private String formattedAddress = null;

  @ApiModelProperty(required = true, value = "")
  private AddressGeofence geofence = null;

  @ApiModelProperty(example = "Samsara HQ", required = true, value = "The name of this address/geofence")
 /**
   * The name of this address/geofence
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private String notes = null;

  @ApiModelProperty(value = "")
  private TagIds tagIds = null;
 /**
   * Get contactIds
   * @return contactIds
  **/
  @JsonProperty("contactIds")
  public ContactIds getContactIds() {
    return contactIds;
  }

  public void setContactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
  }

  public AddressesAddresses contactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
    return this;
  }

 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
  @JsonProperty("formattedAddress")
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
   * The name of this address/geofence
   * @return name
  **/
  @JsonProperty("name")
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
   * Get notes
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
   * Get tagIds
   * @return tagIds
  **/
  @JsonProperty("tagIds")
  public TagIds getTagIds() {
    return tagIds;
  }

  public void setTagIds(TagIds tagIds) {
    this.tagIds = tagIds;
  }

  public AddressesAddresses tagIds(TagIds tagIds) {
    this.tagIds = tagIds;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesAddresses {\n");
    
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geofence: ").append(toIndentedString(geofence)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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

