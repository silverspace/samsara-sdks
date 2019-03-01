package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * J1939 check engine lights.
 **/

@ApiModel(description = "J1939 check engine lights.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class VehicleMaintenanceJ1939CheckEngineLight   {
  @JsonProperty("protectIsOn")
  private Boolean protectIsOn;

  @JsonProperty("stopIsOn")
  private Boolean stopIsOn;

  @JsonProperty("warningIsOn")
  private Boolean warningIsOn;

  @JsonProperty("emissionsIsOn")
  private Boolean emissionsIsOn;

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight protectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("protectIsOn")
  public Boolean getProtectIsOn() {
    return protectIsOn;
  }
  public void setProtectIsOn(Boolean protectIsOn) {
    this.protectIsOn = protectIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight stopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stopIsOn")
  public Boolean getStopIsOn() {
    return stopIsOn;
  }
  public void setStopIsOn(Boolean stopIsOn) {
    this.stopIsOn = stopIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight warningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("warningIsOn")
  public Boolean getWarningIsOn() {
    return warningIsOn;
  }
  public void setWarningIsOn(Boolean warningIsOn) {
    this.warningIsOn = warningIsOn;
  }

  /**
   **/
  public VehicleMaintenanceJ1939CheckEngineLight emissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("emissionsIsOn")
  public Boolean getEmissionsIsOn() {
    return emissionsIsOn;
  }
  public void setEmissionsIsOn(Boolean emissionsIsOn) {
    this.emissionsIsOn = emissionsIsOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenanceJ1939CheckEngineLight vehicleMaintenanceJ1939CheckEngineLight = (VehicleMaintenanceJ1939CheckEngineLight) o;
    return Objects.equals(protectIsOn, vehicleMaintenanceJ1939CheckEngineLight.protectIsOn) &&
        Objects.equals(stopIsOn, vehicleMaintenanceJ1939CheckEngineLight.stopIsOn) &&
        Objects.equals(warningIsOn, vehicleMaintenanceJ1939CheckEngineLight.warningIsOn) &&
        Objects.equals(emissionsIsOn, vehicleMaintenanceJ1939CheckEngineLight.emissionsIsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protectIsOn, stopIsOn, warningIsOn, emissionsIsOn);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

