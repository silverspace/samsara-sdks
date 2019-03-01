package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofencePolygonVertices;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 **/
@ApiModel(description = "Information about a polygon geofence. This field is only populated if the geofence is a polygon.")
public class AddressGeofencePolygon   {
  
  private @Valid List<AddressGeofencePolygonVertices> vertices = new ArrayList<AddressGeofencePolygonVertices>();

  /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
   **/
  public AddressGeofencePolygon vertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
    return this;
  }

  
  @ApiModelProperty(value = "The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.")
  @JsonProperty("vertices")
  public List<AddressGeofencePolygonVertices> getVertices() {
    return vertices;
  }
  public void setVertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGeofencePolygon addressGeofencePolygon = (AddressGeofencePolygon) o;
    return Objects.equals(vertices, addressGeofencePolygon.vertices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertices);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

