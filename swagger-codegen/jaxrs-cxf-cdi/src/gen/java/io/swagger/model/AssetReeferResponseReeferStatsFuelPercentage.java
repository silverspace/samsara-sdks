package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AssetReeferResponseReeferStatsFuelPercentage   {
  
  private Long changedAtMs = null;
  private Long fuelPercentage = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsFuelPercentage assetReeferResponseReeferStatsFuelPercentage = (AssetReeferResponseReeferStatsFuelPercentage) o;
    return Objects.equals(changedAtMs, assetReeferResponseReeferStatsFuelPercentage.changedAtMs) &&
        Objects.equals(fuelPercentage, assetReeferResponseReeferStatsFuelPercentage.fuelPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, fuelPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsFuelPercentage {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    fuelPercentage: ").append(toIndentedString(fuelPercentage)).append("\n");
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

