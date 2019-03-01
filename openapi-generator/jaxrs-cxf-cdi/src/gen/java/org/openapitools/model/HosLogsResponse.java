package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HosLogsResponseLogs;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class HosLogsResponse   {
  
  private List<HosLogsResponseLogs> logs = null;


  /**
   **/
  public HosLogsResponse logs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logs")
  public List<HosLogsResponseLogs> getLogs() {
    return logs;
  }
  public void setLogs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
  }

  public HosLogsResponse addLogsItem(HosLogsResponseLogs logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<HosLogsResponseLogs>();
    }
    this.logs.add(logsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsResponse hosLogsResponse = (HosLogsResponse) o;
    return Objects.equals(logs, hosLogsResponse.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

