package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetReeferResponseReeferStats;

/**
 * Reefer-specific asset details
 */
@ApiModel(description = "Reefer-specific asset details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class AssetReeferResponse   {
  @JsonProperty("assetType")
  private String assetType;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("reeferStats")
  private AssetReeferResponseReeferStats reeferStats = null;

  public AssetReeferResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

   /**
   * Asset type
   * @return assetType
  **/
  @ApiModelProperty(example = "Reefer (Thermo King)", value = "Asset type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AssetReeferResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Asset ID
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Asset ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AssetReeferResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Asset name
   * @return name
  **/
  @ApiModelProperty(example = "Reefer 123", value = "Asset name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssetReeferResponse reeferStats(AssetReeferResponseReeferStats reeferStats) {
    this.reeferStats = reeferStats;
    return this;
  }

   /**
   * Get reeferStats
   * @return reeferStats
  **/
  @ApiModelProperty(value = "")
  public AssetReeferResponseReeferStats getReeferStats() {
    return reeferStats;
  }

  public void setReeferStats(AssetReeferResponseReeferStats reeferStats) {
    this.reeferStats = reeferStats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponse assetReeferResponse = (AssetReeferResponse) o;
    return Objects.equals(this.assetType, assetReeferResponse.assetType) &&
        Objects.equals(this.id, assetReeferResponse.id) &&
        Objects.equals(this.name, assetReeferResponse.name) &&
        Objects.equals(this.reeferStats, assetReeferResponse.reeferStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetType, id, name, reeferStats);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

