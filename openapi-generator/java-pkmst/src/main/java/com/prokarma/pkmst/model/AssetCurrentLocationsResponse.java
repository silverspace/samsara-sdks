package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetCable;
import com.prokarma.pkmst.model.AssetCurrentLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Basic information of an asset
 */
@ApiModel(description = "Basic information of an asset")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetCurrentLocationsResponse   {
  @JsonProperty("cable")
  
  private List<AssetCable> cable = null;

  @JsonProperty("engineHours")
  private Integer engineHours;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("location")
  
  private List<AssetCurrentLocation> location = null;

  @JsonProperty("name")
  private String name;

  public AssetCurrentLocationsResponse cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public AssetCurrentLocationsResponse addCableItem(AssetCable cableItem) {
    if (this.cable == null) {
      this.cable = new ArrayList<>();
    }
    this.cable.add(cableItem);
    return this;
  }

   /**
   * The cable connected to the asset
   * @return cable
  **/
  @ApiModelProperty(value = "The cable connected to the asset")
  public List<AssetCable> getCable() {
    return cable;
  }

  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  public AssetCurrentLocationsResponse engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

   /**
   * Engine hours
   * @return engineHours
  **/
  @ApiModelProperty(example = "104", value = "Engine hours")
  public Integer getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  public AssetCurrentLocationsResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Asset ID
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssetCurrentLocationsResponse location(List<AssetCurrentLocation> location) {
    this.location = location;
    return this;
  }

  public AssetCurrentLocationsResponse addLocationItem(AssetCurrentLocation locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<>();
    }
    this.location.add(locationItem);
    return this;
  }

   /**
   * Current location of an asset
   * @return location
  **/
  @ApiModelProperty(value = "Current location of an asset")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }

  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  public AssetCurrentLocationsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Asset name
   * @return name
  **/
  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
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
    return Objects.equals(this.cable, assetCurrentLocationsResponse.cable) &&
        Objects.equals(this.engineHours, assetCurrentLocationsResponse.engineHours) &&
        Objects.equals(this.id, assetCurrentLocationsResponse.id) &&
        Objects.equals(this.location, assetCurrentLocationsResponse.location) &&
        Objects.equals(this.name, assetCurrentLocationsResponse.name);
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

