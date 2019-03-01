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
 * AssetReeferResponseReeferStatsEngineHours
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-03-01T05:40:23.859Z[GMT]")

public class AssetReeferResponseReeferStatsEngineHours   {
  @JsonProperty("engineHours")
  private Long engineHours;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsEngineHours engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  /**
   * Engine hours of the reefer.
   * @return engineHours
  */
  @ApiModelProperty(example = "1200", value = "Engine hours of the reefer.")


  public Long getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  public AssetReeferResponseReeferStatsEngineHours changedAtMs(Long changedAtMs) {
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
    AssetReeferResponseReeferStatsEngineHours assetReeferResponseReeferStatsEngineHours = (AssetReeferResponseReeferStatsEngineHours) o;
    return Objects.equals(this.engineHours, assetReeferResponseReeferStatsEngineHours.engineHours) &&
        Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsEngineHours.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineHours, changedAtMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsEngineHours {\n");
    
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
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

