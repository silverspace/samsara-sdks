package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class VehicleMaintenanceJ1939DiagnosticTroubleCodes   {
  

  private String spnDescription;

  private String fmiText;

  private Integer spnId;

  private Integer occurrenceCount;

  private Integer txId;

  private Integer fmiId;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("spnDescription")
  public String getSpnDescription() {
    return spnDescription;
  }
  public void setSpnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fmiText")
  public String getFmiText() {
    return fmiText;
  }
  public void setFmiText(String fmiText) {
    this.fmiText = fmiText;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("spnId")
  public Integer getSpnId() {
    return spnId;
  }
  public void setSpnId(Integer spnId) {
    this.spnId = spnId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("occurrenceCount")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }
  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fmiId")
  public Integer getFmiId() {
    return fmiId;
  }
  public void setFmiId(Integer fmiId) {
    this.fmiId = fmiId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenanceJ1939DiagnosticTroubleCodes vehicleMaintenanceJ1939DiagnosticTroubleCodes = (VehicleMaintenanceJ1939DiagnosticTroubleCodes) o;
    return Objects.equals(spnDescription, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnDescription) &&
        Objects.equals(fmiText, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiText) &&
        Objects.equals(spnId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnId) &&
        Objects.equals(occurrenceCount, vehicleMaintenanceJ1939DiagnosticTroubleCodes.occurrenceCount) &&
        Objects.equals(txId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.txId) &&
        Objects.equals(fmiId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spnDescription, fmiText, spnId, occurrenceCount, txId, fmiId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939DiagnosticTroubleCodes {\n");
    
    sb.append("    spnDescription: ").append(toIndentedString(spnDescription)).append("\n");
    sb.append("    fmiText: ").append(toIndentedString(fmiText)).append("\n");
    sb.append("    spnId: ").append(toIndentedString(spnId)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    fmiId: ").append(toIndentedString(fmiId)).append("\n");
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

