package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoorResponseSensors;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the current door status of a sensor.
 */
@ApiModel(description = "Contains the current door status of a sensor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class DoorResponse   {
  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("sensors")
  @Valid
  private List<DoorResponseSensors> sensors = null;

  public DoorResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  @ApiModelProperty(example = "101", value = "")


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DoorResponse sensors(List<DoorResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public DoorResponse addSensorsItem(DoorResponseSensors sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * Get sensors
   * @return sensors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DoorResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<DoorResponseSensors> sensors) {
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
    DoorResponse doorResponse = (DoorResponse) o;
    return Objects.equals(this.groupId, doorResponse.groupId) &&
        Objects.equals(this.sensors, doorResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoorResponse {\n");
    
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

