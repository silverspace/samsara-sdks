package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import org.openapitools.model.Contact;
import org.openapitools.model.TagMetadata;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Information about an address/geofence. Geofences are either a circle or a polygon.
 **/
@ApiModel(description="Information about an address/geofence. Geofences are either a circle or a polygon.")
public class Address  {
  
  @ApiModelProperty(value = "")
  private List<Contact> contacts = null;

  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
 /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
  **/
  private String formattedAddress;

  @ApiModelProperty(value = "")
  private AddressGeofence geofence = null;

  @ApiModelProperty(example = "123", value = "ID of the address")
 /**
   * ID of the address
  **/
  private Long id;

  @ApiModelProperty(example = "Samsara HQ", value = "Name of the address or geofence")
 /**
   * Name of the address or geofence
  **/
  private String name;

  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
 /**
   * Notes associated with an address.
  **/
  private String notes;

  @ApiModelProperty(value = "")
  private List<TagMetadata> tags = null;
 /**
   * Get contacts
   * @return contacts
  **/
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Address contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Address addContactsItem(Contact contactsItem) {
    this.contacts.add(contactsItem);
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

  public Address formattedAddress(String formattedAddress) {
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

  public Address geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

 /**
   * ID of the address
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Address id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the address or geofence
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address name(String name) {
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

  public Address notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Get tags
   * @return tags
  **/
  @JsonProperty("tags")
  public List<TagMetadata> getTags() {
    return tags;
  }

  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }

  public Address tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  public Address addTagsItem(TagMetadata tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
    sb.append("    geofence: ").append(toIndentedString(geofence)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

