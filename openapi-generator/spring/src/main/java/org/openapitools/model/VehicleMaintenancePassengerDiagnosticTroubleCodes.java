package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleMaintenancePassengerDiagnosticTroubleCodes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class VehicleMaintenancePassengerDiagnosticTroubleCodes   {
  @JsonProperty("dtcShortCode")
  private String dtcShortCode;

  @JsonProperty("dtcId")
  private Integer dtcId;

  @JsonProperty("dtcDescription")
  private String dtcDescription;

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
    return this;
  }

  /**
   * Get dtcShortCode
   * @return dtcShortCode
  */
  @ApiModelProperty(value = "")


  public String getDtcShortCode() {
    return dtcShortCode;
  }

  public void setDtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
  }

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcId(Integer dtcId) {
    this.dtcId = dtcId;
    return this;
  }

  /**
   * Get dtcId
   * @return dtcId
  */
  @ApiModelProperty(value = "")


  public Integer getDtcId() {
    return dtcId;
  }

  public void setDtcId(Integer dtcId) {
    this.dtcId = dtcId;
  }

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
    return this;
  }

  /**
   * Get dtcDescription
   * @return dtcDescription
  */
  @ApiModelProperty(value = "")


  public String getDtcDescription() {
    return dtcDescription;
  }

  public void setDtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
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
    return Objects.equals(this.dtcShortCode, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcShortCode) &&
        Objects.equals(this.dtcId, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcId) &&
        Objects.equals(this.dtcDescription, vehicleMaintenancePassengerDiagnosticTroubleCodes.dtcDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtcShortCode, dtcId, dtcDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassengerDiagnosticTroubleCodes {\n");
    
    sb.append("    dtcShortCode: ").append(toIndentedString(dtcShortCode)).append("\n");
    sb.append("    dtcId: ").append(toIndentedString(dtcId)).append("\n");
    sb.append("    dtcDescription: ").append(toIndentedString(dtcDescription)).append("\n");
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

