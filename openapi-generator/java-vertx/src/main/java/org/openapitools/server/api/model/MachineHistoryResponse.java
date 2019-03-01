package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.MachineHistoryResponseMachines;

/**
 * Contains the results for a machine history request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class MachineHistoryResponse   {
  
  private List<MachineHistoryResponseMachines> machines = new ArrayList<>();

  public MachineHistoryResponse () {

  }

  public MachineHistoryResponse (List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
  }

    
  @JsonProperty("machines")
  public List<MachineHistoryResponseMachines> getMachines() {
    return machines;
  }
  public void setMachines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponse machineHistoryResponse = (MachineHistoryResponse) o;
    return Objects.equals(machines, machineHistoryResponse.machines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponse {\n");
    
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
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
