package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class VehicleMaintenancePassengerDiagnosticTroubleCodes   {
  
  private String dtcDescription = null;
  private Integer dtcId = null;
  private String dtcShortCode = null;

  /**
   **/
  
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

