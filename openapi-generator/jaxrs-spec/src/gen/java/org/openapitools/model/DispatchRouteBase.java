package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class DispatchRouteBase   {
  
  private @Valid Long actualEndMs;
  private @Valid Long actualStartMs;
  private @Valid Long driverId;
  private @Valid Long groupId;
  private @Valid String name;
  private @Valid Long scheduledEndMs;
  private @Valid Long scheduledMeters;
  private @Valid Long scheduledStartMs;
  private @Valid String startLocationAddress;
  private @Valid Long startLocationAddressId;
  private @Valid Double startLocationLat;
  private @Valid Double startLocationLng;
  private @Valid String startLocationName;
  private @Valid Long trailerId;
  private @Valid Long vehicleId;

  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   **/
  public DispatchRouteBase actualEndMs(Long actualEndMs) {
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
  public DispatchRouteBase actualStartMs(Long actualStartMs) {
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
  public DispatchRouteBase driverId(Long driverId) {
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
  public DispatchRouteBase groupId(Long groupId) {
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
  public DispatchRouteBase name(String name) {
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
  public DispatchRouteBase scheduledEndMs(Long scheduledEndMs) {
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
  public DispatchRouteBase scheduledMeters(Long scheduledMeters) {
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
  public DispatchRouteBase scheduledStartMs(Long scheduledStartMs) {
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
  public DispatchRouteBase startLocationAddress(String startLocationAddress) {
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
  public DispatchRouteBase startLocationAddressId(Long startLocationAddressId) {
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
  public DispatchRouteBase startLocationLat(Double startLocationLat) {
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
  public DispatchRouteBase startLocationLng(Double startLocationLng) {
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
  public DispatchRouteBase startLocationName(String startLocationName) {
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
  public DispatchRouteBase trailerId(Long trailerId) {
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
  public DispatchRouteBase vehicleId(Long vehicleId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DispatchRouteBase dispatchRouteBase = (DispatchRouteBase) o;
    return Objects.equals(actualEndMs, dispatchRouteBase.actualEndMs) &&
        Objects.equals(actualStartMs, dispatchRouteBase.actualStartMs) &&
        Objects.equals(driverId, dispatchRouteBase.driverId) &&
        Objects.equals(groupId, dispatchRouteBase.groupId) &&
        Objects.equals(name, dispatchRouteBase.name) &&
        Objects.equals(scheduledEndMs, dispatchRouteBase.scheduledEndMs) &&
        Objects.equals(scheduledMeters, dispatchRouteBase.scheduledMeters) &&
        Objects.equals(scheduledStartMs, dispatchRouteBase.scheduledStartMs) &&
        Objects.equals(startLocationAddress, dispatchRouteBase.startLocationAddress) &&
        Objects.equals(startLocationAddressId, dispatchRouteBase.startLocationAddressId) &&
        Objects.equals(startLocationLat, dispatchRouteBase.startLocationLat) &&
        Objects.equals(startLocationLng, dispatchRouteBase.startLocationLng) &&
        Objects.equals(startLocationName, dispatchRouteBase.startLocationName) &&
        Objects.equals(trailerId, dispatchRouteBase.trailerId) &&
        Objects.equals(vehicleId, dispatchRouteBase.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualEndMs, actualStartMs, driverId, groupId, name, scheduledEndMs, scheduledMeters, scheduledStartMs, startLocationAddress, startLocationAddressId, startLocationLat, startLocationLng, startLocationName, trailerId, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DispatchRouteBase {\n");
    
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

