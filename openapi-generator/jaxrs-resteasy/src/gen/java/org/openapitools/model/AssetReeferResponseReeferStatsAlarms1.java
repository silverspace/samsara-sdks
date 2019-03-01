package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AssetReeferResponseReeferStatsAlarms;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class AssetReeferResponseReeferStatsAlarms1   {
  
  private List<AssetReeferResponseReeferStatsAlarms> alarms = new ArrayList<AssetReeferResponseReeferStatsAlarms>();
  private Long changedAtMs;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("alarms")
  public List<AssetReeferResponseReeferStatsAlarms> getAlarms() {
    return alarms;
  }
  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms> alarms) {
    this.alarms = alarms;
  }

  /**
   * Timestamp when the alarms were reported, in Unix milliseconds since epoch
   **/
  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp when the alarms were reported, in Unix milliseconds since epoch")
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
    AssetReeferResponseReeferStatsAlarms1 assetReeferResponseReeferStatsAlarms1 = (AssetReeferResponseReeferStatsAlarms1) o;
    return Objects.equals(alarms, assetReeferResponseReeferStatsAlarms1.alarms) &&
        Objects.equals(changedAtMs, assetReeferResponseReeferStatsAlarms1.changedAtMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarms, changedAtMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReeferResponseReeferStatsAlarms1 {\n");
    
    sb.append("    alarms: ").append(toIndentedString(alarms)).append("\n");
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

