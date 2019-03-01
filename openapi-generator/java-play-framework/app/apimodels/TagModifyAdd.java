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
 * Specify devices, etc. that should be added to the tag.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TagModifyAdd   {
  @JsonProperty("assets")
  private List<TaggedAssetBase> assets = null;

  @JsonProperty("sensors")
  private List<TaggedSensorBase> sensors = null;

  @JsonProperty("vehicles")
  private List<TaggedVehicleBase> vehicles = null;

  @JsonProperty("machines")
  private List<TaggedMachineBase> machines = null;

  @JsonProperty("drivers")
  private List<TaggedDriverBase> drivers = null;

  public TagModifyAdd assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagModifyAdd addAssetsItem(TaggedAssetBase assetsItem) {
    if (assets == null) {
      assets = new ArrayList<>();
    }
    assets.add(assetsItem);
    return this;
  }

   /**
   * The assets to be added to this tag.
   * @return assets
  **/
  @Valid
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagModifyAdd sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagModifyAdd addSensorsItem(TaggedSensorBase sensorsItem) {
    if (sensors == null) {
      sensors = new ArrayList<>();
    }
    sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors to be added to this tag.
   * @return sensors
  **/
  @Valid
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagModifyAdd vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagModifyAdd addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (vehicles == null) {
      vehicles = new ArrayList<>();
    }
    vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles to be added to this tag.
   * @return vehicles
  **/
  @Valid
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagModifyAdd machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagModifyAdd addMachinesItem(TaggedMachineBase machinesItem) {
    if (machines == null) {
      machines = new ArrayList<>();
    }
    machines.add(machinesItem);
    return this;
  }

   /**
   * The machines to be added to this tag.
   * @return machines
  **/
  @Valid
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagModifyAdd drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagModifyAdd addDriversItem(TaggedDriverBase driversItem) {
    if (drivers == null) {
      drivers = new ArrayList<>();
    }
    drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers to be added to this tag.
   * @return drivers
  **/
  @Valid
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagModifyAdd tagModifyAdd = (TagModifyAdd) o;
    return Objects.equals(assets, tagModifyAdd.assets) &&
        Objects.equals(sensors, tagModifyAdd.sensors) &&
        Objects.equals(vehicles, tagModifyAdd.vehicles) &&
        Objects.equals(machines, tagModifyAdd.machines) &&
        Objects.equals(drivers, tagModifyAdd.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, sensors, vehicles, machines, drivers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyAdd {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

