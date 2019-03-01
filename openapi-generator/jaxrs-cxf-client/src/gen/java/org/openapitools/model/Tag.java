package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TaggedAddress;
import org.openapitools.model.TaggedAsset;
import org.openapitools.model.TaggedDriver;
import org.openapitools.model.TaggedMachine;
import org.openapitools.model.TaggedSensor;
import org.openapitools.model.TaggedVehicle;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tag  {
  
  @ApiModelProperty(value = "The addresses that belong to this tag.")
 /**
   * The addresses that belong to this tag.
  **/
  private List<TaggedAddress> addresses = null;

  @ApiModelProperty(value = "The assets that belong to this tag.")
 /**
   * The assets that belong to this tag.
  **/
  private List<TaggedAsset> assets = null;

  @ApiModelProperty(value = "The drivers that belong to this tag.")
 /**
   * The drivers that belong to this tag.
  **/
  private List<TaggedDriver> drivers = null;

  @ApiModelProperty(example = "2348", value = "The GroupID that this tag belongs to.")
 /**
   * The GroupID that this tag belongs to.
  **/
  private Long groupId;

  @ApiModelProperty(example = "12345", required = true, value = "The ID of this tag.")
 /**
   * The ID of this tag.
  **/
  private Long id;

  @ApiModelProperty(value = "The machines that belong to this tag.")
 /**
   * The machines that belong to this tag.
  **/
  private List<TaggedMachine> machines = null;

  @ApiModelProperty(example = "Broken Vehicles", required = true, value = "Name of this tag.")
 /**
   * Name of this tag.
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
  private List<TaggedSensor> sensors = null;

  @ApiModelProperty(value = "The vehicles that belong to this tag.")
 /**
   * The vehicles that belong to this tag.
  **/
  private List<TaggedVehicle> vehicles = null;
 /**
   * The addresses that belong to this tag.
   * @return addresses
  **/
  @JsonProperty("addresses")
  public List<TaggedAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
  }

  public Tag addresses(List<TaggedAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Tag addAddressesItem(TaggedAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

 /**
   * The assets that belong to this tag.
   * @return assets
  **/
  @JsonProperty("assets")
  public List<TaggedAsset> getAssets() {
    return assets;
  }

  public void setAssets(List<TaggedAsset> assets) {
    this.assets = assets;
  }

  public Tag assets(List<TaggedAsset> assets) {
    this.assets = assets;
    return this;
  }

  public Tag addAssetsItem(TaggedAsset assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

 /**
   * The drivers that belong to this tag.
   * @return drivers
  **/
  @JsonProperty("drivers")
  public List<TaggedDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
  }

  public Tag drivers(List<TaggedDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public Tag addDriversItem(TaggedDriver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

 /**
   * The GroupID that this tag belongs to.
   * @return groupId
  **/
  @JsonProperty("groupId")
  public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public Tag groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

 /**
   * The ID of this tag.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tag id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * The machines that belong to this tag.
   * @return machines
  **/
  @JsonProperty("machines")
  public List<TaggedMachine> getMachines() {
    return machines;
  }

  public void setMachines(List<TaggedMachine> machines) {
    this.machines = machines;
  }

  public Tag machines(List<TaggedMachine> machines) {
    this.machines = machines;
    return this;
  }

  public Tag addMachinesItem(TaggedMachine machinesItem) {
    this.machines.add(machinesItem);
    return this;
  }

 /**
   * Name of this tag.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag name(String name) {
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

  public Tag parentTagId(Long parentTagId) {
    this.parentTagId = parentTagId;
    return this;
  }

 /**
   * The sensors that belong to this tag.
   * @return sensors
  **/
  @JsonProperty("sensors")
  public List<TaggedSensor> getSensors() {
    return sensors;
  }

  public void setSensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
  }

  public Tag sensors(List<TaggedSensor> sensors) {
    this.sensors = sensors;
    return this;
  }

  public Tag addSensorsItem(TaggedSensor sensorsItem) {
    this.sensors.add(sensorsItem);
    return this;
  }

 /**
   * The vehicles that belong to this tag.
   * @return vehicles
  **/
  @JsonProperty("vehicles")
  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public Tag vehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  public Tag addVehiclesItem(TaggedVehicle vehiclesItem) {
    this.vehicles.add(vehiclesItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

