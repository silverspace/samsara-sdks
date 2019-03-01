package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class Tag   {
  

  private List<TaggedAddress> addresses = new ArrayList<TaggedAddress>();

  private List<TaggedAsset> assets = new ArrayList<TaggedAsset>();

  private List<TaggedDriver> drivers = new ArrayList<TaggedDriver>();

  private Long groupId;

  private Long id;

  private List<TaggedMachine> machines = new ArrayList<TaggedMachine>();

  private String name;

  private Long parentTagId;

  private List<TaggedSensor> sensors = new ArrayList<TaggedSensor>();

  private List<TaggedVehicle> vehicles = new ArrayList<TaggedVehicle>();

  /**
   * The addresses that belong to this tag.
   **/
  
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
  
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicle> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicle> vehicles) {
    this.vehicles = vehicles;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

