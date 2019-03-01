package apimodels;

import apimodels.VehicleMaintenancePassengerCheckEngineLight;
import apimodels.VehicleMaintenancePassengerDiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Passenger vehicle data. Null if no data is available.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    if (diagnosticTroubleCodes == null) {
      diagnosticTroubleCodes = new ArrayList<>();
    }
    diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
  }

   /**
   * Passenger vehicle DTCs.
   * @return diagnosticTroubleCodes
  **/
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
    return Objects.equals(checkEngineLight, vehicleMaintenancePassenger.checkEngineLight) &&
        Objects.equals(diagnosticTroubleCodes, vehicleMaintenancePassenger.diagnosticTroubleCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkEngineLight, diagnosticTroubleCodes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

