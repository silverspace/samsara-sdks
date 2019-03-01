package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.HumidityResponseSensors;
import javax.validation.constraints.*;

/**
 * Contains the current humidity of a sensor.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Contains the current humidity of a sensor.")

public class HumidityResponse   {
  
  private Long groupId;

  private List<HumidityResponseSensors> sensors = null;


  /**
   **/
  public HumidityResponse groupId(Long groupId) {
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
  public HumidityResponse sensors(List<HumidityResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sensors")
  public List<HumidityResponseSensors> getSensors() {
    return sensors;
  }
  public void setSensors(List<HumidityResponseSensors> sensors) {
    this.sensors = sensors;
  }

  public HumidityResponse addSensorsItem(HumidityResponseSensors sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<HumidityResponseSensors>();
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
    HumidityResponse humidityResponse = (HumidityResponse) o;
    return Objects.equals(groupId, humidityResponse.groupId) &&
        Objects.equals(sensors, humidityResponse.sensors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, sensors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumidityResponse {\n");
    
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

