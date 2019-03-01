package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DispatchJob;
import org.openapitools.model.DispatchRouteBase;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



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

  private List<DispatchJob> dispatchJobs = new ArrayList<DispatchJob>();

  private Long id;


  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   **/
  public DispatchRoute actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462882101000", value = "The time in Unix epoch milliseconds that the route actually ended.")
  @JsonProperty("actual_end_ms")
  public Long getActualEndMs() {
    return actualEndMs;
  }
  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }


  /**
   * The time in Unix epoch milliseconds that the route actually started.
   **/
  public DispatchRoute actualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462882098000", value = "The time in Unix epoch milliseconds that the route actually started.")
  @JsonProperty("actual_start_ms")
  public Long getActualStartMs() {
    return actualStartMs;
  }
  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }


  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   **/
  public DispatchRoute driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "555", value = "ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }


  /**
   * ID of the group if the organization has multiple groups (optional).
   **/
  public DispatchRoute groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (optional).")
  @JsonProperty("group_id")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  /**
   * Descriptive name of this route.
   **/
  public DispatchRoute name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Bid #123", required = true, value = "Descriptive name of this route.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   **/
  public DispatchRoute scheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
  @JsonProperty("scheduled_end_ms")
  @NotNull
  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }
  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }


  /**
   * The distance expected to be traveled for this route in meters.
   **/
  public DispatchRoute scheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
    return this;
  }

  
  @ApiModelProperty(example = "10000", value = "The distance expected to be traveled for this route in meters.")
  @JsonProperty("scheduled_meters")
  public Long getScheduledMeters() {
    return scheduledMeters;
  }
  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }


  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   **/
  public DispatchRoute scheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
  @JsonProperty("scheduled_start_ms")
  @NotNull
  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }
  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }


  /**
   * The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   **/
  public DispatchRoute startLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
    return this;
  }

  
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.")
  @JsonProperty("start_location_address")
  public String getStartLocationAddress() {
    return startLocationAddress;
  }
  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }


  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   **/
  public DispatchRoute startLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
    return this;
  }

  
  @ApiModelProperty(example = "67890", value = "ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.")
  @JsonProperty("start_location_address_id")
  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }
  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }


  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   **/
  public DispatchRoute startLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
    return this;
  }

  
  @ApiModelProperty(example = "123.456", value = "Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  @JsonProperty("start_location_lat")
  public Double getStartLocationLat() {
    return startLocationLat;
  }
  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }


  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   **/
  public DispatchRoute startLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
    return this;
  }

  
  @ApiModelProperty(example = "37.459", value = "Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
  @JsonProperty("start_location_lng")
  public Double getStartLocationLng() {
    return startLocationLng;
  }
  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }


  /**
   * The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
   **/
  public DispatchRoute startLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
    return this;
  }

  
  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.")
  @JsonProperty("start_location_name")
  public String getStartLocationName() {
    return startLocationName;
  }
  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }


  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   **/
  public DispatchRoute trailerId(Long trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  
  @ApiModelProperty(example = "666", value = "ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.")
  @JsonProperty("trailer_id")
  public Long getTrailerId() {
    return trailerId;
  }
  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }


  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   **/
  public DispatchRoute vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.")
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  /**
   * The dispatch jobs associated with this route.
   **/
  public DispatchRoute dispatchJobs(List<DispatchJob> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The dispatch jobs associated with this route.")
  @JsonProperty("dispatch_jobs")
  @NotNull
  public List<DispatchJob> getDispatchJobs() {
    return dispatchJobs;
  }
  public void setDispatchJobs(List<DispatchJob> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
  }

  public DispatchRoute addDispatchJobsItem(DispatchJob dispatchJobsItem) {
    this.dispatchJobs.add(dispatchJobsItem);
    return this;
  }


  /**
   * ID of the Samsara dispatch route.
   **/
  public DispatchRoute id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "556", required = true, value = "ID of the Samsara dispatch route.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

