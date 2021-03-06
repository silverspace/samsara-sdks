package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InlineObject1  {
  
  @ApiModelProperty(value = "A list of IDs for contact book entries.")
 /**
   * A list of IDs for contact book entries.
  **/
  private List<Long> contactIds = null;

  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
  **/
  private String formattedAddress;

  @ApiModelProperty(value = "")
  private AddressGeofence geofence = null;

  @ApiModelProperty(example = "Samsara HQ", value = "The name of this address/geofence")
 /**
   * The name of this address/geofence
  **/
  private String name;

  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
 /**
   * Notes associated with an address.
  **/
  private String notes;

  @ApiModelProperty(value = "A list of tag IDs.")
 /**
   * A list of tag IDs.
  **/
  private List<Long> tagIds = null;
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

  public InlineObject1 contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public InlineObject1 addContactIdsItem(Long contactIdsItem) {
    this.contactIds.add(contactIdsItem);
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

  public InlineObject1 formattedAddress(String formattedAddress) {
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

  public InlineObject1 geofence(AddressGeofence geofence) {
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

  public InlineObject1 name(String name) {
    this.name = name;
    return this;
  }

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

  public InlineObject1 notes(String notes) {
    this.notes = notes;
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

  public InlineObject1 tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public InlineObject1 addTagIdsItem(Long tagIdsItem) {
    this.tagIds.add(tagIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
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

