package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofencePolygonVertices;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Information about a polygon geofence. This field is only populated if the geofence is a polygon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class AddressGeofencePolygon   {
  
  private List<AddressGeofencePolygonVertices> vertices = new ArrayList<AddressGeofencePolygonVertices>();

  /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
   **/
  
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

