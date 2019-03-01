package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCable;
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
public class Asset  {
  
  @ApiModelProperty(example = "SNTEST123", value = "Serial number of the host asset")
 /**
   * Serial number of the host asset
  **/
  private String assetSerialNumber;

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
  private Integer engineHours;

  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
 /**
   * Asset ID
  **/
  private Long id;

  @ApiModelProperty(example = "Trailer 123", value = "Asset name")
 /**
   * Asset name
  **/
  private String name;
 /**
   * Serial number of the host asset
   * @return assetSerialNumber
  **/
  @JsonProperty("assetSerialNumber")
  public String getAssetSerialNumber() {
    return assetSerialNumber;
  }

  public void setAssetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
  }

  public Asset assetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
    return this;
  }

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

  public Asset cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public Asset addCableItem(AssetCable cableItem) {
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

  public Asset engineHours(Integer engineHours) {
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

  public Asset id(Long id) {
    this.id = id;
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

  public Asset name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset {\n");
    
    sb.append("    assetSerialNumber: ").append(toIndentedString(assetSerialNumber)).append("\n");
    sb.append("    cable: ").append(toIndentedString(cable)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

