package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.VehicleMaintenanceJ1939CheckEngineLight;
import org.openapitools.server.api.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;

/**
 * J1939 based data. Null if no data is available.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleMaintenanceJ1939   {
  
  private VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null;
  private List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = new ArrayList<>();

  public VehicleMaintenanceJ1939 () {

  }

  public VehicleMaintenanceJ1939 (VehicleMaintenanceJ1939CheckEngineLight checkEngineLight, List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.checkEngineLight = checkEngineLight;
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }

    
  @JsonProperty("checkEngineLight")
  public VehicleMaintenanceJ1939CheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }
  public void setCheckEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

    
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }
  public void setDiagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
