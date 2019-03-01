package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoorResponseSensors;

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
  * Contains the current door status of a sensor.
 **/
@ApiModel(description="Contains the current door status of a sensor.")
public class DoorResponse  {
  
  @ApiModelProperty(example = "101", value = "")
  private Long groupId;

  @ApiModelProperty(value = "")
  private List<DoorResponseSensors> sensors = null;
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

  public DoorResponse groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * Get sensors
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<DoorResponseSensors> getSensors() {
    return sensors;
  }

  public void setSensors(List<DoorResponseSensors> sensors) {
    this.sensors = sensors;
  }

  public DoorResponse sensors(List<DoorResponseSensors> sensors) {
    this.sensors = sensors;
    return this;
  }

  public DoorResponse addSensorsItem(DoorResponseSensors sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

