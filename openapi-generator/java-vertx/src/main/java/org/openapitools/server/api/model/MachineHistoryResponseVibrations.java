package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class MachineHistoryResponseVibrations   {
  
  private Double X;
  private Double Y;
  private Double Z;
  private Long time;

  public MachineHistoryResponseVibrations () {

  }

  public MachineHistoryResponseVibrations (Double X, Double Y, Double Z, Long time) {
    this.X = X;
    this.Y = Y;
    this.Z = Z;
    this.time = time;
  }

    
  @JsonProperty("X")
  public Double getX() {
    return X;
  }
  public void setX(Double X) {
    this.X = X;
  }

    
  @JsonProperty("Y")
  public Double getY() {
    return Y;
  }
  public void setY(Double Y) {
    this.Y = Y;
  }

    
  @JsonProperty("Z")
  public Double getZ() {
    return Z;
  }
  public void setZ(Double Z) {
    this.Z = Z;
  }

    
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponseVibrations machineHistoryResponseVibrations = (MachineHistoryResponseVibrations) o;
    return Objects.equals(X, machineHistoryResponseVibrations.X) &&
        Objects.equals(Y, machineHistoryResponseVibrations.Y) &&
        Objects.equals(Z, machineHistoryResponseVibrations.Z) &&
        Objects.equals(time, machineHistoryResponseVibrations.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, Z, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHistoryResponseVibrations {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    Z: ").append(toIndentedString(Z)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
