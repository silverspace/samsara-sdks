package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.HosAuthenticationLogsResponseAuthenticationLogs;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HosAuthenticationLogsResponse   {
  
  private List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = new ArrayList<>();

  public HosAuthenticationLogsResponse () {

  }

  public HosAuthenticationLogsResponse (List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
  }

    
  @JsonProperty("authenticationLogs")
  public List<HosAuthenticationLogsResponseAuthenticationLogs> getAuthenticationLogs() {
    return authenticationLogs;
  }
  public void setAuthenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosAuthenticationLogsResponse hosAuthenticationLogsResponse = (HosAuthenticationLogsResponse) o;
    return Objects.equals(authenticationLogs, hosAuthenticationLogsResponse.authenticationLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosAuthenticationLogsResponse {\n");
    
    sb.append("    authenticationLogs: ").append(toIndentedString(authenticationLogs)).append("\n");
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
