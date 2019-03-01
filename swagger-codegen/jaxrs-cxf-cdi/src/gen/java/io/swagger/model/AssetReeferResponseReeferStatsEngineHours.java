package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AssetReeferResponseReeferStatsEngineHours   {
  
  private Long changedAtMs = null;
  private Long engineHours = null;

  /**
   * Timestamp in Unix milliseconds since epoch.
   **/
  public AssetReeferResponseReeferStatsEngineHours changedAtMs(Long changedAtMs) {
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
   * Engine hours of the reefer.
   **/
  public AssetReeferResponseReeferStatsEngineHours engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  
  @ApiModelProperty(example = "1200", value = "Engine hours of the reefer.")
  @JsonProperty("engineHours")
  public Long getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsEngineHours assetReeferResponseReeferStatsEngineHours = (AssetReeferResponseReeferStatsEngineHours) o;
    return Objects.equals(changedAtMs, assetReeferResponseReeferStatsEngineHours.changedAtMs) &&
        Objects.equals(engineHours, assetReeferResponseReeferStatsEngineHours.engineHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, engineHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsEngineHours {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
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

