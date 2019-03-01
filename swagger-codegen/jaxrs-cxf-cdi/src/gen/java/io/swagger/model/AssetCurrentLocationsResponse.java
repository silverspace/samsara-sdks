package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.model.AssetCable;
import io.swagger.model.AssetCurrentLocation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Basic information of an asset
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Basic information of an asset")

public class AssetCurrentLocationsResponse   {
  
  private List<AssetCable> cable = new ArrayList<AssetCable>();
  private Integer engineHours = null;
  private Long id = null;
  private List<AssetCurrentLocation> location = new ArrayList<AssetCurrentLocation>();
  private String name = null;

  /**
   * The cable connected to the asset
   **/
  public AssetCurrentLocationsResponse cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  
  @ApiModelProperty(value = "The cable connected to the asset")
  @JsonProperty("cable")
  public List<AssetCable> getCable() {
    return cable;
  }
  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  /**
   * Engine hours
   **/
  public AssetCurrentLocationsResponse engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  
  @ApiModelProperty(example = "104", value = "Engine hours")
  @JsonProperty("engineHours")
  public Integer getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * Asset ID
   **/
  public AssetCurrentLocationsResponse id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Current location of an asset
   **/
  public AssetCurrentLocationsResponse location(List<AssetCurrentLocation> location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "Current location of an asset")
  @JsonProperty("location")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }
  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  /**
   * Asset name
   **/
  public AssetCurrentLocationsResponse name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetCurrentLocationsResponse assetCurrentLocationsResponse = (AssetCurrentLocationsResponse) o;
    return Objects.equals(cable, assetCurrentLocationsResponse.cable) &&
        Objects.equals(engineHours, assetCurrentLocationsResponse.engineHours) &&
        Objects.equals(id, assetCurrentLocationsResponse.id) &&
        Objects.equals(location, assetCurrentLocationsResponse.location) &&
        Objects.equals(name, assetCurrentLocationsResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cable, engineHours, id, location, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetCurrentLocationsResponse {\n");
    
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

