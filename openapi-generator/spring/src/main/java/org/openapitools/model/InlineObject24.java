package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject24
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class InlineObject24   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("sensors")
  @Valid
  private List<Long> sensors = new ArrayList<>();

  public InlineObject24 groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Group ID to query.
   * @return groupId
  */
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
  @NotNull


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public InlineObject24 sensors(List<Long> sensors) {
    this.sensors = sensors;
    return this;
  }

  public InlineObject24 addSensorsItem(Long sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * List of sensor IDs to query.
   * @return sensors
  */
  @ApiModelProperty(example = "[122]", required = true, value = "List of sensor IDs to query.")
  @NotNull


  public List<Long> getSensors() {
    return sensors;
  }

  public void setSensors(List<Long> sensors) {
    this.sensors = sensors;
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
    return Objects.equals(this.groupId, inlineObject24.groupId) &&
        Objects.equals(this.sensors, inlineObject24.sensors);
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

