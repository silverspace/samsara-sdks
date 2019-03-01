package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleLocation;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineResponse2003   {
  
  private Long groupId;

  private List<VehicleLocation> vehicles = null;


  /**
   * Group ID to query.
   **/
  public InlineResponse2003 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
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
  public InlineResponse2003 vehicles(List<VehicleLocation> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicles")
  public List<VehicleLocation> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<VehicleLocation> vehicles) {
    this.vehicles = vehicles;
  }

  public InlineResponse2003 addVehiclesItem(VehicleLocation vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<VehicleLocation>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
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

