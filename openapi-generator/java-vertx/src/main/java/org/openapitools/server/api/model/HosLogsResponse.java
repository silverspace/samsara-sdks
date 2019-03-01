package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.HosLogsResponseLogs;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HosLogsResponse   {
  
  private List<HosLogsResponseLogs> logs = new ArrayList<>();

  public HosLogsResponse () {

  }

  public HosLogsResponse (List<HosLogsResponseLogs> logs) {
    this.logs = logs;
  }

    
  @JsonProperty("logs")
  public List<HosLogsResponseLogs> getLogs() {
    return logs;
  }
  public void setLogs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
