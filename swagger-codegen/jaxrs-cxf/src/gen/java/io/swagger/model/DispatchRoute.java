package io.swagger.model;

import io.swagger.model.DispatchJob;
import io.swagger.model.DispatchRouteBase;
import java.util.ArrayList;
import java.util.List;
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

public class DispatchRoute  {
  
  @ApiModelProperty(example = "1462882101000", value = "The time in Unix epoch milliseconds that the route actually ended.")
 /**
   * The time in Unix epoch milliseconds that the route actually ended.
  **/
  private Long actualEndMs = null;

  @ApiModelProperty(example = "1462882098000", value = "The time in Unix epoch milliseconds that the route actually started.")
 /**
   * The time in Unix epoch milliseconds that the route actually started.
  **/
  private Long actualStartMs = null;

  @ApiModelProperty(example = "555", value = "ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.")
 /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "101", value = "ID of the group if the organization has multiple groups (optional).")
 /**
   * ID of the group if the organization has multiple groups (optional).
  **/
  private Long groupId = null;

  @ApiModelProperty(example = "Bid #123", required = true, value = "Descriptive name of this route.")
 /**
   * Descriptive name of this route.
  **/
  private String name = null;

  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the last job in the route is scheduled to end.")
 /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
  **/
  private Long scheduledEndMs = null;

  @ApiModelProperty(example = "10000", value = "The distance expected to be traveled for this route in meters.")
 /**
   * The distance expected to be traveled for this route in meters.
  **/
  private Long scheduledMeters = null;

  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the route is scheduled to start.")
 /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
  **/
  private Long scheduledStartMs = null;

  @ApiModelProperty(example = "123 Main St, Philadelphia, PA 19106", value = "The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.")
 /**
   * The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
  **/
  private String startLocationAddress = null;

  @ApiModelProperty(example = "67890", value = "ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.")
 /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
  **/
  private Long startLocationAddressId = null;

  @ApiModelProperty(example = "123.456", value = "Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
 /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  **/
  private Double startLocationLat = null;

  @ApiModelProperty(example = "37.459", value = "Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.")
 /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
  **/
  private Double startLocationLng = null;

  @ApiModelProperty(example = "ACME Inc. Philadelphia HQ", value = "The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.")
 /**
   * The name of the route's starting location. If provided, it will take precedence over the name of the address book entry.
  **/
  private String startLocationName = null;

  @ApiModelProperty(example = "666", value = "ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.")
 /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
  **/
  private Long trailerId = null;

  @ApiModelProperty(example = "444", value = "ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.")
 /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
  **/
  private Long vehicleId = null;

  @ApiModelProperty(required = true, value = "The dispatch jobs associated with this route.")
  @Valid
 /**
   * The dispatch jobs associated with this route.
  **/
  private List<DispatchJob> dispatchJobs = new ArrayList<DispatchJob>();

  @ApiModelProperty(example = "556", required = true, value = "ID of the Samsara dispatch route.")
 /**
   * ID of the Samsara dispatch route.
  **/
  private Long id = null;
 /**
   * The time in Unix epoch milliseconds that the route actually ended.
   * @return actualEndMs
  **/
  @JsonProperty("actual_end_ms")
  public Long getActualEndMs() {
    return actualEndMs;
  }

  public void setActualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
  }

  public DispatchRoute actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

 /**
   * The time in Unix epoch milliseconds that the route actually started.
   * @return actualStartMs
  **/
  @JsonProperty("actual_start_ms")
  public Long getActualStartMs() {
    return actualStartMs;
  }

  public void setActualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
  }

  public DispatchRoute actualStartMs(Long actualStartMs) {
    this.actualStartMs = actualStartMs;
    return this;
  }

 /**
   * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return driverId
  **/
  @JsonProperty("driver_id")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public DispatchRoute driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * ID of the group if the organization has multiple groups (optional).
   * @return groupId
  **/
  @JsonProperty("group_id")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DispatchRoute groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Descriptive name of this route.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DispatchRoute name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
   * @return scheduledEndMs
  **/
  @JsonProperty("scheduled_end_ms")
  @NotNull
  public Long getScheduledEndMs() {
    return scheduledEndMs;
  }

  public void setScheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
  }

  public DispatchRoute scheduledEndMs(Long scheduledEndMs) {
    this.scheduledEndMs = scheduledEndMs;
    return this;
  }

 /**
   * The distance expected to be traveled for this route in meters.
   * @return scheduledMeters
  **/
  @JsonProperty("scheduled_meters")
  public Long getScheduledMeters() {
    return scheduledMeters;
  }

  public void setScheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
  }

  public DispatchRoute scheduledMeters(Long scheduledMeters) {
    this.scheduledMeters = scheduledMeters;
    return this;
  }

 /**
   * The time in Unix epoch milliseconds that the route is scheduled to start.
   * @return scheduledStartMs
  **/
  @JsonProperty("scheduled_start_ms")
  @NotNull
  public Long getScheduledStartMs() {
    return scheduledStartMs;
  }

  public void setScheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
  }

  public DispatchRoute scheduledStartMs(Long scheduledStartMs) {
    this.scheduledStartMs = scheduledStartMs;
    return this;
  }

 /**
   * The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
   * @return startLocationAddress
  **/
  @JsonProperty("start_location_address")
  public String getStartLocationAddress() {
    return startLocationAddress;
  }

  public void setStartLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
  }

  public DispatchRoute startLocationAddress(String startLocationAddress) {
    this.startLocationAddress = startLocationAddress;
    return this;
  }

 /**
   * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
   * @return startLocationAddressId
  **/
  @JsonProperty("start_location_address_id")
  public Long getStartLocationAddressId() {
    return startLocationAddressId;
  }

  public void setStartLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
  }

  public DispatchRoute startLocationAddressId(Long startLocationAddressId) {
    this.startLocationAddressId = startLocationAddressId;
    return this;
  }

 /**
   * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLat
  **/
  @JsonProperty("start_location_lat")
  public Double getStartLocationLat() {
    return startLocationLat;
  }

  public void setStartLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
  }

  public DispatchRoute startLocationLat(Double startLocationLat) {
    this.startLocationLat = startLocationLat;
    return this;
  }

 /**
   * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
   * @return startLocationLng
  **/
  @JsonProperty("start_location_lng")
  public Double getStartLocationLng() {
    return startLocationLng;
  }

  public void setStartLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
  }

  public DispatchRoute startLocationLng(Double startLocationLng) {
    this.startLocationLng = startLocationLng;
    return this;
  }

 /**
   * The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
   * @return startLocationName
  **/
  @JsonProperty("start_location_name")
  public String getStartLocationName() {
    return startLocationName;
  }

  public void setStartLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
  }

  public DispatchRoute startLocationName(String startLocationName) {
    this.startLocationName = startLocationName;
    return this;
  }

 /**
   * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
   * @return trailerId
  **/
  @JsonProperty("trailer_id")
  public Long getTrailerId() {
    return trailerId;
  }

  public void setTrailerId(Long trailerId) {
    this.trailerId = trailerId;
  }

  public DispatchRoute trailerId(Long trailerId) {
    this.trailerId = trailerId;
    return this;
  }

 /**
   * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
   * @return vehicleId
  **/
  @JsonProperty("vehicle_id")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DispatchRoute vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

 /**
   * The dispatch jobs associated with this route.
   * @return dispatchJobs
  **/
  @JsonProperty("dispatch_jobs")
  @NotNull
  public List<DispatchJob> getDispatchJobs() {
    return dispatchJobs;
  }

  public void setDispatchJobs(List<DispatchJob> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
  }

  public DispatchRoute dispatchJobs(List<DispatchJob> dispatchJobs) {
    this.dispatchJobs = dispatchJobs;
    return this;
  }

  public DispatchRoute addDispatchJobsItem(DispatchJob dispatchJobsItem) {
    this.dispatchJobs.add(dispatchJobsItem);
    return this;
  }

 /**
   * ID of the Samsara dispatch route.
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

  public DispatchRoute id(Long id) {
    this.id = id;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

