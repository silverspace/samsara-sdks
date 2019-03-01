package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressGeofence;
import io.swagger.model.ContactIds;
import io.swagger.model.TagIds;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class Address   {
  
  private ContactIds contactIds = null;
  private String formattedAddress = null;
  private AddressGeofence geofence = null;
  private String name = null;
  private String notes = null;
  private TagIds tagIds = null;

  /**
   **/
  public Address contactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contactIds")
  public ContactIds getContactIds() {
    return contactIds;
  }
  public void setContactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
  }

  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   **/
  public Address formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
  @JsonProperty("formattedAddress")
  public String getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  /**
   **/
  public Address geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("geofence")
  public AddressGeofence getGeofence() {
    return geofence;
  }
  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  /**
   * The name of this address/geofence
   **/
  public Address name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Samsara HQ", value = "The name of this address/geofence")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Address notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   **/
  public Address tagIds(TagIds tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tagIds")
  public TagIds getTagIds() {
    return tagIds;
  }
  public void setTagIds(TagIds tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(contactIds, address.contactIds) &&
        Objects.equals(formattedAddress, address.formattedAddress) &&
        Objects.equals(geofence, address.geofence) &&
        Objects.equals(name, address.name) &&
        Objects.equals(notes, address.notes) &&
        Objects.equals(tagIds, address.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIds, formattedAddress, geofence, name, notes, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

