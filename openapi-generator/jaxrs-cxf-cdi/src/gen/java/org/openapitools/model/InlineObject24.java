package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class InlineObject24   {
  
  private Long groupId;

  private List<Long> sensors = new ArrayList<Long>();


  /**
   * Group ID to query.
   **/
  public InlineObject24 groupId(Long groupId) {
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
   * List of sensor IDs to query.
   **/
  public InlineObject24 sensors(List<Long> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(example = "[122]", required = true, value = "List of sensor IDs to query.")
  @JsonProperty("sensors")
  @NotNull
  public List<Long> getSensors() {
    return sensors;
  }
  public void setSensors(List<Long> sensors) {
    this.sensors = sensors;
  }

  public InlineObject24 addSensorsItem(Long sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject24 inlineObject24 = (InlineObject24) o;
    return Objects.equals(groupId, inlineObject24.groupId) &&
        Objects.equals(sensors, inlineObject24.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject24 {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
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

