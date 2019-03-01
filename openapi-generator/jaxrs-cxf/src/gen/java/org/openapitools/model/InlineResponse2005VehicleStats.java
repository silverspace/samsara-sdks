package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInputSeries;
import org.openapitools.model.EngineState;
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

public class InlineResponse2005VehicleStats  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<EngineState> engineState = null;

  @ApiModelProperty(value = "")
  @Valid
  private AuxInputSeries auxInput2 = null;

  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long vehicleId;

  @ApiModelProperty(value = "")
  @Valid
  private AuxInputSeries auxInput1 = null;
 /**
   * Get engineState
   * @return engineState
  **/
  @JsonProperty("engineState")
  public List<EngineState> getEngineState() {
    return engineState;
  }

  public void setEngineState(List<EngineState> engineState) {
    this.engineState = engineState;
  }

  public InlineResponse2005VehicleStats engineState(List<EngineState> engineState) {
    this.engineState = engineState;
    return this;
  }

  public InlineResponse2005VehicleStats addEngineStateItem(EngineState engineStateItem) {
    this.engineState.add(engineStateItem);
    return this;
  }

 /**
   * Get auxInput2
   * @return auxInput2
  **/
  @JsonProperty("auxInput2")
  public AuxInputSeries getAuxInput2() {
    return auxInput2;
  }

  public void setAuxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
  }

  public InlineResponse2005VehicleStats auxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
    return this;
  }

 /**
   * ID of the vehicle.
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  @NotNull
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public InlineResponse2005VehicleStats vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

 /**
   * Get auxInput1
   * @return auxInput1
  **/
  @JsonProperty("auxInput1")
  public AuxInputSeries getAuxInput1() {
    return auxInput1;
  }

  public void setAuxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
  }

  public InlineResponse2005VehicleStats auxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005VehicleStats {\n");
    
    sb.append("    engineState: ").append(toIndentedString(engineState)).append("\n");
    sb.append("    auxInput2: ").append(toIndentedString(auxInput2)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    auxInput1: ").append(toIndentedString(auxInput1)).append("\n");
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

