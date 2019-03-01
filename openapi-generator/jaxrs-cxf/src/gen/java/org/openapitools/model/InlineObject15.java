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

public class InlineObject15  {
  
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
 /**
   * End of the time range, specified in milliseconds UNIX time.
  **/
  private Integer endMs;

  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId;

  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs")
 /**
   * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
  **/
  private Integer startMs;

  @ApiModelProperty(example = "112", required = true, value = "Vehicle ID to query.")
 /**
   * Vehicle ID to query.
  **/
  private Long vehicleId;
 /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @JsonProperty("endMs")
  @NotNull
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public InlineObject15 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

 /**
   * Group ID to query.
   * @return groupId
  **/
  @JsonProperty("groupId")
  @NotNull
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject15 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs
   * @return startMs
  **/
  @JsonProperty("startMs")
  @NotNull
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public InlineObject15 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

 /**
   * Vehicle ID to query.
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  @NotNull
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public InlineObject15 vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

