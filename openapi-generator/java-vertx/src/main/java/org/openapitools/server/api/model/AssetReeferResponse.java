package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.AssetReeferResponseReeferStats;

/**
 * Reefer-specific asset details
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetReeferResponse   {
  
  private String assetType;
  private Integer id;
  private String name;
  private AssetReeferResponseReeferStats reeferStats = null;

  public AssetReeferResponse () {

  }

  public AssetReeferResponse (String assetType, Integer id, String name, AssetReeferResponseReeferStats reeferStats) {
    this.assetType = assetType;
    this.id = id;
    this.name = name;
    this.reeferStats = reeferStats;
  }

    
  @JsonProperty("assetType")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("reeferStats")
  public AssetReeferResponseReeferStats getReeferStats() {
    return reeferStats;
  }
  public void setReeferStats(AssetReeferResponseReeferStats reeferStats) {
    this.reeferStats = reeferStats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponse assetReeferResponse = (AssetReeferResponse) o;
    return Objects.equals(assetType, assetReeferResponse.assetType) &&
        Objects.equals(id, assetReeferResponse.id) &&
        Objects.equals(name, assetReeferResponse.name) &&
        Objects.equals(reeferStats, assetReeferResponse.reeferStats);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
