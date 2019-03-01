package io.swagger.model;

import io.swagger.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleUpdateParam   {
  
  private @Valid Long groupId = null;
  private @Valid List<Vehicle> vehicles = new ArrayList<Vehicle>();

  /**
   * Group ID to query.
   **/
  public VehicleUpdateParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   **/
  public VehicleUpdateParam vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("vehicles")
  @NotNull
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
    VehicleUpdateParam vehicleUpdateParam = (VehicleUpdateParam) o;
    return Objects.equals(groupId, vehicleUpdateParam.groupId) &&
        Objects.equals(vehicles, vehicleUpdateParam.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleUpdateParam {\n");
    
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

