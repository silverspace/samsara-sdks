package io.swagger.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data  {
  
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")
  private Map<String, String> externalIds = null;

  @ApiModelProperty(value = "Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic")
 /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
  **/
  private Integer harshAccelSetting = null;

  @ApiModelProperty(value = "Name")
 /**
   * Name
  **/
  private String name = null;
 /**
   * Get externalIds
   * @return externalIds
  **/
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public Data externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Data putExternalIdsItem(String key, String externalIdsItem) {
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

 /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
   * @return harshAccelSetting
  **/
  @JsonProperty("harsh_accel_setting")
  public Integer getHarshAccelSetting() {
    return harshAccelSetting;
  }

  public void setHarshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  public Data harshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

 /**
   * Name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Data name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    harshAccelSetting: ").append(toIndentedString(harshAccelSetting)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

