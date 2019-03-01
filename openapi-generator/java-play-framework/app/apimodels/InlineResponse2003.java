package apimodels;

import apimodels.VehicleLocation;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class InlineResponse2003   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("vehicles")
  private List<VehicleLocation> vehicles = null;

  public InlineResponse2003 groupId(Long groupId) {
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

  public InlineResponse2003 vehicles(List<VehicleLocation> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2003 addVehiclesItem(VehicleLocation vehiclesItem) {
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
  public List<VehicleLocation> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleLocation> vehicles) {
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
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(groupId, inlineResponse2003.groupId) &&
        Objects.equals(vehicles, inlineResponse2003.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, vehicles);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
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

