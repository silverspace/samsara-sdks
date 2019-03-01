package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAddress;
import org.openapitools.model.TaggedAsset;
import org.openapitools.model.TaggedDriver;
import org.openapitools.model.TaggedMachine;
import org.openapitools.model.TaggedSensor;
import org.openapitools.model.TaggedVehicle;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tag
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class Tag   {
  @JsonProperty("addresses")
  @Valid
  private List<TaggedAddress> addresses = null;

  @JsonProperty("assets")
  @Valid
  private List<TaggedAsset> assets = null;

  @JsonProperty("drivers")
  @Valid
  private List<TaggedDriver> drivers = null;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("machines")
  @Valid
  private List<TaggedMachine> machines = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentTagId")
  private Long parentTagId;

  @JsonProperty("sensors")
  @Valid
  private List<TaggedSensor> sensors = null;

  @JsonProperty("vehicles")
  @Valid
  private List<TaggedVehicle> vehicles = null;

  public Tag addresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Tag addAddressesItem(TaggedAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * The addresses that belong to this tag.
   * @return addresses
  */
  @ApiModelProperty(value = "The addresses that belong to this tag.")

  @Valid

  public List<TaggedAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

  public Tag assets(List<TaggedAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Tag addAssetsItem(TaggedAsset assetsItem) {
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

  public List<TaggedAsset> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

  public Tag drivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public Tag addDriversItem(TaggedDriver driversItem) {
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

  public List<TaggedDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

  public Tag groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The GroupID that this tag belongs to.
   * @return groupId
  */
  @ApiModelProperty(example = "2348", value = "The GroupID that this tag belongs to.")


  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this tag.
   * @return id
  */
  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag machines(List<TaggedMachine> machines) {
    this.machines = machines;
    return this;
  }

  public Tag addMachinesItem(TaggedMachine machinesItem) {
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

  public List<TaggedMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of this tag.
   * @return name
  */
  @ApiModelProperty(example = "Broken Vehicles", required = true, value = "Name of this tag.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag parentTagId(Long parentTagId) {
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

  public Tag sensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
    return this;
  }

  public Tag addSensorsItem(TaggedSensor sensorsItem) {
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

  public List<TaggedSensor> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

  public Tag vehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Tag addVehiclesItem(TaggedVehicle vehiclesItem) {
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

  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicle> vehicles) {
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
    Tag tag = (Tag) o;
    return Objects.equals(this.addresses, tag.addresses) &&
        Objects.equals(this.assets, tag.assets) &&
        Objects.equals(this.drivers, tag.drivers) &&
        Objects.equals(this.groupId, tag.groupId) &&
        Objects.equals(this.id, tag.id) &&
        Objects.equals(this.machines, tag.machines) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.parentTagId, tag.parentTagId) &&
        Objects.equals(this.sensors, tag.sensors) &&
        Objects.equals(this.vehicles, tag.vehicles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, assets, drivers, groupId, id, machines, name, parentTagId, sensors, vehicles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

