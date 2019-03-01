package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.TaggedAssetBase;
import com.prokarma.pkmst.model.TaggedDriverBase;
import com.prokarma.pkmst.model.TaggedMachineBase;
import com.prokarma.pkmst.model.TaggedSensorBase;
import com.prokarma.pkmst.model.TaggedVehicleBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Specify devices, etc. that should be added to the tag.
 */
@ApiModel(description = "Specify devices, etc. that should be added to the tag.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

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
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * The assets to be added to this tag.
   * @return assets
  **/
  @ApiModelProperty(value = "The assets to be added to this tag.")
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
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

   /**
   * The sensors to be added to this tag.
   * @return sensors
  **/
  @ApiModelProperty(value = "The sensors to be added to this tag.")
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
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

   /**
   * The vehicles to be added to this tag.
   * @return vehicles
  **/
  @ApiModelProperty(value = "The vehicles to be added to this tag.")
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
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

   /**
   * The machines to be added to this tag.
   * @return machines
  **/
  @ApiModelProperty(value = "The machines to be added to this tag.")
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
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * The drivers to be added to this tag.
   * @return drivers
  **/
  @ApiModelProperty(value = "The drivers to be added to this tag.")
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
    return Objects.equals(this.assets, tagModifyAdd.assets) &&
        Objects.equals(this.sensors, tagModifyAdd.sensors) &&
        Objects.equals(this.vehicles, tagModifyAdd.vehicles) &&
        Objects.equals(this.machines, tagModifyAdd.machines) &&
        Objects.equals(this.drivers, tagModifyAdd.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, sensors, vehicles, machines, drivers);
  }

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

