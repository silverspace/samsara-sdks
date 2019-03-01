package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AssetCable;
import io.swagger.model.AssetCurrentLocation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Basic information of an asset
 **/
@ApiModel(description="Basic information of an asset")
public class AssetCurrentLocationsResponse  {
  
  @ApiModelProperty(value = "The cable connected to the asset")
  @Valid
 /**
   * The cable connected to the asset
  **/
  private List<AssetCable> cable = null;

  @ApiModelProperty(example = "104", value = "Engine hours")
 /**
   * Engine hours
  **/
  private Integer engineHours = null;

  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
 /**
   * Asset ID
  **/
  private Long id = null;

  @ApiModelProperty(value = "Current location of an asset")
  @Valid
 /**
   * Current location of an asset
  **/
  private List<AssetCurrentLocation> location = null;

  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
 /**
   * Asset name
  **/
  private String name = null;
 /**
   * The cable connected to the asset
   * @return cable
  **/
  @JsonProperty("cable")
  public List<AssetCable> getCable() {
    return cable;
  }

  public void setCable(List<AssetCable> cable) {
    this.cable = cable;
  }

  public AssetCurrentLocationsResponse cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public AssetCurrentLocationsResponse addCableItem(AssetCable cableItem) {
    this.cable.add(cableItem);
    return this;
  }

 /**
   * Engine hours
   * @return engineHours
  **/
  @JsonProperty("engineHours")
  public Integer getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Integer engineHours) {
    this.engineHours = engineHours;
  }

  public AssetCurrentLocationsResponse engineHours(Integer engineHours) {
    this.engineHours = engineHours;
    return this;
  }

 /**
   * Asset ID
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AssetCurrentLocationsResponse id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Current location of an asset
   * @return location
  **/
  @JsonProperty("location")
  public List<AssetCurrentLocation> getLocation() {
    return location;
  }

  public void setLocation(List<AssetCurrentLocation> location) {
    this.location = location;
  }

  public AssetCurrentLocationsResponse location(List<AssetCurrentLocation> location) {
    this.location = location;
    return this;
  }

  public AssetCurrentLocationsResponse addLocationItem(AssetCurrentLocation locationItem) {
    this.location.add(locationItem);
    return this;
  }

 /**
   * Asset name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssetCurrentLocationsResponse name(String name) {
    this.name = name;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

