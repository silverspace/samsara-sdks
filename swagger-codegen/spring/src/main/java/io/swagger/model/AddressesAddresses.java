package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressGeofence;
import io.swagger.model.ContactIds;
import io.swagger.model.TagIds;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressesAddresses
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AddressesAddresses   {
  @JsonProperty("contactIds")
  private ContactIds contactIds = null;

  @JsonProperty("formattedAddress")
  private String formattedAddress = null;

  @JsonProperty("geofence")
  private AddressGeofence geofence = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("tagIds")
  private TagIds tagIds = null;

  public AddressesAddresses contactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  /**
   * Get contactIds
   * @return contactIds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContactIds getContactIds() {
    return contactIds;
  }

  public void setContactIds(ContactIds contactIds) {
    this.contactIds = contactIds;
  }

  public AddressesAddresses formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", required = true, value = "The full address associated with this address/geofence, as it might be recognized by maps.google.com")
  @NotNull


  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public AddressesAddresses geofence(AddressGeofence geofence) {
    this.geofence = geofence;
    return this;
  }

  /**
   * Get geofence
   * @return geofence
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public AddressGeofence getGeofence() {
    return geofence;
  }

  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  public AddressesAddresses name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this address/geofence
   * @return name
  **/
  @ApiModelProperty(example = "Samsara HQ", required = true, value = "The name of this address/geofence")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressesAddresses notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AddressesAddresses tagIds(TagIds tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  /**
   * Get tagIds
   * @return tagIds
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    AddressesAddresses addressesAddresses = (AddressesAddresses) o;
    return Objects.equals(this.contactIds, addressesAddresses.contactIds) &&
        Objects.equals(this.formattedAddress, addressesAddresses.formattedAddress) &&
        Objects.equals(this.geofence, addressesAddresses.geofence) &&
        Objects.equals(this.name, addressesAddresses.name) &&
        Objects.equals(this.notes, addressesAddresses.notes) &&
        Objects.equals(this.tagIds, addressesAddresses.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactIds, formattedAddress, geofence, name, notes, tagIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesAddresses {\n");
    
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

