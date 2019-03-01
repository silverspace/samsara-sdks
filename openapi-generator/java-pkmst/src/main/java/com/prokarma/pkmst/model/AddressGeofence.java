package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AddressGeofenceCircle;
import com.prokarma.pkmst.model.AddressGeofencePolygon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 */
@ApiModel(description = "The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AddressGeofence   {
  @JsonProperty("circle")
  private AddressGeofenceCircle circle = null;

  @JsonProperty("polygon")
  private AddressGeofencePolygon polygon = null;

  public AddressGeofence circle(AddressGeofenceCircle circle) {
    this.circle = circle;
    return this;
  }

   /**
   * Get circle
   * @return circle
  **/
  @ApiModelProperty(value = "")
  public AddressGeofenceCircle getCircle() {
    return circle;
  }

  public void setCircle(AddressGeofenceCircle circle) {
    this.circle = circle;
  }

  public AddressGeofence polygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
    return this;
  }

   /**
   * Get polygon
   * @return polygon
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.circle, addressGeofence.circle) &&
        Objects.equals(this.polygon, addressGeofence.polygon);
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

