package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HosLogsResponseLogs;

/**
 * HosLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class HosLogsResponse   {
  @JsonProperty("logs")
  private List<HosLogsResponseLogs> logs = null;

  public HosLogsResponse logs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
    return this;
  }

  public HosLogsResponse addLogsItem(HosLogsResponseLogs logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<HosLogsResponseLogs>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
  public List<HosLogsResponseLogs> getLogs() {
    return logs;
  }

  public void setLogs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
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
    return Objects.equals(this.logs, hosLogsResponse.logs);
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

