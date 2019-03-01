package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import org.openapitools.model.Contact;
import org.openapitools.model.TagMetadata;

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 */
@ApiModel(description = "Information about an address/geofence. Geofences are either a circle or a polygon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class Address   {
  @JsonProperty("contacts")
  private List<Contact> contacts = null;

  @JsonProperty("formattedAddress")
  private String formattedAddress;

  @JsonProperty("geofence")
  private AddressGeofence geofence = null;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("tags")
  private List<TagMetadata> tags = null;

  public Address contacts(List<Contact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Address addContactsItem(Contact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<Contact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @ApiModelProperty(value = "")
  public List<Contact> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

  public Address formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public Address geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

   /**
   * Get geofence
   * @return geofence
  **/
  @ApiModelProperty(value = "")
  public AddressGeofence getGeofence() {
    return geofence;
  }

  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  public Address id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the address
   * @return id
  **/
  @ApiModelProperty(example = "123", value = "ID of the address")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Address name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the address or geofence
   * @return name
  **/
  @ApiModelProperty(example = "Samsara HQ", value = "Name of the address or geofence")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes associated with an address.
   * @return notes
  **/
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Address tags(List<TagMetadata> tags) {
    this.tags = tags;
    return this;
  }

  public Address addTagsItem(TagMetadata tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagMetadata>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<TagMetadata> getTags() {
    return tags;
  }

  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
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
    return Objects.equals(this.contacts, address.contacts) &&
        Objects.equals(this.formattedAddress, address.formattedAddress) &&
        Objects.equals(this.geofence, address.geofence) &&
        Objects.equals(this.id, address.id) &&
        Objects.equals(this.name, address.name) &&
        Objects.equals(this.notes, address.notes) &&
        Objects.equals(this.tags, address.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts, formattedAddress, geofence, id, name, notes, tags);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

