package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetCable;
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

public class Asset   {
  @JsonProperty("assetSerialNumber")
  private String assetSerialNumber;

  @JsonProperty("cable")
  
  private List<AssetCable> cable = null;

  @JsonProperty("engineHours")
  private Integer engineHours;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public Asset assetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
    return this;
  }

   /**
   * Serial number of the host asset
   * @return assetSerialNumber
  **/
  @ApiModelProperty(example = "SNTEST123", value = "Serial number of the host asset")
  public String getAssetSerialNumber() {
    return assetSerialNumber;
  }

  public void setAssetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
  }

  public Asset cable(List<AssetCable> cable) {
    this.cable = cable;
    return this;
  }

  public Asset addCableItem(AssetCable cableItem) {
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

  public Asset engineHours(Integer engineHours) {
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

  public Asset id(Long id) {
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

  public Asset name(String name) {
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
    Asset asset = (Asset) o;
    return Objects.equals(this.assetSerialNumber, asset.assetSerialNumber) &&
        Objects.equals(this.cable, asset.cable) &&
        Objects.equals(this.engineHours, asset.engineHours) &&
        Objects.equals(this.id, asset.id) &&
        Objects.equals(this.name, asset.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetSerialNumber, cable, engineHours, id, name);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

