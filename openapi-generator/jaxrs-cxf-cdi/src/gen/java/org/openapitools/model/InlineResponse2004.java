package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.VehicleMaintenance;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineResponse2004   {
  
  private List<VehicleMaintenance> vehicles = null;


  /**
   **/
  public InlineResponse2004 vehicles(List<VehicleMaintenance> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicles")
  public List<VehicleMaintenance> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<VehicleMaintenance> vehicles) {
    this.vehicles = vehicles;
  }

  public InlineResponse2004 addVehiclesItem(VehicleMaintenance vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<VehicleMaintenance>();
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
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(vehicles, inlineResponse2004.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
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

