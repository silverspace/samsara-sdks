package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.VehicleMaintenanceJ1939CheckEngineLight;
import io.swagger.model.VehicleMaintenanceJ1939DiagnosticTroubleCodes;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * J1939 based data. Null if no data is available.
 **/
@ApiModel(description="J1939 based data. Null if no data is available.")
public class VehicleMaintenanceJ1939  {
  
  @ApiModelProperty(value = "")
  private VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null;

  @ApiModelProperty(value = "J1939 DTCs.")
 /**
   * J1939 DTCs.
  **/
  private List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = null;
 /**
   * Get checkEngineLight
   * @return checkEngineLight
  **/
  @JsonProperty("checkEngineLight")
  public VehicleMaintenanceJ1939CheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }

  public void setCheckEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  public VehicleMaintenanceJ1939 checkEngineLight(VehicleMaintenanceJ1939CheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

 /**
   * J1939 DTCs.
   * @return diagnosticTroubleCodes
  **/
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }

  public void setDiagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }

  public VehicleMaintenanceJ1939 diagnosticTroubleCodes(List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  public VehicleMaintenanceJ1939 addDiagnosticTroubleCodesItem(VehicleMaintenanceJ1939DiagnosticTroubleCodes diagnosticTroubleCodesItem) {
    this.diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

