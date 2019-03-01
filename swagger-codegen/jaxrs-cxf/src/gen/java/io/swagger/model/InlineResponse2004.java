package io.swagger.model;

import io.swagger.model.VehicleMaintenance;
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

public class InlineResponse2004  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<VehicleMaintenance> vehicles = null;
 /**
   * Get vehicles
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<VehicleMaintenance> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<VehicleMaintenance> vehicles) {
    this.vehicles = vehicles;
  }

  public InlineResponse2004 vehicles(List<VehicleMaintenance> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2004 addVehiclesItem(VehicleMaintenance vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

