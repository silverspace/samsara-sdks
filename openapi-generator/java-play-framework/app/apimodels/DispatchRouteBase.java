package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DispatchRouteBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DispatchRouteBase   {
  @JsonProperty("actual_end_ms")
  private Long actualEndMs;

  @JsonProperty("actual_start_ms")
  private Long actualStartMs;

  @JsonProperty("driver_id")
  private Long driverId;

  @JsonProperty("group_id")
  private Long groupId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("scheduled_end_ms")
  private Long scheduledEndMs;

  @JsonProperty("scheduled_meters")
  private Long scheduledMeters;

  @JsonProperty("scheduled_start_ms")
  private Long scheduledStartMs;

  @JsonProperty("start_location_address")
  private String startLocationAddress;

  @JsonProperty("start_location_address_id")
  private Long startLocationAddressId;

  @JsonProperty("start_location_lat")
  private Double startLocationLat;

  @JsonProperty("start_location_lng")
  private Double startLocationLng;

  @JsonProperty("start_location_name")
  private String startLocationName;

  @JsonProperty("trailer_id")
  private Long trailerId;

  @JsonProperty("vehicle_id")
  private Long vehicleId;

  public DispatchRouteBase actualEndMs(Long actualEndMs) {
    this.actualEndMs = actualEndMs;
    return this;
  }

   /**
   * The time in Unix epoch milliseconds that the route actually ended.
   * @return actualEndMs
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

