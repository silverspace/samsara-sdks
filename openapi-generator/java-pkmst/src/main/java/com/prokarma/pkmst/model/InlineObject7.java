package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InlineObject7
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class InlineObject7   {
  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("endMs")
  private Integer endMs;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("startMs")
  private Integer startMs;

  public InlineObject7 driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * Driver ID to query.
   * @return driverId
  **/
  @ApiModelProperty(example = "444", required = true, value = "Driver ID to query.")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public InlineObject7 endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the time range, specified in milliseconds UNIX time.
   * @return endMs
  **/
  @ApiModelProperty(example = "1462881998034", required = true, value = "End of the time range, specified in milliseconds UNIX time.")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public InlineObject7 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID to query.
   * @return groupId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject7 startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the time range, specified in milliseconds UNIX time.
   * @return startMs
  **/
  @ApiModelProperty(example = "1462878398034", required = true, value = "Beginning of the time range, specified in milliseconds UNIX time.")
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
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(this.driverId, inlineObject7.driverId) &&
        Objects.equals(this.endMs, inlineObject7.endMs) &&
        Objects.equals(this.groupId, inlineObject7.groupId) &&
        Objects.equals(this.startMs, inlineObject7.startMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, endMs, groupId, startMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    
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

