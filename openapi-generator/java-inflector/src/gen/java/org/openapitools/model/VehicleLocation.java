package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Contains the location, in latitude and longitude, of a vehicle.
 **/

@ApiModel(description = "Contains the location, in latitude and longitude, of a vehicle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
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

  /**
   * Heading in degrees.
   **/
  public VehicleLocation heading(Double heading) {
    this.heading = heading;
    return this;
  }

  
  @ApiModelProperty(example = "246.42", value = "Heading in degrees.")
  @JsonProperty("heading")
  public Double getHeading() {
    return heading;
  }
  public void setHeading(Double heading) {
    this.heading = heading;
  }

  /**
   * ID of the vehicle.
   **/
  public VehicleLocation id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Latitude in decimal degrees.
   **/
  public VehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "123.456", value = "Latitude in decimal degrees.")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   **/
  public VehicleLocation location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "1 Main St, Dallas, TX", value = "Text representation of nearest identifiable location to (latitude, longitude) coordinates.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Longitude in decimal degrees.
   **/
  public VehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "32.897", value = "Longitude in decimal degrees.")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  /**
   * Name of the vehicle.
   **/
  public VehicleLocation name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of meters reported by the odometer.
   **/
  public VehicleLocation odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
    return this;
  }

  
  @ApiModelProperty(example = "71774705", value = "The number of meters reported by the odometer.")
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }
  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   **/
  public VehicleLocation onTrip(Boolean onTrip) {
    this.onTrip = onTrip;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.")
  @JsonProperty("onTrip")
  public Boolean getOnTrip() {
    return onTrip;
  }
  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

  /**
   * Speed in miles per hour.
   **/
  public VehicleLocation speed(Double speed) {
    this.speed = speed;
    return this;
  }

  
  @ApiModelProperty(example = "64.37", value = "Speed in miles per hour.")
  @JsonProperty("speed")
  public Double getSpeed() {
    return speed;
  }
  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   **/
  public VehicleLocation time(Integer time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "The time the reported location was logged, reported as a UNIX timestamp in milliseconds.")
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  /**
   * Vehicle Identification Number (VIN) of the vehicle.
   **/
  public VehicleLocation vin(String vin) {
    this.vin = vin;
    return this;
  }

  
  @ApiModelProperty(example = "JTNBB46KX73011966", value = "Vehicle Identification Number (VIN) of the vehicle.")
  @JsonProperty("vin")
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
    return Objects.equals(heading, vehicleLocation.heading) &&
        Objects.equals(id, vehicleLocation.id) &&
        Objects.equals(latitude, vehicleLocation.latitude) &&
        Objects.equals(location, vehicleLocation.location) &&
        Objects.equals(longitude, vehicleLocation.longitude) &&
        Objects.equals(name, vehicleLocation.name) &&
        Objects.equals(odometerMeters, vehicleLocation.odometerMeters) &&
        Objects.equals(onTrip, vehicleLocation.onTrip) &&
        Objects.equals(speed, vehicleLocation.speed) &&
        Objects.equals(time, vehicleLocation.time) &&
        Objects.equals(vin, vehicleLocation.vin);
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

