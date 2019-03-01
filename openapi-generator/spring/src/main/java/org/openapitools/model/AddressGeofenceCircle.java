package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 */
@ApiModel(description = "Information about a circular geofence. This field is only populated if the geofence is a circle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class AddressGeofenceCircle   {
  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("radiusMeters")
  private Long radiusMeters;

  @JsonProperty("longitude")
  private Double longitude;

  public AddressGeofenceCircle latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude of the center of the circular geofence
   * @return latitude
  */
  @ApiModelProperty(example = "37.765363", value = "The latitude of the center of the circular geofence")


  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AddressGeofenceCircle radiusMeters(Long radiusMeters) {
    this.radiusMeters = radiusMeters;
    return this;
  }

  /**
   * The radius of the circular geofence
   * @return radiusMeters
  */
  @ApiModelProperty(example = "250", value = "The radius of the circular geofence")


  public Long getRadiusMeters() {
    return radiusMeters;
  }

  public void setRadiusMeters(Long radiusMeters) {
    this.radiusMeters = radiusMeters;
  }

  public AddressGeofenceCircle longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude of the center of the circular geofence
   * @return longitude
  */
  @ApiModelProperty(example = "-122.403098", value = "The longitude of the center of the circular geofence")


  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGeofenceCircle addressGeofenceCircle = (AddressGeofenceCircle) o;
    return Objects.equals(this.latitude, addressGeofenceCircle.latitude) &&
        Objects.equals(this.radiusMeters, addressGeofenceCircle.radiusMeters) &&
        Objects.equals(this.longitude, addressGeofenceCircle.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, radiusMeters, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGeofenceCircle {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    radiusMeters: ").append(toIndentedString(radiusMeters)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

