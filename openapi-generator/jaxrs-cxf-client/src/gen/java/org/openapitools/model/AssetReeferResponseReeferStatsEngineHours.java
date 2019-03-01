package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetReeferResponseReeferStatsEngineHours  {
  
  @ApiModelProperty(example = "1200", value = "Engine hours of the reefer.")
 /**
   * Engine hours of the reefer.
  **/
  private Long engineHours;

  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
 /**
   * Timestamp in Unix milliseconds since epoch.
  **/
  private Long changedAtMs;
 /**
   * Engine hours of the reefer.
   * @return engineHours
  **/
  @JsonProperty("engineHours")
  public Long getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  public AssetReeferResponseReeferStatsEngineHours engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

 /**
   * Timestamp in Unix milliseconds since epoch.
   * @return changedAtMs
  **/
  @JsonProperty("changedAtMs")
  public Long getChangedAtMs() {
    return changedAtMs;
  }

  public void setChangedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
  }

  public AssetReeferResponseReeferStatsEngineHours changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

