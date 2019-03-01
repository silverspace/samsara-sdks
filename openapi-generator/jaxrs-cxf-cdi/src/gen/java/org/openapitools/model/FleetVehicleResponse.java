package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.FleetVehicleResponseVehicleInfo;
import javax.validation.constraints.*;

/**
 * A vehicle object as returned for fleet/vehicle
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "A vehicle object as returned for fleet/vehicle")

public class FleetVehicleResponse   {
  
  private Map<String, String> externalIds = null;

  private String harshAccelSetting;

  private Long id;

  private String name;

  private FleetVehicleResponseVehicleInfo vehicleInfo = null;


  /**
   **/
  public FleetVehicleResponse externalIds(Map<String, String> externalIds) {
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


  public FleetVehicleResponse putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<String, String>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

  /**
   * Harsh event detection setting.
   **/
  public FleetVehicleResponse harshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

  
  @ApiModelProperty(example = "Heavy", value = "Harsh event detection setting.")
  @JsonProperty("harshAccelSetting")
  public String getHarshAccelSetting() {
    return harshAccelSetting;
  }
  public void setHarshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }


  /**
   * ID of the vehicle.
   **/
  public FleetVehicleResponse id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Name of the vehicle.
   **/
  public FleetVehicleResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Truck A7", required = true, value = "Name of the vehicle.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public FleetVehicleResponse vehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("vehicleInfo")
  public FleetVehicleResponseVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }
  public void setVehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleResponse fleetVehicleResponse = (FleetVehicleResponse) o;
    return Objects.equals(externalIds, fleetVehicleResponse.externalIds) &&
        Objects.equals(harshAccelSetting, fleetVehicleResponse.harshAccelSetting) &&
        Objects.equals(id, fleetVehicleResponse.id) &&
        Objects.equals(name, fleetVehicleResponse.name) &&
        Objects.equals(vehicleInfo, fleetVehicleResponse.vehicleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalIds, harshAccelSetting, id, name, vehicleInfo);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

