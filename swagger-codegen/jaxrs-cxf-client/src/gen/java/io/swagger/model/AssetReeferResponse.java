package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.AssetReeferResponseReeferStats;

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
  * Reefer-specific asset details
 **/
@ApiModel(description="Reefer-specific asset details")
public class AssetReeferResponse  {
  
  @ApiModelProperty(example = "Reefer (Thermo King)", value = "Asset type")
 /**
   * Asset type
  **/
  private String assetType = null;

  @ApiModelProperty(example = "1", value = "Asset ID")
 /**
   * Asset ID
  **/
  private Integer id = null;

  @ApiModelProperty(example = "Reefer 123", value = "Asset name")
 /**
   * Asset name
  **/
  private String name = null;

  @ApiModelProperty(value = "")
  private AssetReeferResponseReeferStats reeferStats = null;
 /**
   * Asset type
   * @return assetType
  **/
  @JsonProperty("assetType")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AssetReeferResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
   * Asset ID
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AssetReeferResponse id(Integer id) {
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

  public AssetReeferResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get reeferStats
   * @return reeferStats
  **/
  @JsonProperty("reeferStats")
  public AssetReeferResponseReeferStats getReeferStats() {
    return reeferStats;
  }

  public void setReeferStats(AssetReeferResponseReeferStats reeferStats) {
    this.reeferStats = reeferStats;
  }

  public AssetReeferResponse reeferStats(AssetReeferResponseReeferStats reeferStats) {
    this.reeferStats = reeferStats;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponse {\n");
    
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reeferStats: ").append(toIndentedString(reeferStats)).append("\n");
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

