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

@ApiModel(description="Specify devices, etc. that should be removed from the tag.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class TagModifyDelete   {
  
  private List<TaggedAssetBase> assets = new ArrayList<TaggedAssetBase>();
  private List<TaggedSensorBase> sensors = new ArrayList<TaggedSensorBase>();
  private List<TaggedVehicleBase> vehicles = new ArrayList<TaggedVehicleBase>();
  private List<TaggedMachineBase> machines = new ArrayList<TaggedMachineBase>();
  private List<TaggedDriverBase> drivers = new ArrayList<TaggedDriverBase>();

  /**
   * The assets to be removed from this tag.
   **/
  
  @ApiModelProperty(value = "The assets to be removed from this tag.")
  @JsonProperty("assets")
  public List<TaggedAssetBase> getAssets() {
    return assets;
  }
  public void setAssets(List<TaggedAssetBase> assets) {
    this.assets = assets;
  }

  /**
   * The sensors to be removed from this tag.
   **/
  
  @ApiModelProperty(value = "The sensors to be removed from this tag.")
  @JsonProperty("sensors")
  public List<TaggedSensorBase> getSensors() {
    return sensors;
  }
  public void setSensors(List<TaggedSensorBase> sensors) {
    this.sensors = sensors;
  }

  /**
   * The vehicles to be removed from this tag.
   **/
  
  @ApiModelProperty(value = "The vehicles to be removed from this tag.")
  @JsonProperty("vehicles")
  public List<TaggedVehicleBase> getVehicles() {
    return vehicles;
  }
  public void setVehicles(List<TaggedVehicleBase> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * The machines to be removed from this tag.
   **/
  
  @ApiModelProperty(value = "The machines to be removed from this tag.")
  @JsonProperty("machines")
  public List<TaggedMachineBase> getMachines() {
    return machines;
  }
  public void setMachines(List<TaggedMachineBase> machines) {
    this.machines = machines;
  }

  /**
   * The drivers to be removed from this tag.
   **/
  
  @ApiModelProperty(value = "The drivers to be removed from this tag.")
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
    TagModifyDelete tagModifyDelete = (TagModifyDelete) o;
    return Objects.equals(assets, tagModifyDelete.assets) &&
        Objects.equals(sensors, tagModifyDelete.sensors) &&
        Objects.equals(vehicles, tagModifyDelete.vehicles) &&
        Objects.equals(machines, tagModifyDelete.machines) &&
        Objects.equals(drivers, tagModifyDelete.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, sensors, vehicles, machines, drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagModifyDelete {\n");
    
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

