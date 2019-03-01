package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class InlineObject1   {
  
  private List<Long> contactIds = new ArrayList<Long>();
  private String formattedAddress;
  private AddressGeofence geofence = null;
  private String name;
  private String notes;
  private List<Long> tagIds = new ArrayList<Long>();

  /**
   * A list of IDs for contact book entries.
   **/
  public InlineObject1 contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of IDs for contact book entries.")
  @JsonProperty("contactIds")
  public List<Long> getContactIds() {
    return contactIds;
  }
  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
  }

  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   **/
  public InlineObject1 formattedAddress(String formattedAddress) {
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
  public InlineObject1 geofence(AddressGeofence geofence) {
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
  public InlineObject1 name(String name) {
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
   * Notes associated with an address.
   **/
  public InlineObject1 notes(String notes) {
    this.notes = notes;
    return this;
  }

  
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * A list of tag IDs.
   **/
  public InlineObject1 tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tag IDs.")
  @JsonProperty("tagIds")
  public List<Long> getTagIds() {
    return tagIds;
  }
  public void setTagIds(List<Long> tagIds) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

