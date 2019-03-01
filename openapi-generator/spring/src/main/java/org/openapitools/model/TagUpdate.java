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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TagUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class TagUpdate   {
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
  private String name;

  @JsonProperty("parentTagId")
  private Long parentTagId;

  @JsonProperty("sensors")
  @Valid
  private List<TaggedSensorBase> sensors = null;

  @JsonProperty("vehicles")
  @Valid
  private List<TaggedVehicleBase> vehicles = null;

  public TagUpdate assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  public TagUpdate addAssetsItem(TaggedAssetBase assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

  /**
   * The assets that belong to this tag.
   * @return assets
  */
  @ApiModelProperty(value = "The assets that belong to this tag.")

  @Valid

  public List<TaggedAssetBase> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  public TagUpdate drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  public TagUpdate addDriversItem(TaggedDriverBase driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<>();
    }
    this.drivers.add(driversItem);
    return this;
  }

  /**
   * The drivers that belong to this tag.
   * @return drivers
  */
  @ApiModelProperty(value = "The drivers that belong to this tag.")

  @Valid

  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }

  public TagUpdate machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  public TagUpdate addMachinesItem(TaggedMachineBase machinesItem) {
    if (this.machines == null) {
      this.machines = new ArrayList<>();
    }
    this.machines.add(machinesItem);
    return this;
  }

  /**
   * The machines that belong to this tag.
   * @return machines
  */
  @ApiModelProperty(value = "The machines that belong to this tag.")

  @Valid

  public List<TaggedMachineBase> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  public TagUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Updated name of this tag.
   * @return name
  */
  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TagUpdate parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   * @return parentTagId
  */
  @ApiModelProperty(example = "8389", value = "If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.")


  public Long getParentTagId() {
    return parentTagId;
  }

  public void setParentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
  }

  public TagUpdate sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  public TagUpdate addSensorsItem(TaggedSensorBase sensorsItem) {
    if (this.sensors == null) {
      this.sensors = new ArrayList<>();
    }
    this.sensors.add(sensorsItem);
    return this;
  }

  /**
   * The sensors that belong to this tag.
   * @return sensors
  */
  @ApiModelProperty(value = "The sensors that belong to this tag.")

  @Valid

  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  public TagUpdate vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public TagUpdate addVehiclesItem(TaggedVehicleBase vehiclesItem) {
    if (this.vehicles == null) {
      this.vehicles = new ArrayList<>();
    }
    this.vehicles.add(vehiclesItem);
    return this;
  }

  /**
   * The vehicles that belong to this tag.
   * @return vehicles
  */
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
    TagUpdate tagUpdate = (TagUpdate) o;
    return Objects.equals(this.assets, tagUpdate.assets) &&
        Objects.equals(this.drivers, tagUpdate.drivers) &&
        Objects.equals(this.machines, tagUpdate.machines) &&
        Objects.equals(this.name, tagUpdate.name) &&
        Objects.equals(this.parentTagId, tagUpdate.parentTagId) &&
        Objects.equals(this.sensors, tagUpdate.sensors) &&
        Objects.equals(this.vehicles, tagUpdate.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, drivers, machines, name, parentTagId, sensors, vehicles);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

