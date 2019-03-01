package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetReeferResponseReeferStatsAlarms   {
  
  private Long severity;
  private String operatorAction;
  private String description;
  private Long alarmCode;

  public AssetReeferResponseReeferStatsAlarms () {

  }

  public AssetReeferResponseReeferStatsAlarms (Long severity, String operatorAction, String description, Long alarmCode) {
    this.severity = severity;
    this.operatorAction = operatorAction;
    this.description = description;
    this.alarmCode = alarmCode;
  }

    
  @JsonProperty("severity")
  public Long getSeverity() {
    return severity;
  }
  public void setSeverity(Long severity) {
    this.severity = severity;
  }

    
  @JsonProperty("operatorAction")
  public String getOperatorAction() {
    return operatorAction;
  }
  public void setOperatorAction(String operatorAction) {
    this.operatorAction = operatorAction;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("alarmCode")
  public Long getAlarmCode() {
    return alarmCode;
  }
  public void setAlarmCode(Long alarmCode) {
    this.alarmCode = alarmCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsAlarms assetReeferResponseReeferStatsAlarms = (AssetReeferResponseReeferStatsAlarms) o;
    return Objects.equals(severity, assetReeferResponseReeferStatsAlarms.severity) &&
        Objects.equals(operatorAction, assetReeferResponseReeferStatsAlarms.operatorAction) &&
        Objects.equals(description, assetReeferResponseReeferStatsAlarms.description) &&
        Objects.equals(alarmCode, assetReeferResponseReeferStatsAlarms.alarmCode);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
