package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Current location of an asset
 **/
@ApiModel(description="Current location of an asset")
public class AssetCurrentLocation  {
  
  @ApiModelProperty(example = "37.0", value = "The latitude of the location in degrees.")
 /**
   * The latitude of the location in degrees.
  **/
  private Double latitude;

  @ApiModelProperty(example = "525 York, San Francisco, CA", value = "The best effort (street,city,state) for the latitude and longitude.")
 /**
   * The best effort (street,city,state) for the latitude and longitude.
  **/
  private String location;

  @ApiModelProperty(example = "-122.7", value = "The longitude of the location in degrees.")
 /**
   * The longitude of the location in degrees.
  **/
  private Double longitude;

  @ApiModelProperty(example = "35.0", value = "The speed calculated from GPS that the asset was traveling at in miles per hour.")
 /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
  **/
  private Double speedMilesPerHour;

  @ApiModelProperty(example = "12314151", value = "Time in Unix milliseconds since epoch when the asset was at the location.")
 /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
  **/
  private Long timeMs;
 /**
   * The latitude of the location in degrees.
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AssetCurrentLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * The best effort (street,city,state) for the latitude and longitude.
   * @return location
  **/
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AssetCurrentLocation location(String location) {
    this.location = location;
    return this;
  }

 /**
   * The longitude of the location in degrees.
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AssetCurrentLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   * @return speedMilesPerHour
  **/
  @JsonProperty("speedMilesPerHour")
  public Double getSpeedMilesPerHour() {
    return speedMilesPerHour;
  }

  public void setSpeedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
  }

  public AssetCurrentLocation speedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
    return this;
  }

 /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   * @return timeMs
  **/
  @JsonProperty("timeMs")
  public Long getTimeMs() {
    return timeMs;
  }

  public void setTimeMs(Long timeMs) {
    this.timeMs = timeMs;
  }

  public AssetCurrentLocation timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCurrentLocation {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

