package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class HosLogsParam   {
  
  private Long driverId = null;
  private Integer endMs = null;
  private Long groupId = null;
  private Integer startMs = null;

  /**
   * Driver ID to query.
   **/
  public HosLogsParam driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "444", required = true, value = "Driver ID to query.")
  @JsonProperty("driverId")
  @NotNull
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * End of the time range, specified in milliseconds UNIX time.
   **/
  public HosLogsParam endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  @JsonProperty("endMs")
  @NotNull
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  /**
   * Group ID to query.
   **/
  public HosLogsParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   **/
  public HosLogsParam startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
  @JsonProperty("startMs")
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
    HosLogsParam hosLogsParam = (HosLogsParam) o;
    return Objects.equals(driverId, hosLogsParam.driverId) &&
        Objects.equals(endMs, hosLogsParam.endMs) &&
        Objects.equals(groupId, hosLogsParam.groupId) &&
        Objects.equals(startMs, hosLogsParam.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, endMs, groupId, startMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsParam {\n");
    
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

