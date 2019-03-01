package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.AuxInputSeries;
import org.openapitools.server.api.model.EngineState;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class InlineResponse2005VehicleStats   {
  
  private List<EngineState> engineState = new ArrayList<>();
  private AuxInputSeries auxInput2 = null;
  private Long vehicleId;
  private AuxInputSeries auxInput1 = null;

  public InlineResponse2005VehicleStats () {

  }

  public InlineResponse2005VehicleStats (List<EngineState> engineState, AuxInputSeries auxInput2, Long vehicleId, AuxInputSeries auxInput1) {
    this.engineState = engineState;
    this.auxInput2 = auxInput2;
    this.vehicleId = vehicleId;
    this.auxInput1 = auxInput1;
  }

    
  @JsonProperty("engineState")
  public List<EngineState> getEngineState() {
    return engineState;
  }
  public void setEngineState(List<EngineState> engineState) {
    this.engineState = engineState;
  }

    
  @JsonProperty("auxInput2")
  public AuxInputSeries getAuxInput2() {
    return auxInput2;
  }
  public void setAuxInput2(AuxInputSeries auxInput2) {
    this.auxInput2 = auxInput2;
  }

    
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("auxInput1")
  public AuxInputSeries getAuxInput1() {
    return auxInput1;
  }
  public void setAuxInput1(AuxInputSeries auxInput1) {
    this.auxInput1 = auxInput1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005VehicleStats inlineResponse2005VehicleStats = (InlineResponse2005VehicleStats) o;
    return Objects.equals(engineState, inlineResponse2005VehicleStats.engineState) &&
        Objects.equals(auxInput2, inlineResponse2005VehicleStats.auxInput2) &&
        Objects.equals(vehicleId, inlineResponse2005VehicleStats.vehicleId) &&
        Objects.equals(auxInput1, inlineResponse2005VehicleStats.auxInput1);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
