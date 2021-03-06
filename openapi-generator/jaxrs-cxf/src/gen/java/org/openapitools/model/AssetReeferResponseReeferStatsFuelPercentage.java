package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AssetReeferResponseReeferStatsFuelPercentage  {
  
  @ApiModelProperty(example = "99", value = "Fuel percentage of the reefer.")
 /**
   * Fuel percentage of the reefer.
  **/
  private Long fuelPercentage;

  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
 /**
   * Timestamp in Unix milliseconds since epoch.
  **/
  private Long changedAtMs;
 /**
   * Fuel percentage of the reefer.
   * @return fuelPercentage
  **/
  @JsonProperty("fuelPercentage")
  public Long getFuelPercentage() {
    return fuelPercentage;
  }

  public void setFuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
  }

  public AssetReeferResponseReeferStatsFuelPercentage fuelPercentage(Long fuelPercentage) {
    this.fuelPercentage = fuelPercentage;
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

  public AssetReeferResponseReeferStatsFuelPercentage changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

