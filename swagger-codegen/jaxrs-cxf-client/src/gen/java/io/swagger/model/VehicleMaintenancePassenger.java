package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.VehicleMaintenancePassengerCheckEngineLight;
import io.swagger.model.VehicleMaintenancePassengerDiagnosticTroubleCodes;
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
  * Passenger vehicle data. Null if no data is available.
 **/
@ApiModel(description="Passenger vehicle data. Null if no data is available.")
public class VehicleMaintenancePassenger  {
  
  @ApiModelProperty(value = "")
  private VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;

  @ApiModelProperty(value = "Passenger vehicle DTCs.")
 /**
   * Passenger vehicle DTCs.
  **/
  private List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = null;
 /**
   * Get checkEngineLight
   * @return checkEngineLight
  **/
  @JsonProperty("checkEngineLight")
  public VehicleMaintenancePassengerCheckEngineLight getCheckEngineLight() {
    return checkEngineLight;
  }

  public void setCheckEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
  }

  public VehicleMaintenancePassenger checkEngineLight(VehicleMaintenancePassengerCheckEngineLight checkEngineLight) {
    this.checkEngineLight = checkEngineLight;
    return this;
  }

 /**
   * Passenger vehicle DTCs.
   * @return diagnosticTroubleCodes
  **/
  @JsonProperty("diagnosticTroubleCodes")
  public List<VehicleMaintenancePassengerDiagnosticTroubleCodes> getDiagnosticTroubleCodes() {
    return diagnosticTroubleCodes;
  }

  public void setDiagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
  }

  public VehicleMaintenancePassenger diagnosticTroubleCodes(List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes) {
    this.diagnosticTroubleCodes = diagnosticTroubleCodes;
    return this;
  }

  public VehicleMaintenancePassenger addDiagnosticTroubleCodesItem(VehicleMaintenancePassengerDiagnosticTroubleCodes diagnosticTroubleCodesItem) {
    this.diagnosticTroubleCodes.add(diagnosticTroubleCodesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

