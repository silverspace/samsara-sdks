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
 * AssetReeferResponseReeferStatsEngineHours
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class AssetReeferResponseReeferStatsEngineHours   {
  @JsonProperty("changedAtMs")
  private Long changedAtMs = null;

  @JsonProperty("engineHours")
  private Long engineHours = null;

  public AssetReeferResponseReeferStatsEngineHours changedAtMs(Long changedAtMs) {
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

  public AssetReeferResponseReeferStatsEngineHours engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

  /**
   * Engine hours of the reefer.
   * @return engineHours
  **/
  @ApiModelProperty(example = "1200", value = "Engine hours of the reefer.")


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
    return Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsEngineHours.changedAtMs) &&
        Objects.equals(this.engineHours, assetReeferResponseReeferStatsEngineHours.engineHours);
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

