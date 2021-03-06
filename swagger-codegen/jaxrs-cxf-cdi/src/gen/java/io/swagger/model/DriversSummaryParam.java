package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DriversSummaryParam   {
  
  private Long endMs = null;
  private Long orgId = null;
  private Long startMs = null;

  /**
   * End time (ms) of queried time period.
   **/
  public DriversSummaryParam endMs(Long endMs) {
    this.endMs = endMs;
    return this;
  }

  
  @ApiModelProperty(example = "1481076244389", required = true, value = "End time (ms) of queried time period.")
  @JsonProperty("endMs")
  @NotNull
  public Long getEndMs() {
    return endMs;
  }
  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

  /**
   * Org ID to query.
   **/
  public DriversSummaryParam orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  
  @ApiModelProperty(example = "101", required = true, value = "Org ID to query.")
  @JsonProperty("orgId")
  @NotNull
  public Long getOrgId() {
    return orgId;
  }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  /**
   * Start time (ms) of queried time period.
   **/
  public DriversSummaryParam startMs(Long startMs) {
    this.startMs = startMs;
    return this;
  }

  
  @ApiModelProperty(example = "1481076243389", required = true, value = "Start time (ms) of queried time period.")
  @JsonProperty("startMs")
  @NotNull
  public Long getStartMs() {
    return startMs;
  }
  public void setStartMs(Long startMs) {
    this.startMs = startMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversSummaryParam driversSummaryParam = (DriversSummaryParam) o;
    return Objects.equals(endMs, driversSummaryParam.endMs) &&
        Objects.equals(orgId, driversSummaryParam.orgId) &&
        Objects.equals(startMs, driversSummaryParam.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, orgId, startMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversSummaryParam {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

