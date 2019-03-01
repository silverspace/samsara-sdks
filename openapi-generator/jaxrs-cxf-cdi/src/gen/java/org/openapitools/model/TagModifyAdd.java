package org.openapitools.model;

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
import javax.validation.constraints.*;

/**
 * Specify devices, etc. that should be added to the tag.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Specify devices, etc. that should be added to the tag.")

public class TagModifyAdd   {
  
  private List<TaggedAssetBase> assets = null;

  private List<TaggedSensorBase> sensors = null;

  private List<TaggedVehicleBase> vehicles = null;

  private List<TaggedMachineBase> machines = null;

  private List<TaggedDriverBase> drivers = null;


  /**
   * The assets to be added to this tag.
   **/
  public TagModifyAdd assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "The assets to be added to this tag.")
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagModifyAdd addAssetsItem(TaggedAssetBase assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<TaggedAssetBase>();
    }
    this.assets.add(assetsItem);
    return this;
  }


  /**
   * The sensors to be added to this tag.
   **/
  public TagModifyAdd sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "The sensors to be added to this tag.")
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagModifyAdd addSensorsItem(TaggedSensorBase sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<TaggedSensorBase>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }


  /**
   * The vehicles to be added to this tag.
   **/
  public TagModifyAdd vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "The vehicles to be added to this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagModifyAdd addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TaggedVehicleBase>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }


  /**
   * The machines to be added to this tag.
   **/
  public TagModifyAdd machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(value = "The machines to be added to this tag.")
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagModifyAdd addMachinesItem(TaggedMachineBase machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<TaggedMachineBase>();
    }
    this.machines.add(machinesItem);
    return this;
  }


  /**
   * The drivers to be added to this tag.
   **/
  public TagModifyAdd drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "The drivers to be added to this tag.")
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagModifyAdd addDriversItem(TaggedDriverBase driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<TaggedDriverBase>();
    }
    this.drivers.add(driversItem);
    return this;
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

