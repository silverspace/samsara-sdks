package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Vehicle;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject14   {
  
  private Long groupId;
  private List<Vehicle> vehicles = new ArrayList<>();

  public InlineObject14 () {

  }

  public InlineObject14 (Long groupId, List<Vehicle> vehicles) {
    this.groupId = groupId;
    this.vehicles = vehicles;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("vehicles")
  public List<Vehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject14 inlineObject14 = (InlineObject14) o;
    return Objects.equals(groupId, inlineObject14.groupId) &&
        Objects.equals(vehicles, inlineObject14.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject14 {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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
