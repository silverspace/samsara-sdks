package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class AssetReeferResponseReeferStatsPowerStatus   {
  

  private Long changedAtMs;

  private String status;

  /**
   * Timestamp in Unix milliseconds since epoch.
   **/
  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
  @JsonProperty("changedAtMs")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  /**
   * Power status of the reefer.
   **/
  
  @ApiModelProperty(example = "Active (Continuous)", value = "Power status of the reefer.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReeferResponseReeferStatsPowerStatus assetReeferResponseReeferStatsPowerStatus = (AssetReeferResponseReeferStatsPowerStatus) o;
    return Objects.equals(changedAtMs, assetReeferResponseReeferStatsPowerStatus.changedAtMs) &&
        Objects.equals(status, assetReeferResponseReeferStatsPowerStatus.status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

