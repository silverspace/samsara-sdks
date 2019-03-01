package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleMaintenanceJ1939DiagnosticTroubleCodes  {
  
  @ApiModelProperty(value = "")
  private Integer fmiId = null;

  @ApiModelProperty(value = "")
  private String fmiText = null;

  @ApiModelProperty(value = "")
  private Integer occurrenceCount = null;

  @ApiModelProperty(value = "")
  private String spnDescription = null;

  @ApiModelProperty(value = "")
  private Integer spnId = null;

  @ApiModelProperty(value = "")
  private Integer txId = null;
 /**
   * Get fmiId
   * @return fmiId
  **/
  @JsonProperty("fmiId")
  public Integer getFmiId() {
    return fmiId;
  }

  public void setFmiId(Integer fmiId) {
    this.fmiId = fmiId;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiId(Integer fmiId) {
    this.fmiId = fmiId;
    return this;
  }

 /**
   * Get fmiText
   * @return fmiText
  **/
  @JsonProperty("fmiText")
  public String getFmiText() {
    return fmiText;
  }

  public void setFmiText(String fmiText) {
    this.fmiText = fmiText;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes fmiText(String fmiText) {
    this.fmiText = fmiText;
    return this;
  }

 /**
   * Get occurrenceCount
   * @return occurrenceCount
  **/
  @JsonProperty("occurrenceCount")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }

  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

 /**
   * Get spnDescription
   * @return spnDescription
  **/
  @JsonProperty("spnDescription")
  public String getSpnDescription() {
    return spnDescription;
  }

  public void setSpnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnDescription(String spnDescription) {
    this.spnDescription = spnDescription;
    return this;
  }

 /**
   * Get spnId
   * @return spnId
  **/
  @JsonProperty("spnId")
  public Integer getSpnId() {
    return spnId;
  }

  public void setSpnId(Integer spnId) {
    this.spnId = spnId;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes spnId(Integer spnId) {
    this.spnId = spnId;
    return this;
  }

 /**
   * Get txId
   * @return txId
  **/
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }

  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  public VehicleMaintenanceJ1939DiagnosticTroubleCodes txId(Integer txId) {
    this.txId = txId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

