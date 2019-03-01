package io.swagger.model;

import io.swagger.model.HosAuthenticationLogsResponseAuthenticationLogs;
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

public class HosAuthenticationLogsResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = null;
 /**
   * Get authenticationLogs
   * @return authenticationLogs
  **/
  @JsonProperty("authenticationLogs")
  public List<HosAuthenticationLogsResponseAuthenticationLogs> getAuthenticationLogs() {
    return authenticationLogs;
  }

  public void setAuthenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
  }

  public HosAuthenticationLogsResponse authenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs) {
    this.authenticationLogs = authenticationLogs;
    return this;
  }

  public HosAuthenticationLogsResponse addAuthenticationLogsItem(HosAuthenticationLogsResponseAuthenticationLogs authenticationLogsItem) {
    this.authenticationLogs.add(authenticationLogsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

