package apimodels;

import apimodels.MachineHistoryResponseMachines;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Contains the results for a machine history request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MachineHistoryResponse   {
  @JsonProperty("machines")
  private List<MachineHistoryResponseMachines> machines = null;

  public MachineHistoryResponse machines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
    return this;
  }

  public MachineHistoryResponse addMachinesItem(MachineHistoryResponseMachines machinesItem) {
    if (machines == null) {
      machines = new ArrayList<>();
    }
    machines.add(machinesItem);
    return this;
  }

   /**
   * Get machines
   * @return machines
  **/
  @Valid
  public List<MachineHistoryResponseMachines> getMachines() {
    return machines;
  }

  public void setMachines(List<MachineHistoryResponseMachines> machines) {
    this.machines = machines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

