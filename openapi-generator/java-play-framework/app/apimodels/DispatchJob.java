package apimodels;

import apimodels.DispatchJobCreate;
import apimodels.JobStatus;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DispatchJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DispatchJob   {
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

  @JsonProperty("arrived_at_ms")
  private Long arrivedAtMs;

  @JsonProperty("completed_at_ms")
  private Long completedAtMs;

  @JsonProperty("dispatch_route_id")
  private Long dispatchRouteId;

  @JsonProperty("driver_id")
  private Long driverId;

  @JsonProperty("en_route_at_ms")
  private Long enRouteAtMs;

  @JsonProperty("estimated_arrival_ms")
  private Long estimatedArrivalMs;

  @JsonProperty("fleet_viewer_url")
  private String fleetViewerUrl;

  @JsonProperty("group_id")
  private Long groupId;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("job_state")
  private JobStatus jobState;

  @JsonProperty("skipped_at_ms")
  private Long skippedAtMs;

  @JsonProperty("vehicle_id")
  private Long vehicleId;

  public DispatchJob destinationAddress(String destinationAddress) {
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

  public DispatchJob destinationAddressId(Long destinationAddressId) {
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

  public DispatchJob destinationLat(Double destinationLat) {
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

  public DispatchJob destinationLng(Double destinationLng) {
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

  public DispatchJob destinationName(String destinationName) {
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

  public DispatchJob notes(String notes) {
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

  public DispatchJob scheduledArrivalTimeMs(Long scheduledArrivalTimeMs) {
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

  public DispatchJob scheduledDepartureTimeMs(Long scheduledDepartureTimeMs) {
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

  public DispatchJob arrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
    return this;
  }

   /**
   * The time at which the driver arrived at the job destination.
   * @return arrivedAtMs
  **/
    public Long getArrivedAtMs() {
    return arrivedAtMs;
  }

  public void setArrivedAtMs(Long arrivedAtMs) {
    this.arrivedAtMs = arrivedAtMs;
  }

  public DispatchJob completedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
    return this;
  }

   /**
   * The time at which the job was marked complete (e.g. started driving to the next destination).
   * @return completedAtMs
  **/
    public Long getCompletedAtMs() {
    return completedAtMs;
  }

  public void setCompletedAtMs(Long completedAtMs) {
    this.completedAtMs = completedAtMs;
  }

  public DispatchJob dispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
    return this;
  }

   /**
   * ID of the route that this job belongs to.
   * @return dispatchRouteId
  **/
  @NotNull
  public Long getDispatchRouteId() {
    return dispatchRouteId;
  }

  public void setDispatchRouteId(Long dispatchRouteId) {
    this.dispatchRouteId = dispatchRouteId;
  }

  public DispatchJob driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver assigned to the dispatch job.
   * @return driverId
  **/
    public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchJob enRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
    return this;
  }

   /**
   * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
   * @return enRouteAtMs
  **/
    public Long getEnRouteAtMs() {
    return enRouteAtMs;
  }

  public void setEnRouteAtMs(Long enRouteAtMs) {
    this.enRouteAtMs = enRouteAtMs;
  }

  public DispatchJob estimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
    return this;
  }

   /**
   * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
   * @return estimatedArrivalMs
  **/
    public Long getEstimatedArrivalMs() {
    return estimatedArrivalMs;
  }

  public void setEstimatedArrivalMs(Long estimatedArrivalMs) {
    this.estimatedArrivalMs = estimatedArrivalMs;
  }

  public DispatchJob fleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
    return this;
  }

   /**
   * Fleet viewer url of the dispatch job.
   * @return fleetViewerUrl
  **/
    public String getFleetViewerUrl() {
    return fleetViewerUrl;
  }

  public void setFleetViewerUrl(String fleetViewerUrl) {
    this.fleetViewerUrl = fleetViewerUrl;
  }

  public DispatchJob groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchJob id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Samsara dispatch job.
   * @return id
  **/
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DispatchJob jobState(JobStatus jobState) {
    this.jobState = jobState;
    return this;
  }

   /**
   * Get jobState
   * @return jobState
  **/
  @NotNull
@Valid
  public JobStatus getJobState() {
    return jobState;
  }

  public void setJobState(JobStatus jobState) {
    this.jobState = jobState;
  }

  public DispatchJob skippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
    return this;
  }

   /**
   * The time at which the job was marked skipped.
   * @return skippedAtMs
  **/
    public Long getSkippedAtMs() {
    return skippedAtMs;
  }

  public void setSkippedAtMs(Long skippedAtMs) {
    this.skippedAtMs = skippedAtMs;
  }

  public DispatchJob vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle used for the dispatch job.
   * @return vehicleId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

