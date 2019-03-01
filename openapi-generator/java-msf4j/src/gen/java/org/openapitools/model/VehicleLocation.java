package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 */
@ApiModel(description = "Contains the location, in latitude and longitude, of a vehicle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class VehicleLocation   {
  @JsonProperty("heading")
  private Double heading;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("location")
  private String location;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("name")
  private String name;

  @JsonProperty("odometerMeters")
  private Long odometerMeters;

  @JsonProperty("onTrip")
  private Boolean onTrip;

  @JsonProperty("speed")
  private Double speed;

  @JsonProperty("time")
  private Integer time;

  @JsonProperty("vin")
  private String vin;

  public VehicleLocation heading(Double heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Heading in degrees.
   * @return heading
  **/
  @ApiModelProperty(example = "246.42", value = "Heading in degrees.")
  public Double getHeading() {
    return heading;
  }

  public void setHeading(Double heading) {
    this.heading = heading;
  }

  public VehicleLocation id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return id
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude in decimal degrees.
   * @return latitude
  **/
  @ApiModelProperty(example = "123.456", value = "Latitude in decimal degrees.")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public VehicleLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   * @return location
  **/
  @ApiModelProperty(example = "1 Main St, Dallas, TX", value = "Text representation of nearest identifiable location to (latitude, longitude) coordinates.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude in decimal degrees.
   * @return longitude
  **/
  @ApiModelProperty(example = "32.897", value = "Longitude in decimal degrees.")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public VehicleLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the vehicle.
   * @return name
  **/
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleLocation odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
    return this;
  }

   /**
   * The number of meters reported by the odometer.
   * @return odometerMeters
  **/
  @ApiModelProperty(example = "71774705", value = "The number of meters reported by the odometer.")
  public Long getOdometerMeters() {
    return odometerMeters;
  }

  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  public VehicleLocation onTrip(Boolean onTrip) {
    this.onTrip = onTrip;
    return this;
  }

   /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   * @return onTrip
  **/
  @ApiModelProperty(example = "true", value = "Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.")
  public Boolean getOnTrip() {
    return onTrip;
  }

  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

  public VehicleLocation speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Speed in miles per hour.
   * @return speed
  **/
  @ApiModelProperty(example = "64.37", value = "Speed in miles per hour.")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public VehicleLocation time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   * @return time
  **/
  @ApiModelProperty(example = "1462881998034", value = "The time the reported location was logged, reported as a UNIX timestamp in milliseconds.")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public VehicleLocation vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Vehicle Identification Number (VIN) of the vehicle.
   * @return vin
  **/
  @ApiModelProperty(example = "JTNBB46KX73011966", value = "Vehicle Identification Number (VIN) of the vehicle.")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleLocation vehicleLocation = (VehicleLocation) o;
    return Objects.equals(this.heading, vehicleLocation.heading) &&
        Objects.equals(this.id, vehicleLocation.id) &&
        Objects.equals(this.latitude, vehicleLocation.latitude) &&
        Objects.equals(this.location, vehicleLocation.location) &&
        Objects.equals(this.longitude, vehicleLocation.longitude) &&
        Objects.equals(this.name, vehicleLocation.name) &&
        Objects.equals(this.odometerMeters, vehicleLocation.odometerMeters) &&
        Objects.equals(this.onTrip, vehicleLocation.onTrip) &&
        Objects.equals(this.speed, vehicleLocation.speed) &&
        Objects.equals(this.time, vehicleLocation.time) &&
        Objects.equals(this.vin, vehicleLocation.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, id, latitude, location, longitude, name, odometerMeters, onTrip, speed, time, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLocation {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    odometerMeters: ").append(toIndentedString(odometerMeters)).append("\n");
    sb.append("    onTrip: ").append(toIndentedString(onTrip)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
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

