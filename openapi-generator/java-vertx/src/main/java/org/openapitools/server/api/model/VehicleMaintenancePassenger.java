package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.VehicleMaintenancePassengerCheckEngineLight;
import org.openapitools.server.api.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;

/**
 * Passenger vehicle data. Null if no data is available.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleMaintenancePassenger   {
  
  private VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;
  private List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<>();

  public VehicleMaintenancePassenger () {

  }

  public VehicleMaintenancePassenger (VehicleMaintenancePassengerCheckEngineLight checkEngineLight, List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.checkEngineLight = checkEngineLight;
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }

    
  @JsonProperty("checkEngineLight")
  public VehicleMaintenancePassengerCheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }
  public void setCheckEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

    
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenancePassengerDiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }
  public void setDiagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
