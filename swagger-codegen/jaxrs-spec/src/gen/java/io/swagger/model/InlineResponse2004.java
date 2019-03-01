package io.swagger.model;

import io.swagger.model.VehicleMaintenance;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InlineResponse2004   {
  
  private @Valid List<VehicleMaintenance> vehicles = new ArrayList<VehicleMaintenance>();

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

