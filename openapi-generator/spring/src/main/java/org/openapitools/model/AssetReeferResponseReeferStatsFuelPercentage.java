package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AssetReeferResponseReeferStatsFuelPercentage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class AssetReeferResponseReeferStatsFuelPercentage   {
  @JsonProperty("fuelPercentage")
  private Long fuelPercentage;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsFuelPercentage fuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
    return this;
  }

  /**
   * Fuel percentage of the reefer.
   * @return fuelPercentage
  */
  @ApiModelProperty(example = "99", value = "Fuel percentage of the reefer.")


  public Long getFuelPercentage() {
    return fuelPercentage;
  }

  public void setFuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  public AssetReeferResponseReeferStatsFuelPercentage changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

  /**
   * Timestamp in Unix milliseconds since epoch.
   * @return changedAtMs
  */
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
    AssetReeferResponseReeferStatsFuelPercentage assetReeferResponseReeferStatsFuelPercentage = (AssetReeferResponseReeferStatsFuelPercentage) o;
    return Objects.equals(this.fuelPercentage, assetReeferResponseReeferStatsFuelPercentage.fuelPercentage) &&
        Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsFuelPercentage.changedAtMs);
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

