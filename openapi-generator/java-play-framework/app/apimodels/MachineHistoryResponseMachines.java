package apimodels;

import apimodels.MachineHistoryResponseVibrations;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * MachineHistoryResponseMachines
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
    if (vibrations == null) {
      vibrations = new ArrayList<>();
    }
    vibrations.add(vibrationsItem);
    return this;
  }

   /**
   * List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s
   * @return vibrations
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

