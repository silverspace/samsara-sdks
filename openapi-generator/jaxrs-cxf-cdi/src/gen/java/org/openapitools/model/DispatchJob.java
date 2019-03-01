package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DispatchJobCreate;
import org.openapitools.model.JobStatus;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



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


  /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   **/
  public DispatchJob destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

  
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
  public DispatchJob destinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
    return this;
  }

  
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
  public DispatchJob destinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
    return this;
  }

  
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
  public DispatchJob destinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
    return this;
  }

  
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
  public DispatchJob destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

  
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
  public DispatchJob notes(String notes) {
    this.notes = notes;
    return this;
  }

  
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
  public DispatchJob scheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    return this;
  }

  
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
  public DispatchJob scheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is scheduled to depart from the job destination.")
  @JsonProperty("scheduled_departure_time_ms")
  public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }
  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }


  /**
   * The time at which the driver arrived at the job destination.
   **/
  public DispatchJob arrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the driver arrived at the job destination.")
  @JsonProperty("arrived_at_ms")
  public Long getArrivedAtMs() {
    return arrivedAtMs;
  }
  public void setArrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
  }


  /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
   **/
  public DispatchJob completedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked complete (e.g. started driving to the next destination).")
  @JsonProperty("completed_at_ms")
  public Long getCompletedAtMs() {
    return completedAtMs;
  }
  public void setCompletedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
  }


  /**
   * ID of the route that this job belongs to.
   **/
  public DispatchJob dispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
    return this;
  }

  
  @ApiModelProperty(example = "55", required = true, value = "ID of the route that this job belongs to.")
  @JsonProperty("dispatch_route_id")
  @NotNull
  public Long getDispatchRouteId() {
    return dispatchRouteId;
  }
  public void setDispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
  }


  /**
   * ID of the driver assigned to the dispatch job.
   **/
  public DispatchJob driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "444", value = "ID of the driver assigned to the dispatch job.")
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }


  /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
   **/
  public DispatchJob enRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).")
  @JsonProperty("en_route_at_ms")
  public Long getEnRouteAtMs() {
    return enRouteAtMs;
  }
  public void setEnRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
  }


  /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
   **/
  public DispatchJob estimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.")
  @JsonProperty("estimated_arrival_ms")
  public Long getEstimatedArrivalMs() {
    return estimatedArrivalMs;
  }
  public void setEstimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
  }


  /**
   * Fleet viewer url of the dispatch job.
   **/
  public DispatchJob fleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://cloud.samsara.com/fleet/viewer/job/fleet_viewer_token", value = "Fleet viewer url of the dispatch job.")
  @JsonProperty("fleet_viewer_url")
  public String getFleetViewerUrl() {
    return fleetViewerUrl;
  }
  public void setFleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
  }


  /**
   **/
  public DispatchJob groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", required = true, value = "")
  @JsonProperty("group_id")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  /**
   * ID of the Samsara dispatch job.
   **/
  public DispatchJob id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "773", required = true, value = "ID of the Samsara dispatch job.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   **/
  public DispatchJob jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("job_state")
  @NotNull
  public JobStatus getJobState() {
    return jobState;
  }
  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }


  /**
   * The time at which the job was marked skipped.
   **/
  public DispatchJob skippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked skipped.")
  @JsonProperty("skipped_at_ms")
  public Long getSkippedAtMs() {
    return skippedAtMs;
  }
  public void setSkippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
  }


  /**
   * ID of the vehicle used for the dispatch job.
   **/
  public DispatchJob vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "112", value = "ID of the vehicle used for the dispatch job.")
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

