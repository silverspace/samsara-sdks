package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AddressGeofenceCircle;
import org.openapitools.model.AddressGeofencePolygon;



/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 **/

@ApiModel(description = "The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class AddressGeofence   {
  @JsonProperty("circle")
  private AddressGeofenceCircle circle = null;

  @JsonProperty("polygon")
  private AddressGeofencePolygon polygon = null;

  /**
   **/
  public AddressGeofence circle(AddressGeofenceCircle circle) {
    this.circle = circle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("circle")
  public AddressGeofenceCircle getCircle() {
    return circle;
  }
  public void setCircle(AddressGeofenceCircle circle) {
    this.circle = circle;
  }

  /**
   **/
  public AddressGeofence polygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("polygon")
  public AddressGeofencePolygon getPolygon() {
    return polygon;
  }
  public void setPolygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

