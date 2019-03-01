package io.swagger.model;

import io.swagger.model.DispatchJobCreate;
import io.swagger.model.JobStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DispatchJob  {
  
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.")
 /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
  **/
  private String destinationAddress = null;

  @ApiModelProperty(example = "67890", value = "ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.")
 /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
  **/
  private Long destinationAddressId = null;

  @ApiModelProperty(example = "123.456", value = "Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
 /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  **/
  private Double destinationLat = null;

  @ApiModelProperty(example = "37.459", value = "Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.")
 /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
  **/
  private Double destinationLng = null;

  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the job destination. If provided, it will take precedence over the name of the address book entry.")
 /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
  **/
  private String destinationName = null;

  @ApiModelProperty(example = "Ensure crates are stacked no more than 3 high.", value = "Notes regarding the details of this job.")
 /**
   * Notes regarding the details of this job.
  **/
  private String notes = null;

  @ApiModelProperty(example = "1462881998034", required = true, value = "The time at which the assigned driver is scheduled to arrive at the job destination.")
 /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
  **/
  private Long scheduledArrivalTimeMs = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is scheduled to depart from the job destination.")
 /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
  **/
  private Long scheduledDepartureTimeMs = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the driver arrived at the job destination.")
 /**
   * The time at which the driver arrived at the job destination.
  **/
  private Long arrivedAtMs = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked complete (e.g. started driving to the next destination).")
 /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
  **/
  private Long completedAtMs = null;

  @ApiModelProperty(example = "55", required = true, value = "ID of the route that this job belongs to.")
 /**
   * ID of the route that this job belongs to.
  **/
  private Long dispatchRouteId = null;

  @ApiModelProperty(example = "444", value = "ID of the driver assigned to the dispatch job.")
 /**
   * ID of the driver assigned to the dispatch job.
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).")
 /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
  **/
  private Long enRouteAtMs = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.")
 /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
  **/
  private Long estimatedArrivalMs = null;

  @ApiModelProperty(example = "https://cloud.samsara.com/fleet/viewer/job/fleet_viewer_token", value = "Fleet viewer url of the dispatch job.")
 /**
   * Fleet viewer url of the dispatch job.
  **/
  private String fleetViewerUrl = null;

  @ApiModelProperty(example = "101", required = true, value = "")
  private Long groupId = null;

  @ApiModelProperty(example = "773", required = true, value = "ID of the Samsara dispatch job.")
 /**
   * ID of the Samsara dispatch job.
  **/
  private Long id = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private JobStatus jobState = null;

  @ApiModelProperty(example = "1462881998034", value = "The time at which the job was marked skipped.")
 /**
   * The time at which the job was marked skipped.
  **/
  private Long skippedAtMs = null;

  @ApiModelProperty(example = "112", value = "ID of the vehicle used for the dispatch job.")
 /**
   * ID of the vehicle used for the dispatch job.
  **/
  private Long vehicleId = null;
 /**
   * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
   * @return destinationAddress
  **/
  @JsonProperty("destination_address")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public DispatchJob destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

 /**
   * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
   * @return destinationAddressId
  **/
  @JsonProperty("destination_address_id")
  public Long getDestinationAddressId() {
    return destinationAddressId;
  }

  public void setDestinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
  }

  public DispatchJob destinationAddressId(Long destinationAddressId) {
    this.destinationAddressId = destinationAddressId;
    return this;
  }

 /**
   * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLat
  **/
  @JsonProperty("destination_lat")
  public Double getDestinationLat() {
    return destinationLat;
  }

  public void setDestinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
  }

  public DispatchJob destinationLat(Double destinationLat) {
    this.destinationLat = destinationLat;
    return this;
  }

 /**
   * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
   * @return destinationLng
  **/
  @JsonProperty("destination_lng")
  public Double getDestinationLng() {
    return destinationLng;
  }

  public void setDestinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
  }

  public DispatchJob destinationLng(Double destinationLng) {
    this.destinationLng = destinationLng;
    return this;
  }

 /**
   * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
   * @return destinationName
  **/
  @JsonProperty("destination_name")
  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public DispatchJob destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

 /**
   * Notes regarding the details of this job.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DispatchJob notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * The time at which the assigned driver is scheduled to arrive at the job destination.
   * @return scheduledArrivalTimeMs
  **/
  @JsonProperty("scheduled_arrival_time_ms")
  @NotNull
  public Long getScheduledArrivalTimeMs() {
    return scheduledArrivalTimeMs;
  }

  public void setScheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
  }

  public DispatchJob scheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
    this.scheduledArrivalTimeMs = scheduledArrivalTimeMs;
    return this;
  }

 /**
   * The time at which the assigned driver is scheduled to depart from the job destination.
   * @return scheduledDepartureTimeMs
  **/
  @JsonProperty("scheduled_departure_time_ms")
  public Long getScheduledDepartureTimeMs() {
    return scheduledDepartureTimeMs;
  }

  public void setScheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
  }

  public DispatchJob scheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
    this.scheduledDepartureTimeMs = scheduledDepartureTimeMs;
    return this;
  }

 /**
   * The time at which the driver arrived at the job destination.
   * @return arrivedAtMs
  **/
  @JsonProperty("arrived_at_ms")
  public Long getArrivedAtMs() {
    return arrivedAtMs;
  }

  public void setArrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
  }

  public DispatchJob arrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
    return this;
  }

 /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
   * @return completedAtMs
  **/
  @JsonProperty("completed_at_ms")
  public Long getCompletedAtMs() {
    return completedAtMs;
  }

  public void setCompletedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
  }

  public DispatchJob completedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
    return this;
  }

 /**
   * ID of the route that this job belongs to.
   * @return dispatchRouteId
  **/
  @JsonProperty("dispatch_route_id")
  @NotNull
  public Long getDispatchRouteId() {
    return dispatchRouteId;
  }

  public void setDispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
  }

  public DispatchJob dispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
    return this;
  }

 /**
   * ID of the driver assigned to the dispatch job.
   * @return driverId
  **/
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchJob driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
   * @return enRouteAtMs
  **/
  @JsonProperty("en_route_at_ms")
  public Long getEnRouteAtMs() {
    return enRouteAtMs;
  }

  public void setEnRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
  }

  public DispatchJob enRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
    return this;
  }

 /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
   * @return estimatedArrivalMs
  **/
  @JsonProperty("estimated_arrival_ms")
  public Long getEstimatedArrivalMs() {
    return estimatedArrivalMs;
  }

  public void setEstimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
  }

  public DispatchJob estimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
    return this;
  }

 /**
   * Fleet viewer url of the dispatch job.
   * @return fleetViewerUrl
  **/
  @JsonProperty("fleet_viewer_url")
  public String getFleetViewerUrl() {
    return fleetViewerUrl;
  }

  public void setFleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
  }

  public DispatchJob fleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
    return this;
  }

 /**
   * Get groupId
   * @return groupId
  **/
  @JsonProperty("group_id")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchJob groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * ID of the Samsara dispatch job.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DispatchJob id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get jobState
   * @return jobState
  **/
  @JsonProperty("job_state")
  @NotNull
  public JobStatus getJobState() {
    return jobState;
  }

  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  public DispatchJob jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

 /**
   * The time at which the job was marked skipped.
   * @return skippedAtMs
  **/
  @JsonProperty("skipped_at_ms")
  public Long getSkippedAtMs() {
    return skippedAtMs;
  }

  public void setSkippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
  }

  public DispatchJob skippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
    return this;
  }

 /**
   * ID of the vehicle used for the dispatch job.
   * @return vehicleId
  **/
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DispatchJob vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

