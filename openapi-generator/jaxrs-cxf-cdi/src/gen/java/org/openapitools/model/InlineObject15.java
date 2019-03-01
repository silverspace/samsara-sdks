package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineObject15   {
  
  private Integer endMs;

  private Long groupId;

  private Integer startMs;

  private Long vehicleId;


  /**
   * End of the time range, specified in milliseconds UNIX time.
   **/
  public InlineObject15 endMs(Integer endMs) {
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
  public InlineObject15 groupId(Long groupId) {
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
   * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
   **/
  public InlineObject15 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs")
  @JsonProperty("startMs")
  @NotNull
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }


  /**
   * Vehicle ID to query.
   **/
  public InlineObject15 vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  
  @ApiModelProperty(example = "112", required = true, value = "Vehicle ID to query.")
  @JsonProperty("vehicleId")
  @NotNull
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject15 inlineObject15 = (InlineObject15) o;
    return Objects.equals(endMs, inlineObject15.endMs) &&
        Objects.equals(groupId, inlineObject15.groupId) &&
        Objects.equals(startMs, inlineObject15.startMs) &&
        Objects.equals(vehicleId, inlineObject15.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endMs, groupId, startMs, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject15 {\n");
    
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

