package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MachineHistoryResponseVibrations;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class MachineHistoryResponseMachines   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("vibrations")
  private List<MachineHistoryResponseVibrations> vibrations = null;

  /**
   * Machine name
   **/
  public MachineHistoryResponseMachines name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "1/3 HP Motor", value = "Machine name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Machine ID
   **/
  public MachineHistoryResponseMachines id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "Machine ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   **/
  public MachineHistoryResponseMachines vibrations(List<MachineHistoryResponseVibrations> vibrations) {
    this.vibrations = vibrations;
    return this;
  }

  
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

