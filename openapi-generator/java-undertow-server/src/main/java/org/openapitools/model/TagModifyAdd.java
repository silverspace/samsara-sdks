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



/**
 * Specify devices, etc. that should be added to the tag.
 **/

@ApiModel(description = "Specify devices, etc. that should be added to the tag.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-03-01T05:34:49.851Z[GMT]")
public class TagModifyAdd   {
  
  private List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>();
  private List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>();
  private List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>();
  private List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>();
  private List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>();

  /**
   * The assets to be added to this tag.
   **/
  public TagModifyAdd assets(List<TaggedAssetBase> assets) {
    this.assets = assets;
    return this;
  }

  
  @ApiModelProperty(value = "The assets to be added to this tag.")
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  /**
   * The sensors to be added to this tag.
   **/
  public TagModifyAdd sensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
    return this;
  }

  
  @ApiModelProperty(value = "The sensors to be added to this tag.")
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles to be added to this tag.
   **/
  public TagModifyAdd vehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
    return this;
  }

  
  @ApiModelProperty(value = "The vehicles to be added to this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * The machines to be added to this tag.
   **/
  public TagModifyAdd machines(List<TaggedMachineBase> machines) {
    this.machines = machines;
    return this;
  }

  
  @ApiModelProperty(value = "The machines to be added to this tag.")
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  /**
   * The drivers to be added to this tag.
   **/
  public TagModifyAdd drivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "The drivers to be added to this tag.")
  @JsonProperty("drivers")
  public List<TaggedDriverBase> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<TaggedDriverBase> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagModifyAdd tagModifyAdd = (TagModifyAdd) o;
    return Objects.equals(assets, tagModifyAdd.assets) &&
        Objects.equals(sensors, tagModifyAdd.sensors) &&
        Objects.equals(vehicles, tagModifyAdd.vehicles) &&
        Objects.equals(machines, tagModifyAdd.machines) &&
        Objects.equals(drivers, tagModifyAdd.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, sensors, vehicles, machines, drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyAdd {\n");
    
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    sensors: ").append(toIndentedString(sensors)).append("\n");
    sb.append("    vehicles: ").append(toIndentedString(vehicles)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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

