package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class AssetReeferResponseReeferStatsFuelPercentage   {
  @JsonProperty("fuelPercentage")
  private Long fuelPercentage;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  /**
   * Fuel percentage of the reefer.
   **/
  public AssetReeferResponseReeferStatsFuelPercentage fuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
    return this;
  }

  
  @ApiModelProperty(example = "99", value = "Fuel percentage of the reefer.")
  @JsonProperty("fuelPercentage")
  public Long getFuelPercentage() {
    return fuelPercentage;
  }
  public void setFuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  /**
   * Timestamp in Unix milliseconds since epoch.
   **/
  public AssetReeferResponseReeferStatsFuelPercentage changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
  @JsonProperty("changedAtMs")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsFuelPercentage assetReeferResponseReeferStatsFuelPercentage = (AssetReeferResponseReeferStatsFuelPercentage) o;
    return Objects.equals(fuelPercentage, assetReeferResponseReeferStatsFuelPercentage.fuelPercentage) &&
        Objects.equals(changedAtMs, assetReeferResponseReeferStatsFuelPercentage.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fuelPercentage, changedAtMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsFuelPercentage {\n");
    
    sb.append("    fuelPercentage: ").append(toIndentedString(fuelPercentage)).append("\n");
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
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

