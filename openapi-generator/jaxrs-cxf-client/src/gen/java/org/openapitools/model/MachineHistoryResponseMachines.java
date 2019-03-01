package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MachineHistoryResponseVibrations;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MachineHistoryResponseMachines  {
  
  @ApiModelProperty(example = "1/3 HP Motor", value = "Machine name")
 /**
   * Machine name
  **/
  private String name;

  @ApiModelProperty(example = "1", value = "Machine ID")
 /**
   * Machine ID
  **/
  private Integer id;

  @ApiModelProperty(value = "List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s")
 /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
  **/
  private List<MachineHistoryResponseVibrations> vibrations = null;
 /**
   * Machine name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MachineHistoryResponseMachines name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Machine ID
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MachineHistoryResponseMachines id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   * @return vibrations
  **/
  @JsonProperty("vibrations")
  public List<MachineHistoryResponseVibrations> getVibrations() {
    return vibrations;
  }

  public void setVibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
  }

  public MachineHistoryResponseMachines vibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
    return this;
  }

  public MachineHistoryResponseMachines addVibrationsItem(MachineHistoryResponseVibrations vibrationsItem) {
    this.vibrations.add(vibrationsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponseMachines {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vibrations: ").append(toIndentedString(vibrations)).append("\n");
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

