package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CargoResponseSensors;
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

/**
  * Contains the current cargo status of a sensor.
 **/
@ApiModel(description="Contains the current cargo status of a sensor.")
public class CargoResponse  {
  
  @ApiModelProperty(example = "101", value = "")
  private Long groupId;

  @ApiModelProperty(value = "")
  @Valid
  private List<CargoResponseSensors> sensors = null;
 /**
   * Get groupId
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public CargoResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get sensors
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<CargoResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<CargoResponseSensors> sensors) {
    this.sensors = sensors;
  }

  public CargoResponse sensors(List<CargoResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public CargoResponse addSensorsItem(CargoResponseSensors sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CargoResponse {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
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

