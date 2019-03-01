package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.TaggedAssetBase;
import org.openapitools.server.api.model.TaggedDriverBase;
import org.openapitools.server.api.model.TaggedMachineBase;
import org.openapitools.server.api.model.TaggedSensorBase;
import org.openapitools.server.api.model.TaggedVehicleBase;

/**
 * Specify devices, etc. that should be removed from the tag.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TagModifyDelete   {
  
  private List<TaggedAssetBase> assets = new ArrayList<>();
  private List<TaggedSensorBase> sensors = new ArrayList<>();
  private List<TaggedVehicleBase> vehicles = new ArrayList<>();
  private List<TaggedMachineBase> machines = new ArrayList<>();
  private List<TaggedDriverBase> drivers = new ArrayList<>();

  public TagModifyDelete () {

  }

  public TagModifyDelete (List<TaggedAssetBase> assets, List<TaggedSensorBase> sensors, List<TaggedVehicleBase> vehicles, List<TaggedMachineBase> machines, List<TaggedDriverBase> drivers) {
    this.assets = assets;
    this.sensors = sensors;
    this.vehicles = vehicles;
    this.machines = machines;
    this.drivers = drivers;
  }

    
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

    
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

    
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

    
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

    
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagModifyDelete tagModifyDelete = (TagModifyDelete) o;
    return Objects.equals(assets, tagModifyDelete.assets) &&
        Objects.equals(sensors, tagModifyDelete.sensors) &&
        Objects.equals(vehicles, tagModifyDelete.vehicles) &&
        Objects.equals(machines, tagModifyDelete.machines) &&
        Objects.equals(drivers, tagModifyDelete.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, sensors, vehicles, machines, drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyDelete {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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
