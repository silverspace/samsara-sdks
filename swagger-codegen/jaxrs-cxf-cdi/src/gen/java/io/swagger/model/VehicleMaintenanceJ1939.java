package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.VehicleMaintenanceJ1939CheckEngineLight;
import io.swagger.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * J1939 based data. Null if no data is available.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "J1939 based data. Null if no data is available.")

public class VehicleMaintenanceJ1939   {
  
  private VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null;
  private List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<VehicleMaintenanceJ1939DiagnosticTroubleCodes>();

  /**
   **/
  public VehicleMaintenanceJ1939 checkEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("checkEngineLight")
  public VehicleMaintenanceJ1939CheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }
  public void setCheckEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  /**
   * J1939 DTCs.
   **/
  public VehicleMaintenanceJ1939 diagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  
  @ApiModelProperty(value = "J1939 DTCs.")
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }
  public void setDiagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
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
    VehicleMaintenanceJ1939 vehicleMaintenanceJ1939 = (VehicleMaintenanceJ1939) o;
    return Objects.equals(checkEngineLight, vehicleMaintenanceJ1939.checkEngineLight) &&
        Objects.equals(diagnosticTroubleCodes, vehicleMaintenanceJ1939.diagnosticTroubleCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkEngineLight, diagnosticTroubleCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939 {\n");
    
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

