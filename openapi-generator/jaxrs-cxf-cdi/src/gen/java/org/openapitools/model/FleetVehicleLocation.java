package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Contains the location and speed of a vehicle at a particular time
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Contains the location and speed of a vehicle at a particular time")

public class FleetVehicleLocation   {
  
  private Double latitude;

  private String location;

  private Double longitude;

  private Double speedMilesPerHour;

  private Long timeMs;


  /**
   * The latitude of the location in degrees.
   **/
  public FleetVehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "37.2", value = "The latitude of the location in degrees.")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  /**
   * The best effort (street,city,state) for the latitude and longitude.
   **/
  public FleetVehicleLocation location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "525 York, San Francisco, CA", value = "The best effort (street,city,state) for the latitude and longitude.")
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * The longitude of the location in degrees.
   **/
  public FleetVehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "-122.5", value = "The longitude of the location in degrees.")
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   **/
  public FleetVehicleLocation speedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
    return this;
  }

  
  @ApiModelProperty(example = "35.2", value = "The speed calculated from GPS that the asset was traveling at in miles per hour.")
  @JsonProperty("speedMilesPerHour")
  public Double getSpeedMilesPerHour() {
    return speedMilesPerHour;
  }
  public void setSpeedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
  }


  /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   **/
  public FleetVehicleLocation timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  
  @ApiModelProperty(example = "1535586471332", value = "Time in Unix milliseconds since epoch when the asset was at the location.")
  @JsonProperty("timeMs")
  public Long getTimeMs() {
    return timeMs;
  }
  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleLocation fleetVehicleLocation = (FleetVehicleLocation) o;
    return Objects.equals(latitude, fleetVehicleLocation.latitude) &&
        Objects.equals(location, fleetVehicleLocation.location) &&
        Objects.equals(longitude, fleetVehicleLocation.longitude) &&
        Objects.equals(speedMilesPerHour, fleetVehicleLocation.speedMilesPerHour) &&
        Objects.equals(timeMs, fleetVehicleLocation.timeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, location, longitude, speedMilesPerHour, timeMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleLocation {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    speedMilesPerHour: ").append(toIndentedString(speedMilesPerHour)).append("\n");
    sb.append("    timeMs: ").append(toIndentedString(timeMs)).append("\n");
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

