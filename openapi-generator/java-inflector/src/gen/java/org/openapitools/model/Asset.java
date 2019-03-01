package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetCable;



/**
 * Basic information of an asset
 **/

@ApiModel(description = "Basic information of an asset")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
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

  /**
   * Serial number of the host asset
   **/
  public Asset assetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
    return this;
  }

  
  @ApiModelProperty(example = "SNTEST123", value = "Serial number of the host asset")
  @JsonProperty("assetSerialNumber")
  public String getAssetSerialNumber() {
    return assetSerialNumber;
  }
  public void setAssetSerialNumber(String assetSerialNumber) {
    this.assetSerialNumber = assetSerialNumber;
  }

  /**
   * The cable connected to the asset
   **/
  public Asset cable(List<AssetCable> cable) {
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
  public Asset engineHours(Integer engineHours) {
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
  public Asset id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Asset ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Asset name
   **/
  public Asset name(String name) {
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
    Asset asset = (Asset) o;
    return Objects.equals(assetSerialNumber, asset.assetSerialNumber) &&
        Objects.equals(cable, asset.cable) &&
        Objects.equals(engineHours, asset.engineHours) &&
        Objects.equals(id, asset.id) &&
        Objects.equals(name, asset.name);
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

