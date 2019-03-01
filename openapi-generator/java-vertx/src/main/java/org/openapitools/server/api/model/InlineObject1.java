package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AddressGeofence;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject1   {
  
  private List<Long> contactIds = new ArrayList<>();
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private String name;
  private String notes;
  private List<Long> tagIds = new ArrayList<>();

  public InlineObject1 () {

  }

  public InlineObject1 (List<Long> contactIds, String formattedAddress, AddressGeofence geofence, String name, String notes, List<Long> tagIds) {
    this.contactIds = contactIds;
    this.formattedAddress = formattedAddress;
    this.geofence = geofence;
    this.name = name;
    this.notes = notes;
    this.tagIds = tagIds;
  }

    
  @JsonProperty("contactIds")
  public List<Long> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
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

    
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(contactIds, inlineObject1.contactIds) &&
        Objects.equals(formattedAddress, inlineObject1.formattedAddress) &&
        Objects.equals(geofence, inlineObject1.geofence) &&
        Objects.equals(name, inlineObject1.name) &&
        Objects.equals(notes, inlineObject1.notes) &&
        Objects.equals(tagIds, inlineObject1.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIds, formattedAddress, geofence, name, notes, tagIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
