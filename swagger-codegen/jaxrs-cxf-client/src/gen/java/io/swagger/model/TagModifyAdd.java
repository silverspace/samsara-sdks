package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.TaggedAssetBase;
import io.swagger.model.TaggedDriverBase;
import io.swagger.model.TaggedMachineBase;
import io.swagger.model.TaggedSensorBase;
import io.swagger.model.TaggedVehicleBase;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Specify devices, etc. that should be added to the tag.
 **/
@ApiModel(description="Specify devices, etc. that should be added to the tag.")
public class TagModifyAdd  {
  
  @ApiModelProperty(value = "The assets to be added to this tag.")
 /**
   * The assets to be added to this tag.
  **/
  private List<TaggedAssetBase> assets = null;

  @ApiModelProperty(value = "The drivers to be added to this tag.")
 /**
   * The drivers to be added to this tag.
  **/
  private List<TaggedDriverBase> drivers = null;

  @ApiModelProperty(value = "The machines to be added to this tag.")
 /**
   * The machines to be added to this tag.
  **/
  private List<TaggedMachineBase> machines = null;

  @ApiModelProperty(value = "The sensors to be added to this tag.")
 /**
   * The sensors to be added to this tag.
  **/
  private List<TaggedSensorBase> sensors = null;

  @ApiModelProperty(value = "The vehicles to be added to this tag.")
 /**
   * The vehicles to be added to this tag.
  **/
  private List<TaggedVehicleBase> vehicles = null;
 /**
   * The assets to be added to this tag.
   * @return assets
  **/
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagModifyAdd assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagModifyAdd addAssetsItem(TaggedAssetBase assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * The drivers to be added to this tag.
   * @return drivers
  **/
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagModifyAdd drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagModifyAdd addDriversItem(TaggedDriverBase driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

 /**
   * The machines to be added to this tag.
   * @return machines
  **/
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagModifyAdd machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagModifyAdd addMachinesItem(TaggedMachineBase machinesItem) {
    this.machines.add(machinesItem);
    return this;
  }

 /**
   * The sensors to be added to this tag.
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagModifyAdd sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagModifyAdd addSensorsItem(TaggedSensorBase sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }

 /**
   * The vehicles to be added to this tag.
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagModifyAdd vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagModifyAdd addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyAdd {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

