package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AddressGeofencePolygonVertices;

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AddressGeofencePolygon   {
  
  private List<AddressGeofencePolygonVertices> vertices = new ArrayList<>();

  public AddressGeofencePolygon () {

  }

  public AddressGeofencePolygon (List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
  }

    
  @JsonProperty("vertices")
  public List<AddressGeofencePolygonVertices> getVertices() {
    return vertices;
  }
  public void setVertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
