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

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TagCreate   {
  
  private List<TaggedAssetBase> assets = new ArrayList<>();
  private List<TaggedDriverBase> drivers = new ArrayList<>();
  private List<TaggedMachineBase> machines = new ArrayList<>();
  private String name;
  private Long parentTagId;
  private List<TaggedSensorBase> sensors = new ArrayList<>();
  private List<TaggedVehicleBase> vehicles = new ArrayList<>();

  public TagCreate () {

  }

  public TagCreate (List<TaggedAssetBase> assets, List<TaggedDriverBase> drivers, List<TaggedMachineBase> machines, String name, Long parentTagId, List<TaggedSensorBase> sensors, List<TaggedVehicleBase> vehicles) {
    this.assets = assets;
    this.drivers = drivers;
    this.machines = machines;
    this.name = name;
    this.parentTagId = parentTagId;
    this.sensors = sensors;
    this.vehicles = vehicles;
  }

    
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

    
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

    
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagCreate tagCreate = (TagCreate) o;
    return Objects.equals(assets, tagCreate.assets) &&
        Objects.equals(drivers, tagCreate.drivers) &&
        Objects.equals(machines, tagCreate.machines) &&
        Objects.equals(name, tagCreate.name) &&
        Objects.equals(parentTagId, tagCreate.parentTagId) &&
        Objects.equals(sensors, tagCreate.sensors) &&
        Objects.equals(vehicles, tagCreate.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, drivers, machines, name, parentTagId, sensors, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagCreate {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTagId: ").append(toIndentedString(parentTagId)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
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
