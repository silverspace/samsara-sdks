package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TaggedAssetBase;
import io.swagger.model.TaggedDriverBase;
import io.swagger.model.TaggedMachineBase;
import io.swagger.model.TaggedSensorBase;
import io.swagger.model.TaggedVehicleBase;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TagCreate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class TagCreate   {
  @JsonProperty("assets")
  @Valid
  private List<TaggedAssetBase> assets = null;

  @JsonProperty("drivers")
  @Valid
  private List<TaggedDriverBase> drivers = null;

  @JsonProperty("machines")
  @Valid
  private List<TaggedMachineBase> machines = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentTagId")
  private Long parentTagId = null;

  @JsonProperty("sensors")
  @Valid
  private List<TaggedSensorBase> sensors = null;

  @JsonProperty("vehicles")
  @Valid
  private List<TaggedVehicleBase> vehicles = null;

  public TagCreate assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagCreate addAssetsItem(TaggedAssetBase assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<TaggedAssetBase>();
    }
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * The assets that belong to this tag.
   * @return assets
  **/
  @ApiModelProperty(value = "The assets that belong to this tag.")

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
    if (this.drivers == null) {
      this.drivers = new ArrayList<TaggedDriverBase>();
    }
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * The drivers that belong to this tag.
   * @return drivers
  **/
  @ApiModelProperty(value = "The drivers that belong to this tag.")

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
    if (this.machines == null) {
      this.machines = new ArrayList<TaggedMachineBase>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * The machines that belong to this tag.
   * @return machines
  **/
  @ApiModelProperty(value = "The machines that belong to this tag.")

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
  @ApiModelProperty(example = "Broken Vehicles", required = true, value = "Name of this tag.")
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
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")


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
    if (this.sensors == null) {
      this.sensors = new ArrayList<TaggedSensorBase>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * The sensors that belong to this tag.
   * @return sensors
  **/
  @ApiModelProperty(value = "The sensors that belong to this tag.")

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
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<TaggedVehicleBase>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * The vehicles that belong to this tag.
   * @return vehicles
  **/
  @ApiModelProperty(value = "The vehicles that belong to this tag.")

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
    return Objects.equals(this.assets, tagCreate.assets) &&
        Objects.equals(this.drivers, tagCreate.drivers) &&
        Objects.equals(this.machines, tagCreate.machines) &&
        Objects.equals(this.name, tagCreate.name) &&
        Objects.equals(this.parentTagId, tagCreate.parentTagId) &&
        Objects.equals(this.sensors, tagCreate.sensors) &&
        Objects.equals(this.vehicles, tagCreate.vehicles);
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

