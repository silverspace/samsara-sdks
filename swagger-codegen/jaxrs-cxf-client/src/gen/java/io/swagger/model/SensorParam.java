package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorParam  {
  
  @ApiModelProperty(example = "101", required = true, value = "Group ID to query.")
 /**
   * Group ID to query.
  **/
  private Long groupId = null;

  @ApiModelProperty(example = "[122]", required = true, value = "List of sensor IDs to query.")
 /**
   * List of sensor IDs to query.
  **/
  private List<Long> sensors = new ArrayList<Long>();
 /**
   * Group ID to query.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public SensorParam groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * List of sensor IDs to query.
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<Long> getSensors() {
    return sensors;
  }

  public void setSensors(List<Long> sensors) {
    this.sensors = sensors;
  }

  public SensorParam sensors(List<Long> sensors) {
    this.sensors = sensors;
    return this;
  }

  public SensorParam addSensorsItem(Long sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensorParam {\n");
    
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

