package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DispatchJob;
import org.openapitools.server.api.model.DispatchRouteBase;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DispatchRoute   {
  
  private Long actualEndMs;
  private Long actualStartMs;
  private Long driverId;
  private Long groupId;
  private String name;
  private Long scheduledEndMs;
  private Long scheduledMeters;
  private Long scheduledStartMs;
  private String startLocationAddress;
  private Long startLocationAddressId;
  private Double startLocationLat;
  private Double startLocationLng;
  private String startLocationName;
  private Long trailerId;
  private Long vehicleId;
  private List<DispatchJob> dispatchJobs = new ArrayList<>();
  private Long id;

  public DispatchRoute () {

  }

  public DispatchRoute (Long actualEndMs, Long actualStartMs, Long driverId, Long groupId, String name, Long scheduledEndMs, Long scheduledMeters, Long scheduledStartMs, String startLocationAddress, Long startLocationAddressId, Double startLocationLat, Double startLocationLng, String startLocationName, Long trailerId, Long vehicleId, List<DispatchJob> dispatchJobs, Long id) {
    this.actualEndMs = actualEndMs;
    this.actualStartMs = actualStartMs;
    this.driverId = driverId;
    this.groupId = groupId;
    this.name = name;
    this.scheduledEndMs = scheduledEndMs;
    this.scheduledMeters = scheduledMeters;
    this.scheduledStartMs = scheduledStartMs;
    this.startLocationAddress = startLocationAddress;
    this.startLocationAddressId = startLocationAddressId;
    this.startLocationLat = startLocationLat;
    this.startLocationLng = startLocationLng;
    this.startLocationName = startLocationName;
    this.trailerId = trailerId;
    this.vehicleId = vehicleId;
    this.dispatchJobs = dispatchJobs;
    this.id = id;
  }

    
  @JsonProperty("actual_end_ms")
  public Long getActualEndMs() {
    return actualEndMs;
  }
  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }

    
  @JsonProperty("actual_start_ms")
  public Long getActualStartMs() {
    return actualStartMs;
  }
  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }

    
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("group_id")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("scheduled_end_ms")
  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }
  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }

    
  @JsonProperty("scheduled_meters")
  public Long getScheduledMeters() {
    return scheduledMeters;
  }
  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }

    
  @JsonProperty("scheduled_start_ms")
  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }
  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }

    
  @JsonProperty("start_location_address")
  public String getStartLocationAddress() {
    return startLocationAddress;
  }
  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }

    
  @JsonProperty("start_location_address_id")
  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }
  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }

    
  @JsonProperty("start_location_lat")
  public Double getStartLocationLat() {
    return startLocationLat;
  }
  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }

    
  @JsonProperty("start_location_lng")
  public Double getStartLocationLng() {
    return startLocationLng;
  }
  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }

    
  @JsonProperty("start_location_name")
  public String getStartLocationName() {
    return startLocationName;
  }
  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }

    
  @JsonProperty("trailer_id")
  public Long getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }

    
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("dispatch_jobs")
  public List<DispatchJob> getDispatchJobs() {
    return dispatchJobs;
  }
  public void setDispatchJobs(List<DispatchJob> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRoute dispatchRoute = (DispatchRoute) o;
    return Objects.equals(actualEndMs, dispatchRoute.actualEndMs) &&
        Objects.equals(actualStartMs, dispatchRoute.actualStartMs) &&
        Objects.equals(driverId, dispatchRoute.driverId) &&
        Objects.equals(groupId, dispatchRoute.groupId) &&
        Objects.equals(name, dispatchRoute.name) &&
        Objects.equals(scheduledEndMs, dispatchRoute.scheduledEndMs) &&
        Objects.equals(scheduledMeters, dispatchRoute.scheduledMeters) &&
        Objects.equals(scheduledStartMs, dispatchRoute.scheduledStartMs) &&
        Objects.equals(startLocationAddress, dispatchRoute.startLocationAddress) &&
        Objects.equals(startLocationAddressId, dispatchRoute.startLocationAddressId) &&
        Objects.equals(startLocationLat, dispatchRoute.startLocationLat) &&
        Objects.equals(startLocationLng, dispatchRoute.startLocationLng) &&
        Objects.equals(startLocationName, dispatchRoute.startLocationName) &&
        Objects.equals(trailerId, dispatchRoute.trailerId) &&
        Objects.equals(vehicleId, dispatchRoute.vehicleId) &&
        Objects.equals(dispatchJobs, dispatchRoute.dispatchJobs) &&
        Objects.equals(id, dispatchRoute.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualEndMs, actualStartMs, driverId, groupId, name, scheduledEndMs, scheduledMeters, scheduledStartMs, startLocationAddress, startLocationAddressId, startLocationLat, startLocationLng, startLocationName, trailerId, vehicleId, dispatchJobs, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRoute {\n");
    
    sb.append("    actualEndMs: ").append(toIndentedString(actualEndMs)).append("\n");
    sb.append("    actualStartMs: ").append(toIndentedString(actualStartMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduledEndMs: ").append(toIndentedString(scheduledEndMs)).append("\n");
    sb.append("    scheduledMeters: ").append(toIndentedString(scheduledMeters)).append("\n");
    sb.append("    scheduledStartMs: ").append(toIndentedString(scheduledStartMs)).append("\n");
    sb.append("    startLocationAddress: ").append(toIndentedString(startLocationAddress)).append("\n");
    sb.append("    startLocationAddressId: ").append(toIndentedString(startLocationAddressId)).append("\n");
    sb.append("    startLocationLat: ").append(toIndentedString(startLocationLat)).append("\n");
    sb.append("    startLocationLng: ").append(toIndentedString(startLocationLng)).append("\n");
    sb.append("    startLocationName: ").append(toIndentedString(startLocationName)).append("\n");
    sb.append("    trailerId: ").append(toIndentedString(trailerId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    dispatchJobs: ").append(toIndentedString(dispatchJobs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
