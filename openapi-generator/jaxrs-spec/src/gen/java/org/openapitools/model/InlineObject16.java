package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class InlineObject16   {
  
  private @Valid Map<String, String> externalIds = new HashMap<String, String>();
  private @Valid Integer harshAccelSetting;
  private @Valid String name;

  /**
   **/
  public InlineObject16 externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
   **/
  public InlineObject16 harshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

  
  @ApiModelProperty(value = "Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic")
  @JsonProperty("harsh_accel_setting")
  public Integer getHarshAccelSetting() {
    return harshAccelSetting;
  }
  public void setHarshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  /**
   * Name
   **/
  public InlineObject16 name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject16 inlineObject16 = (InlineObject16) o;
    return Objects.equals(externalIds, inlineObject16.externalIds) &&
        Objects.equals(harshAccelSetting, inlineObject16.harshAccelSetting) &&
        Objects.equals(name, inlineObject16.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, harshAccelSetting, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject16 {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

