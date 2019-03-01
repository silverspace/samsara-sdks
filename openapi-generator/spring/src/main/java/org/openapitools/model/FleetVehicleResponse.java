package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.FleetVehicleResponseVehicleInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A vehicle object as returned for fleet/vehicle
 */
@ApiModel(description = "A vehicle object as returned for fleet/vehicle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class FleetVehicleResponse   {
  @JsonProperty("externalIds")
  @Valid
  private Map<String, String> externalIds = null;

  @JsonProperty("harshAccelSetting")
  private String harshAccelSetting;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("vehicleInfo")
  private FleetVehicleResponseVehicleInfo vehicleInfo = null;

  public FleetVehicleResponse externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public FleetVehicleResponse putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

  /**
   * Get externalIds
   * @return externalIds
  */
  @ApiModelProperty(example = "{\"maintenanceId\":\"ABFS18600\"}", value = "")


  public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public FleetVehicleResponse harshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
    return this;
  }

  /**
   * Harsh event detection setting.
   * @return harshAccelSetting
  */
  @ApiModelProperty(example = "Heavy", value = "Harsh event detection setting.")


  public String getHarshAccelSetting() {
    return harshAccelSetting;
  }

  public void setHarshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

  public FleetVehicleResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the vehicle.
   * @return id
  */
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FleetVehicleResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the vehicle.
   * @return name
  */
  @ApiModelProperty(example = "Truck A7", required = true, value = "Name of the vehicle.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FleetVehicleResponse vehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
    return this;
  }

  /**
   * Get vehicleInfo
   * @return vehicleInfo
  */
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.externalIds, fleetVehicleResponse.externalIds) &&
        Objects.equals(this.harshAccelSetting, fleetVehicleResponse.harshAccelSetting) &&
        Objects.equals(this.id, fleetVehicleResponse.id) &&
        Objects.equals(this.name, fleetVehicleResponse.name) &&
        Objects.equals(this.vehicleInfo, fleetVehicleResponse.vehicleInfo);
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

