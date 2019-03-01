package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.VehicleMaintenancePassengerCheckEngineLight;
import com.prokarma.pkmst.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;
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
 * Passenger vehicle data. Null if no data is available.
 */
@ApiModel(description = "Passenger vehicle data. Null if no data is available.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class VehicleMaintenancePassenger   {
  @JsonProperty("checkEngineLight")
  private VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;

  @JsonProperty("diagnosticTroubleCodes")
  
  private List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = null;

  public VehicleMaintenancePassenger checkEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

   /**
   * Get checkEngineLight
   * @return checkEngineLight
  **/
  @ApiModelProperty(value = "")
  public VehicleMaintenancePassengerCheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }

  public void setCheckEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  public VehicleMaintenancePassenger diagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  public VehicleMaintenancePassenger addDiagnosticTroubleCodesItem(VehicleMaintenancePassengerDiagnosticTroubleCodes diagnosticTroubleCodesItem) {
    if (this.diagnosticTroubleCodes == null) {
      this.diagnosticTroubleCodes = new ArrayList<>();
    }
    this.diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
  }

   /**
   * Passenger vehicle DTCs.
   * @return diagnosticTroubleCodes
  **/
  @ApiModelProperty(value = "Passenger vehicle DTCs.")
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
    return Objects.equals(this.checkEngineLight, vehicleMaintenancePassenger.checkEngineLight) &&
        Objects.equals(this.diagnosticTroubleCodes, vehicleMaintenancePassenger.diagnosticTroubleCodes);
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

