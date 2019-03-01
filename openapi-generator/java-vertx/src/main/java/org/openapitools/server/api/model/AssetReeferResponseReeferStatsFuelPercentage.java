package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetReeferResponseReeferStatsFuelPercentage   {
  
  private Long fuelPercentage;
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsFuelPercentage () {

  }

  public AssetReeferResponseReeferStatsFuelPercentage (Long fuelPercentage, Long changedAtMs) {
    this.fuelPercentage = fuelPercentage;
    this.changedAtMs = changedAtMs;
  }

    
  @JsonProperty("fuelPercentage")
  public Long getFuelPercentage() {
    return fuelPercentage;
  }
  public void setFuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

    
  @JsonProperty("changedAtMs")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
