package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class AssetReeferResponseReeferStatsSetPoint   {
  
  private @Valid Long tempInMilliC;
  private @Valid Long changedAtMs;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsSetPoint assetReeferResponseReeferStatsSetPoint = (AssetReeferResponseReeferStatsSetPoint) o;
    return Objects.equals(tempInMilliC, assetReeferResponseReeferStatsSetPoint.tempInMilliC) &&
        Objects.equals(changedAtMs, assetReeferResponseReeferStatsSetPoint.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempInMilliC, changedAtMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsSetPoint {\n");
    
    sb.append("    tempInMilliC: ").append(toIndentedString(tempInMilliC)).append("\n");
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

