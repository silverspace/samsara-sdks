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
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineObject1   {
  @JsonProperty("contactIds")
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
  private List<Long> tagIds = null;

  public InlineObject1 contactIds(List<Long> contactIds) {
    this.contactIds = contactIds;
    return this;
  }

  public InlineObject1 addContactIdsItem(Long contactIdsItem) {
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

  public InlineObject1 formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

   /**
   * The full address associated with this address/geofence, as it might be recognized by maps.google.com
   * @return formattedAddress
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

