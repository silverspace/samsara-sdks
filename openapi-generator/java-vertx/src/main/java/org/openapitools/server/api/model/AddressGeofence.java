package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.AddressGeofenceCircle;
import org.openapitools.server.api.model.AddressGeofencePolygon;

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AddressGeofence   {
  
  private AddressGeofenceCircle circle = null;
  private AddressGeofencePolygon polygon = null;

  public AddressGeofence () {

  }

  public AddressGeofence (AddressGeofenceCircle circle, AddressGeofencePolygon polygon) {
    this.circle = circle;
    this.polygon = polygon;
  }

    
  @JsonProperty("circle")
  public AddressGeofenceCircle getCircle() {
    return circle;
  }
  public void setCircle(AddressGeofenceCircle circle) {
    this.circle = circle;
  }

    
  @JsonProperty("polygon")
  public AddressGeofencePolygon getPolygon() {
    return polygon;
  }
  public void setPolygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGeofence addressGeofence = (AddressGeofence) o;
    return Objects.equals(circle, addressGeofence.circle) &&
        Objects.equals(polygon, addressGeofence.polygon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(circle, polygon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGeofence {\n");
    
    sb.append("    circle: ").append(toIndentedString(circle)).append("\n");
    sb.append("    polygon: ").append(toIndentedString(polygon)).append("\n");
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
