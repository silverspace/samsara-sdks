package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetReeferResponseReeferStatsAlarms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AssetReeferResponseReeferStatsAlarms1
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class AssetReeferResponseReeferStatsAlarms1   {
  @JsonProperty("alarms")
  
  private List<AssetReeferResponseReeferStatsAlarms> alarms = null;

  @JsonProperty("changedAtMs")
  private Long changedAtMs;

  public AssetReeferResponseReeferStatsAlarms1 alarms(List<AssetReeferResponseReeferStatsAlarms> alarms) {
    this.alarms = alarms;
    return this;
  }

  public AssetReeferResponseReeferStatsAlarms1 addAlarmsItem(AssetReeferResponseReeferStatsAlarms alarmsItem) {
    if (this.alarms == null) {
      this.alarms = new ArrayList<>();
    }
    this.alarms.add(alarmsItem);
    return this;
  }

   /**
   * Get alarms
   * @return alarms
  **/
  @ApiModelProperty(value = "")
  public List<AssetReeferResponseReeferStatsAlarms> getAlarms() {
    return alarms;
  }

  public void setAlarms(List<AssetReeferResponseReeferStatsAlarms> alarms) {
    this.alarms = alarms;
  }

  public AssetReeferResponseReeferStatsAlarms1 changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

   /**
   * Timestamp when the alarms were reported, in Unix milliseconds since epoch
   * @return changedAtMs
  **/
  @ApiModelProperty(example = "1453449599999", value = "Timestamp when the alarms were reported, in Unix milliseconds since epoch")
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
    return Objects.equals(this.alarms, assetReeferResponseReeferStatsAlarms1.alarms) &&
        Objects.equals(this.changedAtMs, assetReeferResponseReeferStatsAlarms1.changedAtMs);
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

