package apimodels;

import apimodels.AddressGeofence;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AddressesAddresses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AddressesAddresses   {
  @JsonProperty("notes")
  private String notes;

  @JsonProperty("formattedAddress")
  private String formattedAddress;

  @JsonProperty("geofence")
  private AddressGeofence geofence = null;

  @JsonProperty("tagIds")
  private List<Long> tagIds = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("contactIds")
  private List<Long> contactIds = null;

  public AddressesAddresses notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes associated with an address.
   * @return notes
  **/
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public AddressesAddresses formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
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
  @NotNull
@Valid
  public AddressGeofence getGeofence() {
    return geofence;
  }

  public void setGeofence(AddressGeofence geofence) {
    this.geofence = geofence;
  }

  public AddressesAddresses tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public AddressesAddresses addTagIdsItem(Long tagIdsItem) {
    if (tagIds == null) {
      tagIds = new ArrayList<>();
    }
    tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * A list of tag IDs.
   * @return tagIds
  **/
    public List<Long> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }

  public AddressesAddresses name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this address/geofence
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AddressesAddresses contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public AddressesAddresses addContactIdsItem(Long contactIdsItem) {
    if (contactIds == null) {
      contactIds = new ArrayList<>();
    }
    contactIds.add(contactIdsItem);
    return this;
  }

   /**
   * A list of IDs for contact book entries.
   * @return contactIds
  **/
    public List<Long> getContactIds() {
    return contactIds;
  }

  public void setContactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

