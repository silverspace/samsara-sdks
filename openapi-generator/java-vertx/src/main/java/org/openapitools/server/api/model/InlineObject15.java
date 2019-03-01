package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject15   {
  
  private Integer endMs;
  private Long groupId;
  private Integer startMs;
  private Long vehicleId;

  public InlineObject15 () {

  }

  public InlineObject15 (Integer endMs, Long groupId, Integer startMs, Long vehicleId) {
    this.endMs = endMs;
    this.groupId = groupId;
    this.startMs = startMs;
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

    
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

    
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

    
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
