package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AddressGeofence;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AddressesAddresses   {
  
  private String notes;
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private List<Long> tagIds = new ArrayList<>();
  private String name;
  private List<Long> contactIds = new ArrayList<>();

  public AddressesAddresses () {

  }

  public AddressesAddresses (String notes, String formattedAddress, AddressGeofence geofence, List<Long> tagIds, String name, List<Long> contactIds) {
    this.notes = notes;
    this.formattedAddress = formattedAddress;
    this.geofence = geofence;
    this.tagIds = tagIds;
    this.name = name;
    this.contactIds = contactIds;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
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

    
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("contactIds")
  public List<Long> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
