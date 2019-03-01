package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.AddressGeofenceCircle;
import org.openapitools.model.AddressGeofencePolygon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 **/
@ApiModel(description="The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.")
public class AddressGeofence  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AddressGeofenceCircle circle = null;

  @ApiModelProperty(value = "")
  @Valid
  private AddressGeofencePolygon polygon = null;
 /**
   * Get circle
   * @return circle
  **/
  @JsonProperty("circle")
  public AddressGeofenceCircle getCircle() {
    return circle;
  }

  public void setCircle(AddressGeofenceCircle circle) {
    this.circle = circle;
  }

  public AddressGeofence circle(AddressGeofenceCircle circle) {
    this.circle = circle;
    return this;
  }

 /**
   * Get polygon
   * @return polygon
  **/
  @JsonProperty("polygon")
  public AddressGeofencePolygon getPolygon() {
    return polygon;
  }

  public void setPolygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
  }

  public AddressGeofence polygon(AddressGeofencePolygon polygon) {
    this.polygon = polygon;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

