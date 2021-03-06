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
 * HosAuthenticationLogsParam
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class HosAuthenticationLogsParam   {
  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("endMs")
  private Integer endMs = null;

  @JsonProperty("groupId")
  private Long groupId = null;

  @JsonProperty("startMs")
  private Integer startMs = null;

  public HosAuthenticationLogsParam driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Driver ID to query.
   * @return driverId
  **/
  @ApiModelProperty(example = "444", required = true, value = "Driver ID to query.")
  @NotNull


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public HosAuthenticationLogsParam endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  @NotNull


  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public HosAuthenticationLogsParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @NotNull


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public HosAuthenticationLogsParam startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  @NotNull


  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
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
    HosAuthenticationLogsParam hosAuthenticationLogsParam = (HosAuthenticationLogsParam) o;
    return Objects.equals(this.driverId, hosAuthenticationLogsParam.driverId) &&
        Objects.equals(this.endMs, hosAuthenticationLogsParam.endMs) &&
        Objects.equals(this.groupId, hosAuthenticationLogsParam.groupId) &&
        Objects.equals(this.startMs, hosAuthenticationLogsParam.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, endMs, groupId, startMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosAuthenticationLogsParam {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

