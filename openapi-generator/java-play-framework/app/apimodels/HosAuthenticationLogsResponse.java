package apimodels;

import apimodels.HosAuthenticationLogsResponseAuthenticationLogs;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * HosAuthenticationLogsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class HosAuthenticationLogsResponse   {
  @JsonProperty("authenticationLogs")
  private List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = null;

  public HosAuthenticationLogsResponse authenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
    return this;
  }

  public HosAuthenticationLogsResponse addAuthenticationLogsItem(HosAuthenticationLogsResponseAuthenticationLogs authenticationLogsItem) {
    if (authenticationLogs == null) {
      authenticationLogs = new ArrayList<>();
    }
    authenticationLogs.add(authenticationLogsItem);
    return this;
  }

   /**
   * Get authenticationLogs
   * @return authenticationLogs
  **/
  @Valid
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
    return Objects.equals(authenticationLogs, hosAuthenticationLogsResponse.authenticationLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationLogs);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

