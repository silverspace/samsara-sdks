package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Passenger vehicle check engine light.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Passenger vehicle check engine light.")

public class VehicleMaintenancePassengerCheckEngineLight   {
  
  private Boolean isOn;


  /**
   **/
  public VehicleMaintenancePassengerCheckEngineLight isOn(Boolean isOn) {
    this.isOn = isOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isOn")
  public Boolean getIsOn() {
    return isOn;
  }
  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassengerCheckEngineLight vehicleMaintenancePassengerCheckEngineLight = (VehicleMaintenancePassengerCheckEngineLight) o;
    return Objects.equals(isOn, vehicleMaintenancePassengerCheckEngineLight.isOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassengerCheckEngineLight {\n");
    
    sb.append("    isOn: ").append(toIndentedString(isOn)).append("\n");
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

