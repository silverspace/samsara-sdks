package apimodels;

import apimodels.TaggedAssetBase;
import apimodels.TaggedDriverBase;
import apimodels.TaggedMachineBase;
import apimodels.TaggedSensorBase;
import apimodels.TaggedVehicleBase;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TagCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TagCreate   {
  @JsonProperty("assets")
  private List<TaggedAssetBase> assets = null;

  @JsonProperty("drivers")
  private List<TaggedDriverBase> drivers = null;

  @JsonProperty("machines")
  private List<TaggedMachineBase> machines = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentTagId")
  private Long parentTagId;

  @JsonProperty("sensors")
  private List<TaggedSensorBase> sensors = null;

  @JsonProperty("vehicles")
  private List<TaggedVehicleBase> vehicles = null;

  public TagCreate assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagCreate addAssetsItem(TaggedAssetBase assetsItem) {
    if (assets == null) {
      assets = new ArrayList<>();
    }
    assets.add(assetsItem);
    return this;
  }

   /**
   * The assets that belong to this tag.
   * @return assets
  **/
  @Valid
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagCreate drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagCreate addDriversItem(TaggedDriverBase driversItem) {
    if (drivers == null) {
      drivers = new ArrayList<>();
    }
    drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers that belong to this tag.
   * @return drivers
  **/
  @Valid
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagCreate machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagCreate addMachinesItem(TaggedMachineBase machinesItem) {
    if (machines == null) {
      machines = new ArrayList<>();
    }
    machines.add(machinesItem);
    return this;
  }

   /**
   * The machines that belong to this tag.
   * @return machines
  **/
  @Valid
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of this tag.
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagCreate parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

   /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   * @return parentTagId
  **/
    public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public TagCreate sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagCreate addSensorsItem(TaggedSensorBase sensorsItem) {
    if (sensors == null) {
      sensors = new ArrayList<>();
    }
    sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors that belong to this tag.
   * @return sensors
  **/
  @Valid
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagCreate vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagCreate addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (vehicles == null) {
      vehicles = new ArrayList<>();
    }
    vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles that belong to this tag.
   * @return vehicles
  **/
  @Valid
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

