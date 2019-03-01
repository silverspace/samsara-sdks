package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetReeferResponseReeferStatsReturnAirTemp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AssetReeferResponseReeferStatsReturnAirTemp   {
  @JsonProperty("changedAtMs")
  private Long changedAtMs = null;

  @JsonProperty("tempInMilliC")
  private Long tempInMilliC = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsReturnAirTemp assetReeferResponseReeferStatsReturnAirTemp = (AssetReeferResponseReeferStatsReturnAirTemp) o;
    return Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsReturnAirTemp.changedAtMs) &&
        Objects.equals(this.tempInMilliC, assetReeferResponseReeferStatsReturnAirTemp.tempInMilliC);
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

