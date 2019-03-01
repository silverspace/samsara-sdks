package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Passenger vehicle check engine light.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class VehicleMaintenancePassengerCheckEngineLight   {
  

  private Boolean isOn;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("isOn")
  public Boolean getIsOn() {
    return isOn;
  }
  public void setIsOn(Boolean isOn) {
    this.isOn = isOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleMaintenancePassengerCheckEngineLight vehicleMaintenancePassengerCheckEngineLight = (VehicleMaintenancePassengerCheckEngineLight) o;
    return Objects.equals(isOn, vehicleMaintenancePassengerCheckEngineLight.isOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOn);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

