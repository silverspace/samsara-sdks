package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Pagination;
import io.swagger.model.Vehicle;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class InlineResponse2002   {
  
  private Long groupId = null;
  private Pagination pagination = null;
  private List<Vehicle> vehicles = new ArrayList<Vehicle>();

  /**
   * Group ID to query.
   **/
  
  @ApiModelProperty(example = "101", value = "Group ID to query.")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicles")
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
    return Objects.equals(groupId, inlineResponse2002.groupId) &&
        Objects.equals(pagination, inlineResponse2002.pagination) &&
        Objects.equals(vehicles, inlineResponse2002.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, pagination, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

