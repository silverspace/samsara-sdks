package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.MachineHistoryResponseVibrations;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class MachineHistoryResponseMachines   {
  
  private String name;
  private Integer id;
  private List<MachineHistoryResponseVibrations> vibrations = new ArrayList<>();

  public MachineHistoryResponseMachines () {

  }

  public MachineHistoryResponseMachines (String name, Integer id, List<MachineHistoryResponseVibrations> vibrations) {
    this.name = name;
    this.id = id;
    this.vibrations = vibrations;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("vibrations")
  public List<MachineHistoryResponseVibrations> getVibrations() {
    return vibrations;
  }
  public void setVibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponseMachines machineHistoryResponseMachines = (MachineHistoryResponseMachines) o;
    return Objects.equals(name, machineHistoryResponseMachines.name) &&
        Objects.equals(id, machineHistoryResponseMachines.id) &&
        Objects.equals(vibrations, machineHistoryResponseMachines.vibrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, vibrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponseMachines {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vibrations: ").append(toIndentedString(vibrations)).append("\n");
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
