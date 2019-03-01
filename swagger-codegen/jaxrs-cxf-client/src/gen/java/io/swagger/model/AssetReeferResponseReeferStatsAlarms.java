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

public class AssetReeferResponseReeferStatsAlarms  {
  
  @ApiModelProperty(example = "102", value = "ID of the alarm")
 /**
   * ID of the alarm
  **/
  private Long alarmCode = null;

  @ApiModelProperty(example = "Check Return Air Sensor", value = "Description of the alarm")
 /**
   * Description of the alarm
  **/
  private String description = null;

  @ApiModelProperty(example = "Check and repair at end of trip", value = "Recommended operator action")
 /**
   * Recommended operator action
  **/
  private String operatorAction = null;

  @ApiModelProperty(example = "1", value = "Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action")
 /**
   * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
  **/
  private Long severity = null;
 /**
   * ID of the alarm
   * @return alarmCode
  **/
  @JsonProperty("alarmCode")
  public Long getAlarmCode() {
    return alarmCode;
  }

  public void setAlarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
  }

  public AssetReeferResponseReeferStatsAlarms alarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
    return this;
  }

 /**
   * Description of the alarm
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssetReeferResponseReeferStatsAlarms description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Recommended operator action
   * @return operatorAction
  **/
  @JsonProperty("operatorAction")
  public String getOperatorAction() {
    return operatorAction;
  }

  public void setOperatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
  }

  public AssetReeferResponseReeferStatsAlarms operatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
    return this;
  }

 /**
   * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
   * @return severity
  **/
  @JsonProperty("severity")
  public Long getSeverity() {
    return severity;
  }

  public void setSeverity(Long severity) {
    this.severity = severity;
  }

  public AssetReeferResponseReeferStatsAlarms severity(Long severity) {
    this.severity = severity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsAlarms {\n");
    
    sb.append("    alarmCode: ").append(toIndentedString(alarmCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    operatorAction: ").append(toIndentedString(operatorAction)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

