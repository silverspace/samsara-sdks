package apimodels;

import apimodels.AddressGeofencePolygonVertices;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AddressGeofencePolygon   {
  @JsonProperty("vertices")
  private List<AddressGeofencePolygonVertices> vertices = null;

  public AddressGeofencePolygon vertices(List<AddressGeofencePolygonVertices> vertices) {
    this.vertices = vertices;
    return this;
  }

  public AddressGeofencePolygon addVerticesItem(AddressGeofencePolygonVertices verticesItem) {
    if (vertices == null) {
      vertices = new ArrayList<>();
    }
    vertices.add(verticesItem);
    return this;
  }

   /**
   * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
   * @return vertices
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

