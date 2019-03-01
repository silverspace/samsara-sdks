package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Passenger vehicle check engine light.
 **/
@ApiModel(description="Passenger vehicle check engine light.")
public class VehicleMaintenancePassengerCheckEngineLight  {
  
  @ApiModelProperty(value = "")
  private Boolean isOn;
 /**
   * Get isOn
   * @return isOn
  **/
  @JsonProperty("isOn")
  public Boolean getIsOn() {
    return isOn;
  }

  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }

  public VehicleMaintenancePassengerCheckEngineLight isOn(Boolean isOn) {
    this.isOn = isOn;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleMaintenancePassengerCheckEngineLight {\n");
    
    sb.append("    isOn: ").append(toIndentedString(isOn)).append("\n");
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

