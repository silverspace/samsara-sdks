package io.swagger.model;

import io.swagger.model.HosLogsResponseLogs;
import java.util.ArrayList;
import java.util.List;
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

public class HosLogsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<HosLogsResponseLogs> logs = null;
 /**
   * Get logs
   * @return logs
  **/
  @JsonProperty("logs")
  public List<HosLogsResponseLogs> getLogs() {
    return logs;
  }

  public void setLogs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
  }

  public HosLogsResponse logs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
    return this;
  }

  public HosLogsResponse addLogsItem(HosLogsResponseLogs logsItem) {
    this.logs.add(logsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsResponse {\n");
    
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

