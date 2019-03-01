package apimodels;

import apimodels.HosLogsResponseLogs;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosLogsResponse   {
  @JsonProperty("logs")
  private List<HosLogsResponseLogs> logs = null;

  public HosLogsResponse logs(List<HosLogsResponseLogs> logs) {
    this.logs = logs;
    return this;
  }

  public HosLogsResponse addLogsItem(HosLogsResponseLogs logsItem) {
    if (logs == null) {
      logs = new ArrayList<>();
    }
    logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @Valid
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
    return Objects.equals(logs, hosLogsResponse.logs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

