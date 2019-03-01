package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * J1939 check engine lights.
 **/
@ApiModel(description="J1939 check engine lights.")
public class VehicleMaintenanceJ1939CheckEngineLight  {
  
  @ApiModelProperty(value = "")
  private Boolean protectIsOn;

  @ApiModelProperty(value = "")
  private Boolean stopIsOn;

  @ApiModelProperty(value = "")
  private Boolean warningIsOn;

  @ApiModelProperty(value = "")
  private Boolean emissionsIsOn;
 /**
   * Get protectIsOn
   * @return protectIsOn
  **/
  @JsonProperty("protectIsOn")
  public Boolean getProtectIsOn() {
    return protectIsOn;
  }

  public void setProtectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight protectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
    return this;
  }

 /**
   * Get stopIsOn
   * @return stopIsOn
  **/
  @JsonProperty("stopIsOn")
  public Boolean getStopIsOn() {
    return stopIsOn;
  }

  public void setStopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight stopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
    return this;
  }

 /**
   * Get warningIsOn
   * @return warningIsOn
  **/
  @JsonProperty("warningIsOn")
  public Boolean getWarningIsOn() {
    return warningIsOn;
  }

  public void setWarningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight warningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
    return this;
  }

 /**
   * Get emissionsIsOn
   * @return emissionsIsOn
  **/
  @JsonProperty("emissionsIsOn")
  public Boolean getEmissionsIsOn() {
    return emissionsIsOn;
  }

  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
  }

  public VehicleMaintenanceJ1939CheckEngineLight emissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenanceJ1939CheckEngineLight {\n");
    
    sb.append("    protectIsOn: ").append(toIndentedString(protectIsOn)).append("\n");
    sb.append("    stopIsOn: ").append(toIndentedString(stopIsOn)).append("\n");
    sb.append("    warningIsOn: ").append(toIndentedString(warningIsOn)).append("\n");
    sb.append("    emissionsIsOn: ").append(toIndentedString(emissionsIsOn)).append("\n");
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

