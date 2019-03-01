package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleMaintenance;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2004
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class InlineResponse2004   {
  @JsonProperty("vehicles")
  @Valid
  private List<VehicleMaintenance> vehicles = null;

  public InlineResponse2004 vehicles(List<VehicleMaintenance> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public InlineResponse2004 addVehiclesItem(VehicleMaintenance vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<VehicleMaintenance>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * Get vehicles
   * @return vehicles
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.vehicles, inlineResponse2004.vehicles);
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

