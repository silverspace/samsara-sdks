package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.VehicleMaintenanceJ1939CheckEngineLight;
import com.prokarma.pkmst.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * J1939 based data. Null if no data is available.
 */
@ApiModel(description = "J1939 based data. Null if no data is available.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class VehicleMaintenanceJ1939   {
  @JsonProperty("checkEngineLight")
  private VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null;

  @JsonProperty("diagnosticTroubleCodes")
  
  private List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = null;

  public VehicleMaintenanceJ1939 checkEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

   /**
   * Get checkEngineLight
   * @return checkEngineLight
  **/
  @ApiModelProperty(value = "")
  public VehicleMaintenanceJ1939CheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }

  public void setCheckEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  public VehicleMaintenanceJ1939 diagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  public VehicleMaintenanceJ1939 addDiagnosticTroubleCodesItem(VehicleMaintenanceJ1939DiagnosticTroubleCodes diagnosticTroubleCodesItem) {
    if (this.diagnosticTroubleCodes == null) {
      this.diagnosticTroubleCodes = new ArrayList<>();
    }
    this.diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
  }

   /**
   * J1939 DTCs.
   * @return diagnosticTroubleCodes
  **/
  @ApiModelProperty(value = "J1939 DTCs.")
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
    return Objects.equals(this.checkEngineLight, vehicleMaintenanceJ1939.checkEngineLight) &&
        Objects.equals(this.diagnosticTroubleCodes, vehicleMaintenanceJ1939.diagnosticTroubleCodes);
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

