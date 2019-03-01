package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AssetReeferResponseReeferStatsSetPoint   {
  
  private Long changedAtMs = null;
  private Long tempInMilliC = null;

  /**
   * Timestamp in Unix milliseconds since epoch.
   **/
  public AssetReeferResponseReeferStatsSetPoint changedAtMs(Long changedAtMs) {
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
   * Set point temperature in millidegree Celsius.
   **/
  public AssetReeferResponseReeferStatsSetPoint tempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
    return this;
  }

  
  @ApiModelProperty(example = "31110", value = "Set point temperature in millidegree Celsius.")
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
    AssetReeferResponseReeferStatsSetPoint assetReeferResponseReeferStatsSetPoint = (AssetReeferResponseReeferStatsSetPoint) o;
    return Objects.equals(changedAtMs, assetReeferResponseReeferStatsSetPoint.changedAtMs) &&
        Objects.equals(tempInMilliC, assetReeferResponseReeferStatsSetPoint.tempInMilliC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, tempInMilliC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsSetPoint {\n");
    
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

