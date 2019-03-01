package apimodels;

import apimodels.FleetVehicleResponseVehicleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A vehicle object as returned for fleet/vehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FleetVehicleResponse   {
  @JsonProperty("externalIds")
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

