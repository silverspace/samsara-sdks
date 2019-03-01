package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AddressGeofence;
import io.swagger.model.ContactIds;
import io.swagger.model.TagIds;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class Address   {
  
  private ContactIds contactIds = null;
  private String formattedAddress = null;
  private AddressGeofence geofence = null;
  private String name = null;
  private String notes = null;
  private TagIds tagIds = null;

  /**
   **/
  
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

