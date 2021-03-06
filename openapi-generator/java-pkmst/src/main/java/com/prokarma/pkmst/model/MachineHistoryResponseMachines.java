package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MachineHistoryResponseVibrations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * MachineHistoryResponseMachines
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class MachineHistoryResponseMachines   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("vibrations")
  
  private List<MachineHistoryResponseVibrations> vibrations = null;

  public MachineHistoryResponseMachines name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Machine name
   * @return name
  **/
  @ApiModelProperty(example = "1/3 HP Motor", value = "Machine name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MachineHistoryResponseMachines id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Machine ID
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Machine ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MachineHistoryResponseMachines vibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
    return this;
  }

  public MachineHistoryResponseMachines addVibrationsItem(MachineHistoryResponseVibrations vibrationsItem) {
    if (this.vibrations == null) {
      this.vibrations = new ArrayList<>();
    }
    this.vibrations.add(vibrationsItem);
    return this;
  }

   /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   * @return vibrations
  **/
  @ApiModelProperty(value = "List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s")
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
    return Objects.equals(this.name, machineHistoryResponseMachines.name) &&
        Objects.equals(this.id, machineHistoryResponseMachines.id) &&
        Objects.equals(this.vibrations, machineHistoryResponseMachines.vibrations);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

