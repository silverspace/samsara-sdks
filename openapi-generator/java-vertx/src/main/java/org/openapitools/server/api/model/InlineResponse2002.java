package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.Pagination;
import org.openapitools.server.api.model.Vehicle;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineResponse2002   {
  
  private Pagination pagination = null;
  private Long groupId;
  private List<Vehicle> vehicles = new ArrayList<>();

  public InlineResponse2002 () {

  }

  public InlineResponse2002 (Pagination pagination, Long groupId, List<Vehicle> vehicles) {
    this.pagination = pagination;
    this.groupId = groupId;
    this.vehicles = vehicles;
  }

    
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
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
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(pagination, inlineResponse2002.pagination) &&
        Objects.equals(groupId, inlineResponse2002.groupId) &&
        Objects.equals(vehicles, inlineResponse2002.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, groupId, vehicles);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
