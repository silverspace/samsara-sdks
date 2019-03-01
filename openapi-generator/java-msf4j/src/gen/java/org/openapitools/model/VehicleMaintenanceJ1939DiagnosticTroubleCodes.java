package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VehicleMaintenanceJ1939DiagnosticTroubleCodes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class VehicleMaintenanceJ1939DiagnosticTroubleCodes   {
  @JsonProperty("spnDescription")
  private String spnDescription;

  @JsonProperty("fmiText")
  private String fmiText;

  @JsonProperty("spnId")
  private Integer spnId;

  @JsonProperty("occurrenceCount")
  private Integer occurrenceCount;

  @JsonProperty("txId")
  private Integer txId;

  @JsonProperty("fmiId")
  private Integer fmiId;

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
    return this;
  }

   /**
   * Get spnDescription
   * @return spnDescription
  **/
  @ApiModelProperty(value = "")
  public String getSpnDescription() {
    return spnDescription;
  }

  public void setSpnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiText(String fmiText) {
    this.fmiText = fmiText;
    return this;
  }

   /**
   * Get fmiText
   * @return fmiText
  **/
  @ApiModelProperty(value = "")
  public String getFmiText() {
    return fmiText;
  }

  public void setFmiText(String fmiText) {
    this.fmiText = fmiText;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnId(Integer spnId) {
    this.spnId = spnId;
    return this;
  }

   /**
   * Get spnId
   * @return spnId
  **/
  @ApiModelProperty(value = "")
  public Integer getSpnId() {
    return spnId;
  }

  public void setSpnId(Integer spnId) {
    this.spnId = spnId;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

   /**
   * Get occurrenceCount
   * @return occurrenceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }

  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes txId(Integer txId) {
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @ApiModelProperty(value = "")
  public Integer getTxId() {
    return txId;
  }

  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiId(Integer fmiId) {
    this.fmiId = fmiId;
    return this;
  }

   /**
   * Get fmiId
   * @return fmiId
  **/
  @ApiModelProperty(value = "")
  public Integer getFmiId() {
    return fmiId;
  }

  public void setFmiId(Integer fmiId) {
    this.fmiId = fmiId;
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
    return Objects.equals(this.spnDescription, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnDescription) &&
        Objects.equals(this.fmiText, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiText) &&
        Objects.equals(this.spnId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.spnId) &&
        Objects.equals(this.occurrenceCount, vehicleMaintenanceJ1939DiagnosticTroubleCodes.occurrenceCount) &&
        Objects.equals(this.txId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.txId) &&
        Objects.equals(this.fmiId, vehicleMaintenanceJ1939DiagnosticTroubleCodes.fmiId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

