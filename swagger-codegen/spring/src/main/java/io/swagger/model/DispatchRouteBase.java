package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DispatchRouteBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class DispatchRouteBase   {
  @JsonProperty("actual_end_ms")
  private Long actualEndMs = null;

  @JsonProperty("actual_start_ms")
  private Long actualStartMs = null;

  @JsonProperty("driver_id")
  private Long driverId = null;

  @JsonProperty("group_id")
  private Long groupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scheduled_end_ms")
  private Long scheduledEndMs = null;

  @JsonProperty("scheduled_meters")
  private Long scheduledMeters = null;

  @JsonProperty("scheduled_start_ms")
  private Long scheduledStartMs = null;

  @JsonProperty("start_location_address")
  private String startLocationAddress = null;

  @JsonProperty("start_location_address_id")
  private Long startLocationAddressId = null;

  @JsonProperty("start_location_lat")
  private Double startLocationLat = null;

  @JsonProperty("start_location_lng")
  private Double startLocationLng = null;

  @JsonProperty("start_location_name")
  private String startLocationName = null;

  @JsonProperty("trailer_id")
  private Long trailerId = null;

  @JsonProperty("vehicle_id")
  private Long vehicleId = null;

  public DispatchRouteBase actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route actually ended.
   * @return actualEndMs
  **/
  @ApiModelProperty(example = "1462882101000", value = "The time in Unix epoch milliseconds that the route actually ended.")


  public Long getActualEndMs() {
    return actualEndMs;
  }

  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }

  public DispatchRouteBase actualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route actually started.
   * @return actualStartMs
  **/
  @ApiModelProperty(example = "1462882098000", value = "The time in Unix epoch milliseconds that the route actually started.")


  public Long getActualStartMs() {
    return actualStartMs;
  }

  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }

  public DispatchRouteBase driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return driverId
  **/
  @ApiModelProperty(example = "555", value = "ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchRouteBase groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * ID of the group if the organization has multiple groups (optional).
   * @return groupId
  **/
  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (optional).")


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchRouteBase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Descriptive name of this route.
   * @return name
  **/
  @ApiModelProperty(example = "Bid #123", required = true, value = "Descriptive name of this route.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DispatchRouteBase scheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   * @return scheduledEndMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
  @NotNull


  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }

  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }

  public DispatchRouteBase scheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
    return this;
  }

  /**
   * The distance expected to be traveled for this route in meters.
   * @return scheduledMeters
  **/
  @ApiModelProperty(example = "10000", value = "The distance expected to be traveled for this route in meters.")


  public Long getScheduledMeters() {
    return scheduledMeters;
  }

  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }

  public DispatchRouteBase scheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
    return this;
  }

  /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   * @return scheduledStartMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
  @NotNull


  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }

  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }

  public DispatchRouteBase startLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
    return this;
  }

  /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   * @return startLocationAddress
  **/
  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.")


  public String getStartLocationAddress() {
    return startLocationAddress;
  }

  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }

  public DispatchRouteBase startLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
    return this;
  }

  /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   * @return startLocationAddressId
  **/
  @ApiModelProperty(example = "67890", value = "ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.")


  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }

  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }

  public DispatchRouteBase startLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
    return this;
  }

  /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLat
  **/
  @ApiModelProperty(example = "123.456", value = "Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")


  public Double getStartLocationLat() {
    return startLocationLat;
  }

  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }

  public DispatchRouteBase startLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
    return this;
  }

  /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLng
  **/
  @ApiModelProperty(example = "37.459", value = "Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")


  public Double getStartLocationLng() {
    return startLocationLng;
  }

  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }

  public DispatchRouteBase startLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
    return this;
  }

  /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
   * @return startLocationName
  **/
  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.")


  public String getStartLocationName() {
    return startLocationName;
  }

  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }

  public DispatchRouteBase trailerId(Long trailerId) {
    this.trailerId = trailerId;
    return this;
  }

  /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   * @return trailerId
  **/
  @ApiModelProperty(example = "666", value = "ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.")


  public Long getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }

  public DispatchRouteBase vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.")


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
    return Objects.equals(this.actualEndMs, dispatchRouteBase.actualEndMs) &&
        Objects.equals(this.actualStartMs, dispatchRouteBase.actualStartMs) &&
        Objects.equals(this.driverId, dispatchRouteBase.driverId) &&
        Objects.equals(this.groupId, dispatchRouteBase.groupId) &&
        Objects.equals(this.name, dispatchRouteBase.name) &&
        Objects.equals(this.scheduledEndMs, dispatchRouteBase.scheduledEndMs) &&
        Objects.equals(this.scheduledMeters, dispatchRouteBase.scheduledMeters) &&
        Objects.equals(this.scheduledStartMs, dispatchRouteBase.scheduledStartMs) &&
        Objects.equals(this.startLocationAddress, dispatchRouteBase.startLocationAddress) &&
        Objects.equals(this.startLocationAddressId, dispatchRouteBase.startLocationAddressId) &&
        Objects.equals(this.startLocationLat, dispatchRouteBase.startLocationLat) &&
        Objects.equals(this.startLocationLng, dispatchRouteBase.startLocationLng) &&
        Objects.equals(this.startLocationName, dispatchRouteBase.startLocationName) &&
        Objects.equals(this.trailerId, dispatchRouteBase.trailerId) &&
        Objects.equals(this.vehicleId, dispatchRouteBase.vehicleId);
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

