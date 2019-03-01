package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.FleetVehicleResponseVehicleInfo;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A vehicle object as returned for fleet/vehicle")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class FleetVehicleResponse   {
  
  private Map<String, String> externalIds = new HashMap<String, String>();
  private String harshAccelSetting = null;
  private Long id = null;
  private String name = null;
  private FleetVehicleResponseVehicleInfo vehicleInfo = null;

  /**
   **/
  
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  /**
   * Harsh event detection setting.
   **/
  
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

