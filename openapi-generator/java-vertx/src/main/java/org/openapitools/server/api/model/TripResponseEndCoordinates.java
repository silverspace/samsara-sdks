package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * End (latitude, longitude) in decimal degrees.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TripResponseEndCoordinates   {
  
  private Double latitude;
  private Double longitude;

  public TripResponseEndCoordinates () {

  }

  public TripResponseEndCoordinates (Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

    
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
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
    TripResponseEndCoordinates tripResponseEndCoordinates = (TripResponseEndCoordinates) o;
    return Objects.equals(latitude, tripResponseEndCoordinates.latitude) &&
        Objects.equals(longitude, tripResponseEndCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripResponseEndCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
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
