package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * Asset location details.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Asset location details.")

public class AssetLocationResponseInner   {
  
  private Double latitude = null;
  private String location = null;
  private Double longitude = null;
  private Double speedMilesPerHour = null;
  private BigDecimal time = null;

  /**
   * The latitude of the location in degrees.
   **/
  public AssetLocationResponseInner latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "37.0", value = "The latitude of the location in degrees.")
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
  public AssetLocationResponseInner location(String location) {
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
  public AssetLocationResponseInner longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "-122.7", value = "The longitude of the location in degrees.")
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
  public AssetLocationResponseInner speedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
    return this;
  }

  
  @ApiModelProperty(example = "35.0", value = "The speed calculated from GPS that the asset was traveling at in miles per hour.")
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
  public AssetLocationResponseInner time(BigDecimal time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "1.2314151E7", value = "Time in Unix milliseconds since epoch when the asset was at the location.")
  @JsonProperty("time")
  public BigDecimal getTime() {
    return time;
  }
  public void setTime(BigDecimal time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetLocationResponseInner assetLocationResponseInner = (AssetLocationResponseInner) o;
    return Objects.equals(latitude, assetLocationResponseInner.latitude) &&
        Objects.equals(location, assetLocationResponseInner.location) &&
        Objects.equals(longitude, assetLocationResponseInner.longitude) &&
        Objects.equals(speedMilesPerHour, assetLocationResponseInner.speedMilesPerHour) &&
        Objects.equals(time, assetLocationResponseInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, location, longitude, speedMilesPerHour, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetLocationResponseInner {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    speedMilesPerHour: ").append(toIndentedString(speedMilesPerHour)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

