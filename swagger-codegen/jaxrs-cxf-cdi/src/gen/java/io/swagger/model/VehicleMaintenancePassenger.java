package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.VehicleMaintenancePassengerCheckEngineLight;
import io.swagger.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Passenger vehicle data. Null if no data is available.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Passenger vehicle data. Null if no data is available.")

public class VehicleMaintenancePassenger   {
  
  private VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;
  private List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenancePassengerDiagnosticTroubleCodes>();

  /**
   **/
  public VehicleMaintenancePassenger checkEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("checkEngineLight")
  public VehicleMaintenancePassengerCheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }
  public void setCheckEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  /**
   * Passenger vehicle DTCs.
   **/
  public VehicleMaintenancePassenger diagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  
  @ApiModelProperty(value = "Passenger vehicle DTCs.")
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenancePassengerDiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }
  public void setDiagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassenger vehicleMaintenancePassenger = (VehicleMaintenancePassenger) o;
    return Objects.equals(checkEngineLight, vehicleMaintenancePassenger.checkEngineLight) &&
        Objects.equals(diagnosticTroubleCodes, vehicleMaintenancePassenger.diagnosticTroubleCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkEngineLight, diagnosticTroubleCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassenger {\n");
    
    sb.append("    checkEngineLight: ").append(toIndentedString(checkEngineLight)).append("\n");
    sb.append("    diagnosticTroubleCodes: ").append(toIndentedString(diagnosticTroubleCodes)).append("\n");
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

