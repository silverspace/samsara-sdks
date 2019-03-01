package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class DispatchJobCreate   {
  
  private String destinationAddress;
  private Long destinationAddressId;
  private Double destinationLat;
  private Double destinationLng;
  private String destinationName;
  private String notes;
  private Long scheduledArrivalTimeMs;
  private Long scheduledDepartureTimeMs;

  /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   **/
  
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.")
  @JsonProperty("destination_address")
  public String getDestinationAddress() {
    return destinationAddress;
  }
  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   **/
  
  @ApiModelProperty(example = "67890", value = "ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.")
  @JsonProperty("destination_address_id")
  public Long getDestinationAddressId() {
    return destinationAddressId;
  }
  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

  /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   **/
  
  @ApiModelProperty(example = "123.456", value = "Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  @JsonProperty("destination_lat")
  public Double getDestinationLat() {
    return destinationLat;
  }
  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

  /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   **/
  
  @ApiModelProperty(example = "37.459", value = "Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
  @JsonProperty("destination_lng")
  public Double getDestinationLng() {
    return destinationLng;
  }
  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

  /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   **/
  
  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the job destination. If provided, it will take precedence over the name of the address book entry.")
  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  /**
   * Notes regarding the details of this job.
   **/
  
  @ApiModelProperty(example = "Ensure crates are stacked no more than 3 high.", value = "Notes regarding the details of this job.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   **/
  
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time at which the assigned driver is scheduled to arrive at the job destination.")
  @JsonProperty("scheduled_arrival_time_ms")
  @NotNull
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }
  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

  /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   **/
  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is scheduled to depart from the job destination.")
  @JsonProperty("scheduled_departure_time_ms")
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

