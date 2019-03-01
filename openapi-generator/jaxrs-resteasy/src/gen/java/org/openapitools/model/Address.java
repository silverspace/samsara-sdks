package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import org.openapitools.model.Contact;
import org.openapitools.model.TagMetadata;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Information about an address/geofence. Geofences are either a circle or a polygon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class Address   {
  
  private List<Contact> contacts = new ArrayList<Contact>();
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private Long id;
  private String name;
  private String notes;
  private List<TagMetadata> tags = new ArrayList<TagMetadata>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("contacts")
  public List<Contact> getContacts() {
    return contacts;
  }
  public void setContacts(List<Contact> contacts) {
    this.contacts = contacts;
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
   * ID of the address
   **/
  
  @ApiModelProperty(example = "123", value = "ID of the address")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the address or geofence
   **/
  
  @ApiModelProperty(example = "Samsara HQ", value = "Name of the address or geofence")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Notes associated with an address.
   **/
  
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
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
  @JsonProperty("tags")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

