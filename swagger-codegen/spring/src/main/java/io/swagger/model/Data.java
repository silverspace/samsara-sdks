package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class Data   {
  @JsonProperty("externalIds")
  @Valid
  private Map<String, String> externalIds = null;

  @JsonProperty("harsh_accel_setting")
  private Integer harshAccelSetting = null;

  @JsonProperty("name")
  private String name = null;

  public Data externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public Data putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<String, String>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

  /**
   * Get externalIds
   * @return externalIds
  **/
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")


  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public Data harshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

  /**
   * Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
   * @return harshAccelSetting
  **/
  @ApiModelProperty(value = "Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic")


  public Integer getHarshAccelSetting() {
    return harshAccelSetting;
  }

  public void setHarshAccelSetting(Integer harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  public Data name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")


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
    Data data = (Data) o;
    return Objects.equals(this.externalIds, data.externalIds) &&
        Objects.equals(this.harshAccelSetting, data.harshAccelSetting) &&
        Objects.equals(this.name, data.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, harshAccelSetting, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

