package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MachineHistoryResponseVibrations;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class MachineHistoryResponseMachines   {
  
  private Integer id = null;
  private String name = null;
  private List<MachineHistoryResponseVibrations> vibrations = new ArrayList<MachineHistoryResponseVibrations>();

  /**
   * Machine ID
   **/
  
  @ApiModelProperty(example = "1", value = "Machine ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Machine name
   **/
  
  @ApiModelProperty(example = "1/3 HP Motor", value = "Machine name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   **/
  
  @ApiModelProperty(value = "List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s")
  @JsonProperty("vibrations")
  public List<MachineHistoryResponseVibrations> getVibrations() {
    return vibrations;
  }
  public void setVibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponseMachines machineHistoryResponseMachines = (MachineHistoryResponseMachines) o;
    return Objects.equals(id, machineHistoryResponseMachines.id) &&
        Objects.equals(name, machineHistoryResponseMachines.name) &&
        Objects.equals(vibrations, machineHistoryResponseMachines.vibrations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, vibrations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponseMachines {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vibrations: ").append(toIndentedString(vibrations)).append("\n");
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

