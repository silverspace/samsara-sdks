package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AddressGeofence;
import org.openapitools.server.api.model.Contact;
import org.openapitools.server.api.model.TagMetadata;

/**
 * Information about an address/geofence. Geofences are either a circle or a polygon.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Address   {
  
  private List<Contact> contacts = new ArrayList<>();
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private Long id;
  private String name;
  private String notes;
  private List<TagMetadata> tags = new ArrayList<>();

  public Address () {

  }

  public Address (List<Contact> contacts, String formattedAddress, AddressGeofence geofence, Long id, String name, String notes, List<TagMetadata> tags) {
    this.contacts = contacts;
    this.formattedAddress = formattedAddress;
    this.geofence = geofence;
    this.id = id;
    this.name = name;
    this.notes = notes;
    this.tags = tags;
  }

    
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
  }

    
  @JsonProperty("formattedAddress")
  public String getFormattedAddress() {
    return formattedAddress;
  }
  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

    
  @JsonProperty("geofence")
  public AddressGeofence getGeofence() {
    return geofence;
  }
  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("tags")
  public List<TagMetadata> getTags() {
    return tags;
  }
  public void setTags(List<TagMetadata> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(contacts, address.contacts) &&
        Objects.equals(formattedAddress, address.formattedAddress) &&
        Objects.equals(geofence, address.geofence) &&
        Objects.equals(id, address.id) &&
        Objects.equals(name, address.name) &&
        Objects.equals(notes, address.notes) &&
        Objects.equals(tags, address.tags);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
