package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class TagCreate   {
  

  private List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>();

  private List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>();

  private List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>();

  private String name;

  private Long parentTagId;

  private List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>();

  private List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>();

  /**
   * The assets that belong to this tag.
   **/
  
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
  
  @ApiModelProperty(value = "The machines that belong to this tag.")
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
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
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles that belong to this tag.
   **/
  
  @ApiModelProperty(value = "The vehicles that belong to this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

