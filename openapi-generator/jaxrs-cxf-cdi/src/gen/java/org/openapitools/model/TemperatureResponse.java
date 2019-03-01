package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TemperatureResponseSensors;
import javax.validation.constraints.*;

/**
 * Contains the current temperatures of a sensor.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Contains the current temperatures of a sensor.")

public class TemperatureResponse   {
  
  private Long groupId;

  private List<TemperatureResponseSensors> sensors = null;


  /**
   **/
  public TemperatureResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "101", value = "")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  /**
   **/
  public TemperatureResponse sensors(List<TemperatureResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sensors")
  public List<TemperatureResponseSensors> getSensors() {
    return sensors;
  }
  public void setSensors(List<TemperatureResponseSensors> sensors) {
    this.sensors = sensors;
  }

  public TemperatureResponse addSensorsItem(TemperatureResponseSensors sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<TemperatureResponseSensors>();
    }
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
    TemperatureResponse temperatureResponse = (TemperatureResponse) o;
    return Objects.equals(groupId, temperatureResponse.groupId) &&
        Objects.equals(sensors, temperatureResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureResponse {\n");
    
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

