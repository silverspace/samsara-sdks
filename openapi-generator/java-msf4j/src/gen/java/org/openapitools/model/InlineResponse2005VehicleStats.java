package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AuxInputSeries;
import org.openapitools.model.EngineState;

/**
 * InlineResponse2005VehicleStats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class InlineResponse2005VehicleStats   {
  @JsonProperty("engineState")
  private List<EngineState> engineState = null;

  @JsonProperty("auxInput2")
  private AuxInputSeries auxInput2 = null;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  @JsonProperty("auxInput1")
  private AuxInputSeries auxInput1 = null;

  public InlineResponse2005VehicleStats engineState(List<EngineState> engineState) {
    this.engineState = engineState;
    return this;
  }

  public InlineResponse2005VehicleStats addEngineStateItem(EngineState engineStateItem) {
    if (this.engineState == null) {
      this.engineState = new ArrayList<EngineState>();
    }
    this.engineState.add(engineStateItem);
    return this;
  }

   /**
   * Get engineState
   * @return engineState
  **/
  @ApiModelProperty(value = "")
  public List<EngineState> getEngineState() {
    return engineState;
  }

  public void setEngineState(List<EngineState> engineState) {
    this.engineState = engineState;
  }

  public InlineResponse2005VehicleStats auxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
    return this;
  }

   /**
   * Get auxInput2
   * @return auxInput2
  **/
  @ApiModelProperty(value = "")
  public AuxInputSeries getAuxInput2() {
    return auxInput2;
  }

  public void setAuxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
  }

  public InlineResponse2005VehicleStats vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return vehicleId
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public InlineResponse2005VehicleStats auxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
    return this;
  }

   /**
   * Get auxInput1
   * @return auxInput1
  **/
  @ApiModelProperty(value = "")
  public AuxInputSeries getAuxInput1() {
    return auxInput1;
  }

  public void setAuxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005VehicleStats inlineResponse2005VehicleStats = (InlineResponse2005VehicleStats) o;
    return Objects.equals(this.engineState, inlineResponse2005VehicleStats.engineState) &&
        Objects.equals(this.auxInput2, inlineResponse2005VehicleStats.auxInput2) &&
        Objects.equals(this.vehicleId, inlineResponse2005VehicleStats.vehicleId) &&
        Objects.equals(this.auxInput1, inlineResponse2005VehicleStats.auxInput1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineState, auxInput2, vehicleId, auxInput1);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

