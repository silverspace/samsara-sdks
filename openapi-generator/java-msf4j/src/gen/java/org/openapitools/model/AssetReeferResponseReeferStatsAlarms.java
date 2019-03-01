package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AssetReeferResponseReeferStatsAlarms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class AssetReeferResponseReeferStatsAlarms   {
  @JsonProperty("severity")
  private Long severity;

  @JsonProperty("operatorAction")
  private String operatorAction;

  @JsonProperty("description")
  private String description;

  @JsonProperty("alarmCode")
  private Long alarmCode;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsAlarms assetReeferResponseReeferStatsAlarms = (AssetReeferResponseReeferStatsAlarms) o;
    return Objects.equals(this.severity, assetReeferResponseReeferStatsAlarms.severity) &&
        Objects.equals(this.operatorAction, assetReeferResponseReeferStatsAlarms.operatorAction) &&
        Objects.equals(this.description, assetReeferResponseReeferStatsAlarms.description) &&
        Objects.equals(this.alarmCode, assetReeferResponseReeferStatsAlarms.alarmCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, operatorAction, description, alarmCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsAlarms {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    operatorAction: ").append(toIndentedString(operatorAction)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    alarmCode: ").append(toIndentedString(alarmCode)).append("\n");
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

