package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetReeferResponseReeferStatsReturnAirTemp   {
  
  private @Valid Long changedAtMs = null;
  private @Valid Long tempInMilliC = null;

  /**
   * Timestamp in Unix milliseconds since epoch.
   **/
  public AssetReeferResponseReeferStatsReturnAirTemp changedAtMs(Long changedAtMs) {
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
   * Return air temperature in millidegree Celsius.
   **/
  public AssetReeferResponseReeferStatsReturnAirTemp tempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
    return this;
  }

  
  @ApiModelProperty(example = "31110", value = "Return air temperature in millidegree Celsius.")
  @JsonProperty("tempInMilliC")
  public Long getTempInMilliC() {
    return tempInMilliC;
  }
  public void setTempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsReturnAirTemp assetReeferResponseReeferStatsReturnAirTemp = (AssetReeferResponseReeferStatsReturnAirTemp) o;
    return Objects.equals(changedAtMs, assetReeferResponseReeferStatsReturnAirTemp.changedAtMs) &&
        Objects.equals(tempInMilliC, assetReeferResponseReeferStatsReturnAirTemp.tempInMilliC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, tempInMilliC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsReturnAirTemp {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    tempInMilliC: ").append(toIndentedString(tempInMilliC)).append("\n");
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

