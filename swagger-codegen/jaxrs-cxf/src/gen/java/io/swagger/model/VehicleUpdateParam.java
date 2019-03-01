package io.swagger.model;

import io.swagger.model.Vehicle;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleUpdateParam  {
  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<Vehicle> vehicles = new ArrayList<Vehicle>();
 /**
   * Group ID to query.
   * @return groupId
  **/
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public VehicleUpdateParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get vehicles
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  @NotNull
  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public VehicleUpdateParam vehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public VehicleUpdateParam addVehiclesItem(Vehicle vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

