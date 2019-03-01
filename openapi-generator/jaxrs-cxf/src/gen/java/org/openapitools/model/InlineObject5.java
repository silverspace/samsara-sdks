package org.openapitools.model;

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

public class InlineObject5  {
  
  @ApiModelProperty(example = "1481076244389", required = true, value = "End time (ms) of queried time period.")
 /**
   * End time (ms) of queried time period.
  **/
  private Long endMs;

  @ApiModelProperty(example = "101", required = true, value = "Org ID to query.")
 /**
   * Org ID to query.
  **/
  private Long orgId;

  @ApiModelProperty(example = "1481076243389", required = true, value = "Start time (ms) of queried time period.")
 /**
   * Start time (ms) of queried time period.
  **/
  private Long startMs;
 /**
   * End time (ms) of queried time period.
   * @return endMs
  **/
  @JsonProperty("endMs")
  @NotNull
  public Long getEndMs() {
    return endMs;
  }

  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

  public InlineObject5 endMs(Long endMs) {
    this.endMs = endMs;
    return this;
  }

 /**
   * Org ID to query.
   * @return orgId
  **/
  @JsonProperty("orgId")
  @NotNull
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public InlineObject5 orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

 /**
   * Start time (ms) of queried time period.
   * @return startMs
  **/
  @JsonProperty("startMs")
  @NotNull
  public Long getStartMs() {
    return startMs;
  }

  public void setStartMs(Long startMs) {
    this.startMs = startMs;
  }

  public InlineObject5 startMs(Long startMs) {
    this.startMs = startMs;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
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

