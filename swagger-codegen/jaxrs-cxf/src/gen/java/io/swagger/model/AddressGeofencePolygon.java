package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AddressGeofencePolygonVertices;
import java.util.ArrayList;
import java.util.List;
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
  * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 **/
@ApiModel(description="Information about a polygon geofence. This field is only populated if the geofence is a polygon.")
public class AddressGeofencePolygon  {
  
  @ApiModelProperty(value = "The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.")
  @Valid
 /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
  **/
  private List<AddressGeofencePolygonVertices> vertices = null;
 /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
   * @return vertices
  **/
  @JsonProperty("vertices")
  public List<AddressGeofencePolygonVertices> getVertices() {
    return vertices;
  }

  public void setVertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
  }

  public AddressGeofencePolygon vertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
    return this;
  }

  public AddressGeofencePolygon addVerticesItem(AddressGeofencePolygonVertices verticesItem) {
    this.vertices.add(verticesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGeofencePolygon {\n");
    
    sb.append("    vertices: ").append(toIndentedString(vertices)).append("\n");
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

