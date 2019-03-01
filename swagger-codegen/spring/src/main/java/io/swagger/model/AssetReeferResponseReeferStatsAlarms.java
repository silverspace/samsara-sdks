package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetReeferResponseReeferStatsAlarms
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AssetReeferResponseReeferStatsAlarms   {
  @JsonProperty("alarmCode")
  private Long alarmCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("operatorAction")
  private String operatorAction = null;

  @JsonProperty("severity")
  private Long severity = null;

  public AssetReeferResponseReeferStatsAlarms alarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
    return this;
  }

  /**
   * ID of the alarm
   * @return alarmCode
  **/
  @ApiModelProperty(example = "102", value = "ID of the alarm")


  public Long getAlarmCode() {
    return alarmCode;
  }

  public void setAlarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
  }

  public AssetReeferResponseReeferStatsAlarms description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the alarm
   * @return description
  **/
  @ApiModelProperty(example = "Check Return Air Sensor", value = "Description of the alarm")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssetReeferResponseReeferStatsAlarms operatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
    return this;
  }

  /**
   * Recommended operator action
   * @return operatorAction
  **/
  @ApiModelProperty(example = "Check and repair at end of trip", value = "Recommended operator action")


  public String getOperatorAction() {
    return operatorAction;
  }

  public void setOperatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
  }

  public AssetReeferResponseReeferStatsAlarms severity(Long severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
   * @return severity
  **/
  @ApiModelProperty(example = "1", value = "Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action")


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
    return Objects.equals(this.alarmCode, assetReeferResponseReeferStatsAlarms.alarmCode) &&
        Objects.equals(this.description, assetReeferResponseReeferStatsAlarms.description) &&
        Objects.equals(this.operatorAction, assetReeferResponseReeferStatsAlarms.operatorAction) &&
        Objects.equals(this.severity, assetReeferResponseReeferStatsAlarms.severity);
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

