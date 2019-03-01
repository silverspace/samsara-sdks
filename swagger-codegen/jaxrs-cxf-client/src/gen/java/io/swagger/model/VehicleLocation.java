package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains the location, in latitude and longitude, of a vehicle.
 **/
@ApiModel(description="Contains the location, in latitude and longitude, of a vehicle.")
public class VehicleLocation  {
  
  @ApiModelProperty(example = "246.42", value = "Heading in degrees.")
 /**
   * Heading in degrees.
  **/
  private Double heading = null;

  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long id = null;

  @ApiModelProperty(example = "123.456", value = "Latitude in decimal degrees.")
 /**
   * Latitude in decimal degrees.
  **/
  private Double latitude = null;

  @ApiModelProperty(example = "1 Main St, Dallas, TX", value = "Text representation of nearest identifiable location to (latitude, longitude) coordinates.")
 /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
  **/
  private String location = null;

  @ApiModelProperty(example = "32.897", value = "Longitude in decimal degrees.")
 /**
   * Longitude in decimal degrees.
  **/
  private Double longitude = null;

  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
 /**
   * Name of the vehicle.
  **/
  private String name = null;

  @ApiModelProperty(example = "71774705", value = "The number of meters reported by the odometer.")
 /**
   * The number of meters reported by the odometer.
  **/
  private Long odometerMeters = null;

  @ApiModelProperty(example = "true", value = "Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.")
 /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
  **/
  private Boolean onTrip = null;

  @ApiModelProperty(example = "64.37", value = "Speed in miles per hour.")
 /**
   * Speed in miles per hour.
  **/
  private Double speed = null;

  @ApiModelProperty(example = "1462881998034", value = "The time the reported location was logged, reported as a UNIX timestamp in milliseconds.")
 /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
  **/
  private Integer time = null;

  @ApiModelProperty(example = "JTNBB46KX73011966", value = "Vehicle Identification Number (VIN) of the vehicle.")
 /**
   * Vehicle Identification Number (VIN) of the vehicle.
  **/
  private String vin = null;
 /**
   * Heading in degrees.
   * @return heading
  **/
  @JsonProperty("heading")
  public Double getHeading() {
    return heading;
  }

  public void setHeading(Double heading) {
    this.heading = heading;
  }

  public VehicleLocation heading(Double heading) {
    this.heading = heading;
    return this;
  }

 /**
   * ID of the vehicle.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VehicleLocation id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Latitude in decimal degrees.
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public VehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VehicleLocation location(String location) {
    this.location = location;
    return this;
  }

 /**
   * Longitude in decimal degrees.
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public VehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * Name of the vehicle.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleLocation name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The number of meters reported by the odometer.
   * @return odometerMeters
  **/
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }

  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  public VehicleLocation odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
    return this;
  }

 /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   * @return onTrip
  **/
  @JsonProperty("onTrip")
  public Boolean isOnTrip() {
    return onTrip;
  }

  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

  public VehicleLocation onTrip(Boolean onTrip) {
    this.onTrip = onTrip;
    return this;
  }

 /**
   * Speed in miles per hour.
   * @return speed
  **/
  @JsonProperty("speed")
  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public VehicleLocation speed(Double speed) {
    this.speed = speed;
    return this;
  }

 /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   * @return time
  **/
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public VehicleLocation time(Integer time) {
    this.time = time;
    return this;
  }

 /**
   * Vehicle Identification Number (VIN) of the vehicle.
   * @return vin
  **/
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public VehicleLocation vin(String vin) {
    this.vin = vin;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

