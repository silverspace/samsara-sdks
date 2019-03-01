package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Current location of an asset
 */
@ApiModel(description = "Current location of an asset")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetCurrentLocation   {
  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("location")
  private String location;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("speedMilesPerHour")
  private Double speedMilesPerHour;

  @JsonProperty("timeMs")
  private Long timeMs;

  public AssetCurrentLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude of the location in degrees.
   * @return latitude
  **/
  @ApiModelProperty(example = "37.0", value = "The latitude of the location in degrees.")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AssetCurrentLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The best effort (street,city,state) for the latitude and longitude.
   * @return location
  **/
  @ApiModelProperty(example = "525 York, San Francisco, CA", value = "The best effort (street,city,state) for the latitude and longitude.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public AssetCurrentLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude of the location in degrees.
   * @return longitude
  **/
  @ApiModelProperty(example = "-122.7", value = "The longitude of the location in degrees.")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AssetCurrentLocation speedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
    return this;
  }

   /**
   * The speed calculated from GPS that the asset was traveling at in miles per hour.
   * @return speedMilesPerHour
  **/
  @ApiModelProperty(example = "35.0", value = "The speed calculated from GPS that the asset was traveling at in miles per hour.")
  public Double getSpeedMilesPerHour() {
    return speedMilesPerHour;
  }

  public void setSpeedMilesPerHour(Double speedMilesPerHour) {
    this.speedMilesPerHour = speedMilesPerHour;
  }

  public AssetCurrentLocation timeMs(Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

   /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   * @return timeMs
  **/
  @ApiModelProperty(example = "12314151", value = "Time in Unix milliseconds since epoch when the asset was at the location.")
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
    AssetCurrentLocation assetCurrentLocation = (AssetCurrentLocation) o;
    return Objects.equals(this.latitude, assetCurrentLocation.latitude) &&
        Objects.equals(this.location, assetCurrentLocation.location) &&
        Objects.equals(this.longitude, assetCurrentLocation.longitude) &&
        Objects.equals(this.speedMilesPerHour, assetCurrentLocation.speedMilesPerHour) &&
        Objects.equals(this.timeMs, assetCurrentLocation.timeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, location, longitude, speedMilesPerHour, timeMs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

