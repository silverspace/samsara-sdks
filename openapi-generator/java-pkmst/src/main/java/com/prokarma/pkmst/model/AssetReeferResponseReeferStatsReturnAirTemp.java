package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AssetReeferResponseReeferStatsReturnAirTemp
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetReeferResponseReeferStatsReturnAirTemp   {
  @JsonProperty("tempInMilliC")
  private Long tempInMilliC;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsReturnAirTemp tempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
    return this;
  }

   /**
   * Return air temperature in millidegree Celsius.
   * @return tempInMilliC
  **/
  @ApiModelProperty(example = "31110", value = "Return air temperature in millidegree Celsius.")
  public Long getTempInMilliC() {
    return tempInMilliC;
  }

  public void setTempInMilliC(Long tempInMilliC) {
    this.tempInMilliC = tempInMilliC;
  }

  public AssetReeferResponseReeferStatsReturnAirTemp changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

   /**
   * Timestamp in Unix milliseconds since epoch.
   * @return changedAtMs
  **/
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
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
    AssetReeferResponseReeferStatsReturnAirTemp assetReeferResponseReeferStatsReturnAirTemp = (AssetReeferResponseReeferStatsReturnAirTemp) o;
    return Objects.equals(this.tempInMilliC, assetReeferResponseReeferStatsReturnAirTemp.tempInMilliC) &&
        Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsReturnAirTemp.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tempInMilliC, changedAtMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsReturnAirTemp {\n");
    
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

