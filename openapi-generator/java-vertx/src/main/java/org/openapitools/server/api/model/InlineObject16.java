package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineObject16   {
  
  private Map<String, String> externalIds = new HashMap<>();
  private Integer harshAccelSetting;
  private String name;

  public InlineObject16 () {

  }

  public InlineObject16 (Map<String, String> externalIds, Integer harshAccelSetting, String name) {
    this.externalIds = externalIds;
    this.harshAccelSetting = harshAccelSetting;
    this.name = name;
  }

    
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

    
  @JsonProperty("harsh_accel_setting")
  public Integer getHarshAccelSetting() {
    return harshAccelSetting;
  }
  public void setHarshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
