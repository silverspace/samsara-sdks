package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofence;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class InlineObject1   {
  @JsonProperty("contactIds")
  @Valid
  private List<Long> contactIds = null;

  @JsonProperty("formattedAddress")
  private String formattedAddress;

  @JsonProperty("geofence")
  private AddressGeofence geofence = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("tagIds")
  @Valid
  private List<Long> tagIds = null;

  public InlineObject1 contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public InlineObject1 addContactIdsItem(Long contactIdsItem) {
    if (this.contactIds == null) {
      this.contactIds = new ArrayList<>();
    }
    this.contactIds.add(contactIdsItem);
    return this;
  }

  /**
   * A list of IDs for contact book entries.
   * @return contactIds
  */
  @ApiModelProperty(value = "A list of IDs for contact book entries.")


  public List<Long> getContactIds() {
    return contactIds;
  }

  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
  }

  public InlineObject1 formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  */
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")


  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public InlineObject1 geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

  /**
   * Get geofence
   * @return geofence
  */
  @ApiModelProperty(value = "")

  @Valid

  public AddressGeofence getGeofence() {
    return geofence;
  }

  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  public InlineObject1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this address/geofence
   * @return name
  */
  @ApiModelProperty(example = "Samsara HQ", value = "The name of this address/geofence")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineObject1 notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes associated with an address.
   * @return notes
  */
  @ApiModelProperty(example = "Delivery site 1", value = "Notes associated with an address.")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public InlineObject1 tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public InlineObject1 addTagIdsItem(Long tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

  /**
   * A list of tag IDs.
   * @return tagIds
  */
  @ApiModelProperty(value = "A list of tag IDs.")


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
    return Objects.equals(this.contactIds, inlineObject1.contactIds) &&
        Objects.equals(this.formattedAddress, inlineObject1.formattedAddress) &&
        Objects.equals(this.geofence, inlineObject1.geofence) &&
        Objects.equals(this.name, inlineObject1.name) &&
        Objects.equals(this.notes, inlineObject1.notes) &&
        Objects.equals(this.tagIds, inlineObject1.tagIds);
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

