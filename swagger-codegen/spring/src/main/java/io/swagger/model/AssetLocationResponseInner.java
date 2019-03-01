package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asset location details.
 */
@ApiModel(description = "Asset location details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AssetLocationResponseInner   {
  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("speedMilesPerHour")
  private Double speedMilesPerHour = null;

  @JsonProperty("time")
  private BigDecimal time = null;

  public AssetLocationResponseInner latitude(Double latitude) {
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

  public AssetLocationResponseInner location(String location) {
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

  public AssetLocationResponseInner longitude(Double longitude) {
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

  public AssetLocationResponseInner speedMilesPerHour(Double speedMilesPerHour) {
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

  public AssetLocationResponseInner time(BigDecimal time) {
    this.time = time;
    return this;
  }

  /**
   * Time in Unix milliseconds since epoch when the asset was at the location.
   * @return time
  **/
  @ApiModelProperty(example = "1.2314151E7", value = "Time in Unix milliseconds since epoch when the asset was at the location.")

  @Valid

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
    return Objects.equals(this.latitude, assetLocationResponseInner.latitude) &&
        Objects.equals(this.location, assetLocationResponseInner.location) &&
        Objects.equals(this.longitude, assetLocationResponseInner.longitude) &&
        Objects.equals(this.speedMilesPerHour, assetLocationResponseInner.speedMilesPerHour) &&
        Objects.equals(this.time, assetLocationResponseInner.time);
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

