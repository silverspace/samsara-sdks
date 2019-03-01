package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleMaintenancePassengerDiagnosticTroubleCodes  {
  
  @ApiModelProperty(value = "")
  private String dtcShortCode;

  @ApiModelProperty(value = "")
  private Integer dtcId;

  @ApiModelProperty(value = "")
  private String dtcDescription;
 /**
   * Get dtcShortCode
   * @return dtcShortCode
  **/
  @JsonProperty("dtcShortCode")
  public String getDtcShortCode() {
    return dtcShortCode;
  }

  public void setDtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
  }

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcShortCode(String dtcShortCode) {
    this.dtcShortCode = dtcShortCode;
    return this;
  }

 /**
   * Get dtcId
   * @return dtcId
  **/
  @JsonProperty("dtcId")
  public Integer getDtcId() {
    return dtcId;
  }

  public void setDtcId(Integer dtcId) {
    this.dtcId = dtcId;
  }

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcId(Integer dtcId) {
    this.dtcId = dtcId;
    return this;
  }

 /**
   * Get dtcDescription
   * @return dtcDescription
  **/
  @JsonProperty("dtcDescription")
  public String getDtcDescription() {
    return dtcDescription;
  }

  public void setDtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
  }

  public VehicleMaintenancePassengerDiagnosticTroubleCodes dtcDescription(String dtcDescription) {
    this.dtcDescription = dtcDescription;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

