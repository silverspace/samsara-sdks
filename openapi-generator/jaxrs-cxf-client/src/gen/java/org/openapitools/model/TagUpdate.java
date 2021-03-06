package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAssetBase;
import org.openapitools.model.TaggedDriverBase;
import org.openapitools.model.TaggedMachineBase;
import org.openapitools.model.TaggedSensorBase;
import org.openapitools.model.TaggedVehicleBase;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TagUpdate  {
  
  @ApiModelProperty(value = "The assets that belong to this tag.")
 /**
   * The assets that belong to this tag.
  **/
  private List<TaggedAssetBase> assets = null;

  @ApiModelProperty(value = "The drivers that belong to this tag.")
 /**
   * The drivers that belong to this tag.
  **/
  private List<TaggedDriverBase> drivers = null;

  @ApiModelProperty(value = "The machines that belong to this tag.")
 /**
   * The machines that belong to this tag.
  **/
  private List<TaggedMachineBase> machines = null;

  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")
 /**
   * Updated name of this tag.
  **/
  private String name;

  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
 /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
  **/
  private Long parentTagId;

  @ApiModelProperty(value = "The sensors that belong to this tag.")
 /**
   * The sensors that belong to this tag.
  **/
  private List<TaggedSensorBase> sensors = null;

  @ApiModelProperty(value = "The vehicles that belong to this tag.")
 /**
   * The vehicles that belong to this tag.
  **/
  private List<TaggedVehicleBase> vehicles = null;
 /**
   * The assets that belong to this tag.
   * @return assets
  **/
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagUpdate assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagUpdate addAssetsItem(TaggedAssetBase assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * The drivers that belong to this tag.
   * @return drivers
  **/
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagUpdate drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagUpdate addDriversItem(TaggedDriverBase driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

 /**
   * The machines that belong to this tag.
   * @return machines
  **/
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagUpdate machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagUpdate addMachinesItem(TaggedMachineBase machinesItem) {
    this.machines.add(machinesItem);
    return this;
  }

 /**
   * Updated name of this tag.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
   * @return parentTagId
  **/
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public TagUpdate parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

 /**
   * The sensors that belong to this tag.
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagUpdate sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagUpdate addSensorsItem(TaggedSensorBase sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }

 /**
   * The vehicles that belong to this tag.
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagUpdate vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagUpdate addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagUpdate {\n");
    
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

