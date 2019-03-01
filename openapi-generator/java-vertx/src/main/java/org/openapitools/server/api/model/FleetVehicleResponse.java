package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.api.model.FleetVehicleResponseVehicleInfo;

/**
 * A vehicle object as returned for fleet/vehicle
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class FleetVehicleResponse   {
  
  private Map<String, String> externalIds = new HashMap<>();
  private String harshAccelSetting;
  private Long id;
  private String name;
  private FleetVehicleResponseVehicleInfo vehicleInfo = null;

  public FleetVehicleResponse () {

  }

  public FleetVehicleResponse (Map<String, String> externalIds, String harshAccelSetting, Long id, String name, FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.externalIds = externalIds;
    this.harshAccelSetting = harshAccelSetting;
    this.id = id;
    this.name = name;
    this.vehicleInfo = vehicleInfo;
  }

    
  @JsonProperty("externalIds")
  public Map<String, String> getExternalIds() {
    return externalIds;
  }
  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

    
  @JsonProperty("harshAccelSetting")
  public String getHarshAccelSetting() {
    return harshAccelSetting;
  }
  public void setHarshAccelSetting(String harshAccelSetting) {
    this.harshAccelSetting = harshAccelSetting;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("vehicleInfo")
  public FleetVehicleResponseVehicleInfo getVehicleInfo() {
    return vehicleInfo;
  }
  public void setVehicleInfo(FleetVehicleResponseVehicleInfo vehicleInfo) {
    this.vehicleInfo = vehicleInfo;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
