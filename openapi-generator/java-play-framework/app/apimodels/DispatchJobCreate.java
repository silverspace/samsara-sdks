package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DispatchJobCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DispatchJobCreate   {
  @JsonProperty("destination_address")
  private String destinationAddress;

  @JsonProperty("destination_address_id")
  private Long destinationAddressId;

  @JsonProperty("destination_lat")
  private Double destinationLat;

  @JsonProperty("destination_lng")
  private Double destinationLng;

  @JsonProperty("destination_name")
  private String destinationName;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("scheduled_arrival_time_ms")
  private Long scheduledArrivalTimeMs;

  @JsonProperty("scheduled_departure_time_ms")
  private Long scheduledDepartureTimeMs;

  public DispatchJobCreate destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   * @return destinationAddress
  **/
    public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public DispatchJobCreate destinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
    return this;
  }

   /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   * @return destinationAddressId
  **/
    public Long getDestinationAddressId() {
    return destinationAddressId;
  }

  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

  public DispatchJobCreate destinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
    return this;
  }

   /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLat
  **/
    public Double getDestinationLat() {
    return destinationLat;
  }

  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

  public DispatchJobCreate destinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
    return this;
  }

   /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLng
  **/
    public Double getDestinationLng() {
    return destinationLng;
  }

  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

  public DispatchJobCreate destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

   /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   * @return destinationName
  **/
    public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public DispatchJobCreate notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes regarding the details of this job.
   * @return notes
  **/
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DispatchJobCreate scheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    return this;
  }

   /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   * @return scheduledArrivalTimeMs
  **/
  @NotNull
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }

  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

  public DispatchJobCreate scheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
    return this;
  }

   /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   * @return scheduledDepartureTimeMs
  **/
    public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }

  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchJobCreate dispatchJobCreate = (DispatchJobCreate) o;
    return Objects.equals(destinationAddress, dispatchJobCreate.destinationAddress) &&
        Objects.equals(destinationAddressId, dispatchJobCreate.destinationAddressId) &&
        Objects.equals(destinationLat, dispatchJobCreate.destinationLat) &&
        Objects.equals(destinationLng, dispatchJobCreate.destinationLng) &&
        Objects.equals(destinationName, dispatchJobCreate.destinationName) &&
        Objects.equals(notes, dispatchJobCreate.notes) &&
        Objects.equals(scheduledArrivalTimeMs, dispatchJobCreate.scheduledArrivalTimeMs) &&
        Objects.equals(scheduledDepartureTimeMs, dispatchJobCreate.scheduledDepartureTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationAddress, destinationAddressId, destinationLat, destinationLng, destinationName, notes, scheduledArrivalTimeMs, scheduledDepartureTimeMs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchJobCreate {\n");
    
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    destinationAddressId: ").append(toIndentedString(destinationAddressId)).append("\n");
    sb.append("    destinationLat: ").append(toIndentedString(destinationLat)).append("\n");
    sb.append("    destinationLng: ").append(toIndentedString(destinationLng)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    scheduledArrivalTimeMs: ").append(toIndentedString(scheduledArrivalTimeMs)).append("\n");
    sb.append("    scheduledDepartureTimeMs: ").append(toIndentedString(scheduledDepartureTimeMs)).append("\n");
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

