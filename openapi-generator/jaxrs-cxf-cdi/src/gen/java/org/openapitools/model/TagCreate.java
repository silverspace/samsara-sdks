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


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class TagCreate   {
  
  private List<TaggedAssetBase> assets = null;

  private List<TaggedDriverBase> drivers = null;

  private List<TaggedMachineBase> machines = null;

  private String name;

  private Long parentTagId;

  private List<TaggedSensorBase> sensors = null;

  private List<TaggedVehicleBase> vehicles = null;


  /**
   * The assets that belong to this tag.
   **/
  public TagCreate assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "The assets that belong to this tag.")
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagCreate addAssetsItem(TaggedAssetBase assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<TaggedAssetBase>();
    }
    this.assets.add(assetsItem);
    return this;
  }


  /**
   * The drivers that belong to this tag.
   **/
  public TagCreate drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "The drivers that belong to this tag.")
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagCreate addDriversItem(TaggedDriverBase driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<TaggedDriverBase>();
    }
    this.drivers.add(driversItem);
    return this;
  }


  /**
   * The machines that belong to this tag.
   **/
  public TagCreate machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(value = "The machines that belong to this tag.")
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagCreate addMachinesItem(TaggedMachineBase machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<TaggedMachineBase>();
    }
    this.machines.add(machinesItem);
    return this;
  }


  /**
   * Name of this tag.
   **/
  public TagCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Broken Vehicles", required = true, value = "Name of this tag.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
   **/
  public TagCreate parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

  
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")
  @JsonProperty("parentTagId")
  public Long getParentTagId() {
    return parentTagId;
  }
  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }


  /**
   * The sensors that belong to this tag.
   **/
  public TagCreate sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "The sensors that belong to this tag.")
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagCreate addSensorsItem(TaggedSensorBase sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<TaggedSensorBase>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }


  /**
   * The vehicles that belong to this tag.
   **/
  public TagCreate vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  public TagCreate addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TaggedVehicleBase>();
    }
    this.vehicles.add(vehiclesItem);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

