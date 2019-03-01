package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DriversSummaryParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class DriversSummaryParam   {
  @JsonProperty("endMs")
  private Long endMs = null;

  @JsonProperty("orgId")
  private Long orgId = null;

  @JsonProperty("startMs")
  private Long startMs = null;

  public DriversSummaryParam endMs(Long endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * End time (ms) of queried time period.
   * @return endMs
  **/
  @ApiModelProperty(example = "1481076244389", required = true, value = "End time (ms) of queried time period.")
  @NotNull


  public Long getEndMs() {
    return endMs;
  }

  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

  public DriversSummaryParam orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID to query.
   * @return orgId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Org ID to query.")
  @NotNull


  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public DriversSummaryParam startMs(Long startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Start time (ms) of queried time period.
   * @return startMs
  **/
  @ApiModelProperty(example = "1481076243389", required = true, value = "Start time (ms) of queried time period.")
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
    return Objects.equals(this.endMs, driversSummaryParam.endMs) &&
        Objects.equals(this.orgId, driversSummaryParam.orgId) &&
        Objects.equals(this.startMs, driversSummaryParam.startMs);
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

