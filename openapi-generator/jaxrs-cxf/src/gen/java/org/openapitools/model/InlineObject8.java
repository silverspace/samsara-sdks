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

public class InlineObject8  {
  
  @ApiModelProperty(example = "444", required = true, value = "Driver ID to query.")
 /**
   * Driver ID to query.
  **/
  private Long driverId;

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

  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
 /**
   * Beginning of the time range, specified in milliseconds UNIX time.
  **/
  private Integer startMs;
 /**
   * Driver ID to query.
   * @return driverId
  **/
  @JsonProperty("driverId")
  @NotNull
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public InlineObject8 driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

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

  public InlineObject8 endMs(Integer endMs) {
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

  public InlineObject8 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Beginning of the time range, specified in milliseconds UNIX time.
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

  public InlineObject8 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject8 {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

