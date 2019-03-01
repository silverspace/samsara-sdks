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
 * Specify devices, etc. that should be removed from the tag.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TagModifyDelete   {
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

  public TagModifyDelete assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagModifyDelete addAssetsItem(TaggedAssetBase assetsItem) {
    if (assets == null) {
      assets = new ArrayList<>();
    }
    assets.add(assetsItem);
    return this;
  }

   /**
   * The assets to be removed from this tag.
   * @return assets
  **/
  @Valid
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagModifyDelete sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagModifyDelete addSensorsItem(TaggedSensorBase sensorsItem) {
    if (sensors == null) {
      sensors = new ArrayList<>();
    }
    sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors to be removed from this tag.
   * @return sensors
  **/
  @Valid
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagModifyDelete vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagModifyDelete addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (vehicles == null) {
      vehicles = new ArrayList<>();
    }
    vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles to be removed from this tag.
   * @return vehicles
  **/
  @Valid
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagModifyDelete machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagModifyDelete addMachinesItem(TaggedMachineBase machinesItem) {
    if (machines == null) {
      machines = new ArrayList<>();
    }
    machines.add(machinesItem);
    return this;
  }

   /**
   * The machines to be removed from this tag.
   * @return machines
  **/
  @Valid
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagModifyDelete drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagModifyDelete addDriversItem(TaggedDriverBase driversItem) {
    if (drivers == null) {
      drivers = new ArrayList<>();
    }
    drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers to be removed from this tag.
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

