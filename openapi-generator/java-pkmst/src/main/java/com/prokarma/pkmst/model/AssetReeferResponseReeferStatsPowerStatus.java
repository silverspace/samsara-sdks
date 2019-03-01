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
 * AssetReeferResponseReeferStatsPowerStatus
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetReeferResponseReeferStatsPowerStatus   {
  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  @JsonProperty("status")
  private String status;

  public AssetReeferResponseReeferStatsPowerStatus changedAtMs(Long changedAtMs) {
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

  public AssetReeferResponseReeferStatsPowerStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Power status of the reefer.
   * @return status
  **/
  @ApiModelProperty(example = "Active (Continuous)", value = "Power status of the reefer.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsPowerStatus assetReeferResponseReeferStatsPowerStatus = (AssetReeferResponseReeferStatsPowerStatus) o;
    return Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsPowerStatus.changedAtMs) &&
        Objects.equals(this.status, assetReeferResponseReeferStatsPowerStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAtMs, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsPowerStatus {\n");
    
    sb.append("    changedAtMs: ").append(toIndentedString(changedAtMs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

