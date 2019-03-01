package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HosAuthenticationLogsResponseAuthenticationLogs;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class HosAuthenticationLogsResponse   {
  

  private List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = new ArrayList<HosAuthenticationLogsResponseAuthenticationLogs>();

  /**
   **/
  
  @ApiModelProperty(value = "")
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

