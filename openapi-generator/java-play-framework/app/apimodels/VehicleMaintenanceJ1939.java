package apimodels;

import apimodels.VehicleMaintenanceJ1939CheckEngineLight;
import apimodels.VehicleMaintenanceJ1939DiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * J1939 based data. Null if no data is available.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
    if (diagnosticTroubleCodes == null) {
      diagnosticTroubleCodes = new ArrayList<>();
    }
    diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
  }

   /**
   * J1939 DTCs.
   * @return diagnosticTroubleCodes
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

