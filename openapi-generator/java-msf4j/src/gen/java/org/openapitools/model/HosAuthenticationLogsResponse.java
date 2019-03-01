package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HosAuthenticationLogsResponseAuthenticationLogs;

/**
 * HosAuthenticationLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class HosAuthenticationLogsResponse   {
  @JsonProperty("authenticationLogs")
  private List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = null;

  public HosAuthenticationLogsResponse authenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
    return this;
  }

  public HosAuthenticationLogsResponse addAuthenticationLogsItem(HosAuthenticationLogsResponseAuthenticationLogs authenticationLogsItem) {
    if (this.authenticationLogs == null) {
      this.authenticationLogs = new ArrayList<HosAuthenticationLogsResponseAuthenticationLogs>();
    }
    this.authenticationLogs.add(authenticationLogsItem);
    return this;
  }

   /**
   * Get authenticationLogs
   * @return authenticationLogs
  **/
  @ApiModelProperty(value = "")
  public List<HosAuthenticationLogsResponseAuthenticationLogs> getAuthenticationLogs() {
    return authenticationLogs;
  }

  public void setAuthenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosAuthenticationLogsResponse hosAuthenticationLogsResponse = (HosAuthenticationLogsResponse) o;
    return Objects.equals(this.authenticationLogs, hosAuthenticationLogsResponse.authenticationLogs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

