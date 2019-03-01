package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AssetReeferResponseReeferStatsAlarms   {
  
  private Long alarmCode = null;
  private String description = null;
  private String operatorAction = null;
  private Long severity = null;

  /**
   * ID of the alarm
   **/
  public AssetReeferResponseReeferStatsAlarms alarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
    return this;
  }

  
  @ApiModelProperty(example = "102", value = "ID of the alarm")
  @JsonProperty("alarmCode")
  public Long getAlarmCode() {
    return alarmCode;
  }
  public void setAlarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
  }

  /**
   * Description of the alarm
   **/
  public AssetReeferResponseReeferStatsAlarms description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Check Return Air Sensor", value = "Description of the alarm")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Recommended operator action
   **/
  public AssetReeferResponseReeferStatsAlarms operatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
    return this;
  }

  
  @ApiModelProperty(example = "Check and repair at end of trip", value = "Recommended operator action")
  @JsonProperty("operatorAction")
  public String getOperatorAction() {
    return operatorAction;
  }
  public void setOperatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
  }

  /**
   * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
   **/
  public AssetReeferResponseReeferStatsAlarms severity(Long severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action")
  @JsonProperty("severity")
  public Long getSeverity() {
    return severity;
  }
  public void setSeverity(Long severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsAlarms assetReeferResponseReeferStatsAlarms = (AssetReeferResponseReeferStatsAlarms) o;
    return Objects.equals(alarmCode, assetReeferResponseReeferStatsAlarms.alarmCode) &&
        Objects.equals(description, assetReeferResponseReeferStatsAlarms.description) &&
        Objects.equals(operatorAction, assetReeferResponseReeferStatsAlarms.operatorAction) &&
        Objects.equals(severity, assetReeferResponseReeferStatsAlarms.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmCode, description, operatorAction, severity);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

