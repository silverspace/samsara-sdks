package apimodels;

import apimodels.Pagination;
import apimodels.Vehicle;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2002   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("vehicles")
  private List<Vehicle> vehicles = null;

  public InlineResponse2002 pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @Valid
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public InlineResponse2002 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
    public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineResponse2002 vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2002 addVehiclesItem(Vehicle vehiclesItem) {
    if (vehicles == null) {
      vehicles = new ArrayList<>();
    }
    vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * Get vehicles
   * @return vehicles
  **/
  @Valid
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(pagination, inlineResponse2002.pagination) &&
        Objects.equals(groupId, inlineResponse2002.groupId) &&
        Objects.equals(vehicles, inlineResponse2002.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, groupId, vehicles);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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

