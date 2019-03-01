package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class AssetReeferResponseReeferStatsPowerStatus   {
  
  private Long changedAtMs;
  private String status;

  public AssetReeferResponseReeferStatsPowerStatus () {

  }

  public AssetReeferResponseReeferStatsPowerStatus (Long changedAtMs, String status) {
    this.changedAtMs = changedAtMs;
    this.status = status;
  }

    
  @JsonProperty("changedAtMs")
  public Long getChangedAtMs() {
    return changedAtMs;
  }
  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

    
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
