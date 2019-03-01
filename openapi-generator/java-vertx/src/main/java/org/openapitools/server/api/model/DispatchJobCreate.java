package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DispatchJobCreate   {
  
  private String destinationAddress;
  private Long destinationAddressId;
  private Double destinationLat;
  private Double destinationLng;
  private String destinationName;
  private String notes;
  private Long scheduledArrivalTimeMs;
  private Long scheduledDepartureTimeMs;

  public DispatchJobCreate () {

  }

  public DispatchJobCreate (String destinationAddress, Long destinationAddressId, Double destinationLat, Double destinationLng, String destinationName, String notes, Long scheduledArrivalTimeMs, Long scheduledDepartureTimeMs) {
    this.destinationAddress = destinationAddress;
    this.destinationAddressId = destinationAddressId;
    this.destinationLat = destinationLat;
    this.destinationLng = destinationLng;
    this.destinationName = destinationName;
    this.notes = notes;
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }

    
  @JsonProperty("destination_address")
  public String getDestinationAddress() {
    return destinationAddress;
  }
  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

    
  @JsonProperty("destination_address_id")
  public Long getDestinationAddressId() {
    return destinationAddressId;
  }
  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

    
  @JsonProperty("destination_lat")
  public Double getDestinationLat() {
    return destinationLat;
  }
  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

    
  @JsonProperty("destination_lng")
  public Double getDestinationLng() {
    return destinationLng;
  }
  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

    
  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }
  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("scheduled_arrival_time_ms")
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }
  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

    
  @JsonProperty("scheduled_departure_time_ms")
  public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }
  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
