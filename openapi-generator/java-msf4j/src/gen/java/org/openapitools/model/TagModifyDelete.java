package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAssetBase;
import org.openapitools.model.TaggedDriverBase;
import org.openapitools.model.TaggedMachineBase;
import org.openapitools.model.TaggedSensorBase;
import org.openapitools.model.TaggedVehicleBase;

/**
 * Specify devices, etc. that should be removed from the tag.
 */
@ApiModel(description = "Specify devices, etc. that should be removed from the tag.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
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
    if (this.assets == null) {
      this.assets = new ArrayList<TaggedAssetBase>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * The assets to be removed from this tag.
   * @return assets
  **/
  @ApiModelProperty(value = "The assets to be removed from this tag.")
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
    if (this.sensors == null) {
      this.sensors = new ArrayList<TaggedSensorBase>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors to be removed from this tag.
   * @return sensors
  **/
  @ApiModelProperty(value = "The sensors to be removed from this tag.")
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
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TaggedVehicleBase>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles to be removed from this tag.
   * @return vehicles
  **/
  @ApiModelProperty(value = "The vehicles to be removed from this tag.")
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
    if (this.machines == null) {
      this.machines = new ArrayList<TaggedMachineBase>();
    }
    this.machines.add(machinesItem);
    return this;
  }

   /**
   * The machines to be removed from this tag.
   * @return machines
  **/
  @ApiModelProperty(value = "The machines to be removed from this tag.")
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
    if (this.drivers == null) {
      this.drivers = new ArrayList<TaggedDriverBase>();
    }
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers to be removed from this tag.
   * @return drivers
  **/
  @ApiModelProperty(value = "The drivers to be removed from this tag.")
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
    return Objects.equals(this.assets, tagModifyDelete.assets) &&
        Objects.equals(this.sensors, tagModifyDelete.sensors) &&
        Objects.equals(this.vehicles, tagModifyDelete.vehicles) &&
        Objects.equals(this.machines, tagModifyDelete.machines) &&
        Objects.equals(this.drivers, tagModifyDelete.drivers);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

