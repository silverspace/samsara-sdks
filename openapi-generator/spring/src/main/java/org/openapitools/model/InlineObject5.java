package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class InlineObject5   {
  @JsonProperty("endMs")
  private Long endMs;

  @JsonProperty("orgId")
  private Long orgId;

  @JsonProperty("startMs")
  private Long startMs;

  public InlineObject5 endMs(Long endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * End time (ms) of queried time period.
   * @return endMs
  */
  @ApiModelProperty(example = "1481076244389", required = true, value = "End time (ms) of queried time period.")
  @NotNull


  public Long getEndMs() {
    return endMs;
  }

  public void setEndMs(Long endMs) {
    this.endMs = endMs;
  }

  public InlineObject5 orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID to query.
   * @return orgId
  */
  @ApiModelProperty(example = "101", required = true, value = "Org ID to query.")
  @NotNull


  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public InlineObject5 startMs(Long startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Start time (ms) of queried time period.
   * @return startMs
  */
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
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.endMs, inlineObject5.endMs) &&
        Objects.equals(this.orgId, inlineObject5.orgId) &&
        Objects.equals(this.startMs, inlineObject5.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, orgId, startMs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

