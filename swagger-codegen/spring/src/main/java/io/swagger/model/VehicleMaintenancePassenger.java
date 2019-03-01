package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleMaintenancePassengerCheckEngineLight;
import io.swagger.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Passenger vehicle data. Null if no data is available.
 */
@ApiModel(description = "Passenger vehicle data. Null if no data is available.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class VehicleMaintenancePassenger   {
  @JsonProperty("checkEngineLight")
  private VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;

  @JsonProperty("diagnosticTroubleCodes")
  @Valid
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

  @Valid

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
      this.diagnosticTroubleCodes = new ArrayList<VehicleMaintenancePassengerDiagnosticTroubleCodes>();
    }
    this.diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
  }

  /**
   * Passenger vehicle DTCs.
   * @return diagnosticTroubleCodes
  **/
  @ApiModelProperty(value = "Passenger vehicle DTCs.")

  @Valid

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

