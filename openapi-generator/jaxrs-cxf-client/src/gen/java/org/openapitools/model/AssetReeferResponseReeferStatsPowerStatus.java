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

public class AssetReeferResponseReeferStatsPowerStatus  {
  
  @ApiModelProperty(example = "1453449599999", value = "Timestamp in Unix milliseconds since epoch.")
 /**
   * Timestamp in Unix milliseconds since epoch.
  **/
  private Long changedAtMs;

  @ApiModelProperty(example = "Active (Continuous)", value = "Power status of the reefer.")
 /**
   * Power status of the reefer.
  **/
  private String status;
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

  public AssetReeferResponseReeferStatsPowerStatus changedAtMs(Long changedAtMs) {
    this.changedAtMs = changedAtMs;
    return this;
  }

 /**
   * Power status of the reefer.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AssetReeferResponseReeferStatsPowerStatus status(String status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

