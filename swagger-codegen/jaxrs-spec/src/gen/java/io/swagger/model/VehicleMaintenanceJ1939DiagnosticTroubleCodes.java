package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleMaintenanceJ1939DiagnosticTroubleCodes   {
  
  private @Valid Integer fmiId = null;
  private @Valid String fmiText = null;
  private @Valid Integer occurrenceCount = null;
  private @Valid String spnDescription = null;
  private @Valid Integer spnId = null;
  private @Valid Integer txId = null;

  /**
   **/
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiId(Integer fmiId) {
    this.fmiId = fmiId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fmiId")
  public Integer getFmiId() {
    return fmiId;
  }
  public void setFmiId(Integer fmiId) {
    this.fmiId = fmiId;
  }

  /**
   **/
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiText(String fmiText) {
    this.fmiText = fmiText;
    return this;
  }

  
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
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

  
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
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
    return this;
  }

  
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
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnId(Integer spnId) {
    this.spnId = spnId;
    return this;
  }

  
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
  public VehicleMaintenanceJ1939DiagnosticTroubleCodes txId(Integer txId) {
    this.txId = txId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }
  public void setTxId(Integer txId) {
    this.txId = txId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenanceJ1939DiagnosticTroubleCodes vehicleMaintenanceJ1939DiagnosticTroubleCodes = (VehicleMaintenanceJ1939DiagnosticTroubleCodes) o;
    return Objects.equals(fmiId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiId) &&
        Objects.equals(fmiText, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiText) &&
        Objects.equals(occurrenceCount, vehicleMaintenanceJ1939DiagnosticTroubleCodes.occurrenceCount) &&
        Objects.equals(spnDescription, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnDescription) &&
        Objects.equals(spnId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnId) &&
        Objects.equals(txId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fmiId, fmiText, occurrenceCount, spnDescription, spnId, txId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939DiagnosticTroubleCodes {\n");
    
    sb.append("    fmiId: ").append(toIndentedString(fmiId)).append("\n");
    sb.append("    fmiText: ").append(toIndentedString(fmiText)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    spnDescription: ").append(toIndentedString(spnDescription)).append("\n");
    sb.append("    spnId: ").append(toIndentedString(spnId)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

