package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class AddressGeofencePolygonVertices   {
  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("longitude")
  private Double longitude;

  /**
   * The longitude of a geofence vertex
   **/
  public AddressGeofencePolygonVertices latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "37.765363", value = "The longitude of a geofence vertex")
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * The longitude of a geofence vertex
   **/
  public AddressGeofencePolygonVertices longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "-122.403098", value = "The longitude of a geofence vertex")
  @JsonProperty("longitude")
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
    AddressGeofencePolygonVertices addressGeofencePolygonVertices = (AddressGeofencePolygonVertices) o;
    return Objects.equals(latitude, addressGeofencePolygonVertices.latitude) &&
        Objects.equals(longitude, addressGeofencePolygonVertices.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGeofencePolygonVertices {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
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

