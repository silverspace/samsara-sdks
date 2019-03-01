package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AddressGeofenceCircle   {
  
  private Double latitude;
  private Long radiusMeters;
  private Double longitude;

  public AddressGeofenceCircle () {

  }

  public AddressGeofenceCircle (Double latitude, Long radiusMeters, Double longitude) {
    this.latitude = latitude;
    this.radiusMeters = radiusMeters;
    this.longitude = longitude;
  }

    
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("radiusMeters")
  public Long getRadiusMeters() {
    return radiusMeters;
  }
  public void setRadiusMeters(Long radiusMeters) {
    this.radiusMeters = radiusMeters;
  }

    
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGeofenceCircle addressGeofenceCircle = (AddressGeofenceCircle) o;
    return Objects.equals(latitude, addressGeofenceCircle.latitude) &&
        Objects.equals(radiusMeters, addressGeofenceCircle.radiusMeters) &&
        Objects.equals(longitude, addressGeofenceCircle.longitude);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
