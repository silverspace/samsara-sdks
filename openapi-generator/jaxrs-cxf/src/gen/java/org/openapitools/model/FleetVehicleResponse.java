package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.FleetVehicleResponseVehicleInfo;
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
  * A vehicle object as returned for fleet/vehicle
 **/
@ApiModel(description="A vehicle object as returned for fleet/vehicle")
public class FleetVehicleResponse  {
  
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")
  private Map<String, String> externalIds = null;

  @ApiModelProperty(example = "Heavy", value = "Harsh event detection setting.")
 /**
   * Harsh event detection setting.
  **/
  private String harshAccelSetting;

  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long id;

  @ApiModelProperty(example = "Truck A7", required = true, value = "Name of the vehicle.")
 /**
   * Name of the vehicle.
  **/
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private FleetVehicleResponseVehicleInfo vehicleInfo = null;
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

  public FleetVehicleResponse externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public FleetVehicleResponse putExternalIdsItem(String key, String externalIdsItem) {
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

 /**
   * Harsh event detection setting.
   * @return harshAccelSetting
  **/
  @JsonProperty("harshAccelSetting")
  public String getHarshAccelSetting() {
    return harshAccelSetting;
  }

  public void setHarshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  public FleetVehicleResponse harshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

 /**
   * ID of the vehicle.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FleetVehicleResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the vehicle.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetVehicleResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get vehicleInfo
   * @return vehicleInfo
  **/
  @JsonProperty("vehicleInfo")
  public FleetVehicleResponseVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }

  public void setVehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }

  public FleetVehicleResponse vehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleResponse {\n");
    
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    harshAccelSetting: ").append(toIndentedString(harshAccelSetting)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vehicleInfo: ").append(toIndentedString(vehicleInfo)).append("\n");
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

