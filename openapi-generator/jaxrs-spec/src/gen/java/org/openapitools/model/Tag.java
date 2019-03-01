package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class Tag   {
  
  private @Valid List<TaggedAddress> addresses = new ArrayList<TaggedAddress>();
  private @Valid List<TaggedAsset> assets = new ArrayList<TaggedAsset>();
  private @Valid List<TaggedDriver> drivers = new ArrayList<TaggedDriver>();
  private @Valid Long groupId;
  private @Valid Long id;
  private @Valid List<TaggedMachine> machines = new ArrayList<TaggedMachine>();
  private @Valid String name;
  private @Valid Long parentTagId;
  private @Valid List<TaggedSensor> sensors = new ArrayList<TaggedSensor>();
  private @Valid List<TaggedVehicle> vehicles = new ArrayList<TaggedVehicle>();

  /**
   * The addresses that belong to this tag.
   **/
  public Tag addresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(value = "The addresses that belong to this tag.")
  @JsonProperty("addresses")
  public List<TaggedAddress> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * The assets that belong to this tag.
   **/
  public Tag assets(List<TaggedAsset> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "The assets that belong to this tag.")
  @JsonProperty("assets")
  public List<TaggedAsset> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

  /**
   * The drivers that belong to this tag.
   **/
  public Tag drivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "The drivers that belong to this tag.")
  @JsonProperty("drivers")
  public List<TaggedDriver> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

  /**
   * The GroupID that this tag belongs to.
   **/
  public Tag groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

  
  @ApiModelProperty(example = "2348", value = "The GroupID that this tag belongs to.")
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }
  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  /**
   * The ID of this tag.
   **/
  public Tag id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * The machines that belong to this tag.
   **/
  public Tag machines(List<TaggedMachine> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(value = "The machines that belong to this tag.")
  @JsonProperty("machines")
  public List<TaggedMachine> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

  /**
   * Name of this tag.
   **/
  public Tag name(String name) {
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
  public Tag parentTagId(Long parentTagId) {
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
  public Tag sensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "The sensors that belong to this tag.")
  @JsonProperty("sensors")
  public List<TaggedSensor> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles that belong to this tag.
   **/
  public Tag vehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  @JsonProperty("vehicles")
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
    return Objects.equals(addresses, tag.addresses) &&
        Objects.equals(assets, tag.assets) &&
        Objects.equals(drivers, tag.drivers) &&
        Objects.equals(groupId, tag.groupId) &&
        Objects.equals(id, tag.id) &&
        Objects.equals(machines, tag.machines) &&
        Objects.equals(name, tag.name) &&
        Objects.equals(parentTagId, tag.parentTagId) &&
        Objects.equals(sensors, tag.sensors) &&
        Objects.equals(vehicles, tag.vehicles);
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

