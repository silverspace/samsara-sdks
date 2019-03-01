package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleMaintenancePassengerDiagnosticTroubleCodes   {
  
  private @Valid String dtcDescription = null;
  private @Valid Integer dtcId = null;
  private @Valid String dtcShortCode = null;

  /**
   **/
  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dtcDescription")
  public String getDtcDescription() {
    return dtcDescription;
  }
  public void setDtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
  }

  /**
   **/
  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcId(Integer dtcId) {
    this.dtcId = dtcId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dtcId")
  public Integer getDtcId() {
    return dtcId;
  }
  public void setDtcId(Integer dtcId) {
    this.dtcId = dtcId;
  }

  /**
   **/
  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dtcShortCode")
  public String getDtcShortCode() {
    return dtcShortCode;
  }
  public void setDtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassengerDiagnosticTroubleCodes vehicleMaintenancePassengerDiagnosticTroubleCodes = (VehicleMaintenancePassengerDiagnosticTroubleCodes) o;
    return Objects.equals(dtcDescription, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcDescription) &&
        Objects.equals(dtcId, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcId) &&
        Objects.equals(dtcShortCode, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcShortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtcDescription, dtcId, dtcShortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassengerDiagnosticTroubleCodes {\n");
    
    sb.append("    dtcDescription: ").append(toIndentedString(dtcDescription)).append("\n");
    sb.append("    dtcId: ").append(toIndentedString(dtcId)).append("\n");
    sb.append("    dtcShortCode: ").append(toIndentedString(dtcShortCode)).append("\n");
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

