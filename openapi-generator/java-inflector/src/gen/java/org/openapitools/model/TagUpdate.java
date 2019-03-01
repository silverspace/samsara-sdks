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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class TagUpdate   {
  @JsonProperty("assets")
  private List<TaggedAssetBase> assets = null;

  @JsonProperty("drivers")
  private List<TaggedDriverBase> drivers = null;

  @JsonProperty("machines")
  private List<TaggedMachineBase> machines = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("parentTagId")
  private Long parentTagId;

  @JsonProperty("sensors")
  private List<TaggedSensorBase> sensors = null;

  @JsonProperty("vehicles")
  private List<TaggedVehicleBase> vehicles = null;

  /**
   * The assets that belong to this tag.
   **/
  public TagUpdate assets(List<TaggedAssetBase> assets) {
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

  /**
   * The drivers that belong to this tag.
   **/
  public TagUpdate drivers(List<TaggedDriverBase> drivers) {
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

  /**
   * The machines that belong to this tag.
   **/
  public TagUpdate machines(List<TaggedMachineBase> machines) {
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

  /**
   * Updated name of this tag.
   **/
  public TagUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Broken Vehicles", value = "Updated name of this tag.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
   **/
  public TagUpdate parentTagId(Long parentTagId) {
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
  public TagUpdate sensors(List<TaggedSensorBase> sensors) {
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

  /**
   * The vehicles that belong to this tag.
   **/
  public TagUpdate vehicles(List<TaggedVehicleBase> vehicles) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagUpdate tagUpdate = (TagUpdate) o;
    return Objects.equals(assets, tagUpdate.assets) &&
        Objects.equals(drivers, tagUpdate.drivers) &&
        Objects.equals(machines, tagUpdate.machines) &&
        Objects.equals(name, tagUpdate.name) &&
        Objects.equals(parentTagId, tagUpdate.parentTagId) &&
        Objects.equals(sensors, tagUpdate.sensors) &&
        Objects.equals(vehicles, tagUpdate.vehicles);
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

