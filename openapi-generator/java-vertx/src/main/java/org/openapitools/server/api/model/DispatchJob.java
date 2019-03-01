package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.DispatchJobCreate;
import org.openapitools.server.api.model.JobStatus;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DispatchJob   {
  
  private String destinationAddress;
  private Long destinationAddressId;
  private Double destinationLat;
  private Double destinationLng;
  private String destinationName;
  private String notes;
  private Long scheduledArrivalTimeMs;
  private Long scheduledDepartureTimeMs;
  private Long arrivedAtMs;
  private Long completedAtMs;
  private Long dispatchRouteId;
  private Long driverId;
  private Long enRouteAtMs;
  private Long estimatedArrivalMs;
  private String fleetViewerUrl;
  private Long groupId;
  private Long id;
  private JobStatus jobState;
  private Long skippedAtMs;
  private Long vehicleId;

  public DispatchJob () {

  }

  public DispatchJob (String destinationAddress, Long destinationAddressId, Double destinationLat, Double destinationLng, String destinationName, String notes, Long scheduledArrivalTimeMs, Long scheduledDepartureTimeMs, Long arrivedAtMs, Long completedAtMs, Long dispatchRouteId, Long driverId, Long enRouteAtMs, Long estimatedArrivalMs, String fleetViewerUrl, Long groupId, Long id, JobStatus jobState, Long skippedAtMs, Long vehicleId) {
    this.destinationAddress = destinationAddress;
    this.destinationAddressId = destinationAddressId;
    this.destinationLat = destinationLat;
    this.destinationLng = destinationLng;
    this.destinationName = destinationName;
    this.notes = notes;
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
    this.arrivedAtMs = arrivedAtMs;
    this.completedAtMs = completedAtMs;
    this.dispatchRouteId = dispatchRouteId;
    this.driverId = driverId;
    this.enRouteAtMs = enRouteAtMs;
    this.estimatedArrivalMs = estimatedArrivalMs;
    this.fleetViewerUrl = fleetViewerUrl;
    this.groupId = groupId;
    this.id = id;
    this.jobState = jobState;
    this.skippedAtMs = skippedAtMs;
    this.vehicleId = vehicleId;
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

    
  @JsonProperty("arrived_at_ms")
  public Long getArrivedAtMs() {
    return arrivedAtMs;
  }
  public void setArrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
  }

    
  @JsonProperty("completed_at_ms")
  public Long getCompletedAtMs() {
    return completedAtMs;
  }
  public void setCompletedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
  }

    
  @JsonProperty("dispatch_route_id")
  public Long getDispatchRouteId() {
    return dispatchRouteId;
  }
  public void setDispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
  }

    
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("en_route_at_ms")
  public Long getEnRouteAtMs() {
    return enRouteAtMs;
  }
  public void setEnRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
  }

    
  @JsonProperty("estimated_arrival_ms")
  public Long getEstimatedArrivalMs() {
    return estimatedArrivalMs;
  }
  public void setEstimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
  }

    
  @JsonProperty("fleet_viewer_url")
  public String getFleetViewerUrl() {
    return fleetViewerUrl;
  }
  public void setFleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
  }

    
  @JsonProperty("group_id")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("job_state")
  public JobStatus getJobState() {
    return jobState;
  }
  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

    
  @JsonProperty("skipped_at_ms")
  public Long getSkippedAtMs() {
    return skippedAtMs;
  }
  public void setSkippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
  }

    
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchJob dispatchJob = (DispatchJob) o;
    return Objects.equals(destinationAddress, dispatchJob.destinationAddress) &&
        Objects.equals(destinationAddressId, dispatchJob.destinationAddressId) &&
        Objects.equals(destinationLat, dispatchJob.destinationLat) &&
        Objects.equals(destinationLng, dispatchJob.destinationLng) &&
        Objects.equals(destinationName, dispatchJob.destinationName) &&
        Objects.equals(notes, dispatchJob.notes) &&
        Objects.equals(scheduledArrivalTimeMs, dispatchJob.scheduledArrivalTimeMs) &&
        Objects.equals(scheduledDepartureTimeMs, dispatchJob.scheduledDepartureTimeMs) &&
        Objects.equals(arrivedAtMs, dispatchJob.arrivedAtMs) &&
        Objects.equals(completedAtMs, dispatchJob.completedAtMs) &&
        Objects.equals(dispatchRouteId, dispatchJob.dispatchRouteId) &&
        Objects.equals(driverId, dispatchJob.driverId) &&
        Objects.equals(enRouteAtMs, dispatchJob.enRouteAtMs) &&
        Objects.equals(estimatedArrivalMs, dispatchJob.estimatedArrivalMs) &&
        Objects.equals(fleetViewerUrl, dispatchJob.fleetViewerUrl) &&
        Objects.equals(groupId, dispatchJob.groupId) &&
        Objects.equals(id, dispatchJob.id) &&
        Objects.equals(jobState, dispatchJob.jobState) &&
        Objects.equals(skippedAtMs, dispatchJob.skippedAtMs) &&
        Objects.equals(vehicleId, dispatchJob.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationAddress, destinationAddressId, destinationLat, destinationLng, destinationName, notes, scheduledArrivalTimeMs, scheduledDepartureTimeMs, arrivedAtMs, completedAtMs, dispatchRouteId, driverId, enRouteAtMs, estimatedArrivalMs, fleetViewerUrl, groupId, id, jobState, skippedAtMs, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchJob {\n");
    
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    destinationAddressId: ").append(toIndentedString(destinationAddressId)).append("\n");
    sb.append("    destinationLat: ").append(toIndentedString(destinationLat)).append("\n");
    sb.append("    destinationLng: ").append(toIndentedString(destinationLng)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    scheduledArrivalTimeMs: ").append(toIndentedString(scheduledArrivalTimeMs)).append("\n");
    sb.append("    scheduledDepartureTimeMs: ").append(toIndentedString(scheduledDepartureTimeMs)).append("\n");
    sb.append("    arrivedAtMs: ").append(toIndentedString(arrivedAtMs)).append("\n");
    sb.append("    completedAtMs: ").append(toIndentedString(completedAtMs)).append("\n");
    sb.append("    dispatchRouteId: ").append(toIndentedString(dispatchRouteId)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    enRouteAtMs: ").append(toIndentedString(enRouteAtMs)).append("\n");
    sb.append("    estimatedArrivalMs: ").append(toIndentedString(estimatedArrivalMs)).append("\n");
    sb.append("    fleetViewerUrl: ").append(toIndentedString(fleetViewerUrl)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
    sb.append("    skippedAtMs: ").append(toIndentedString(skippedAtMs)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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
