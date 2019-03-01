package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MachineHistoryResponseVibrations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class MachineHistoryResponseVibrations   {
  @JsonProperty("X")
  private Double X = null;

  @JsonProperty("Y")
  private Double Y = null;

  @JsonProperty("Z")
  private Double Z = null;

  @JsonProperty("time")
  private Long time = null;

  public MachineHistoryResponseVibrations X(Double X) {
    this.X = X;
    return this;
  }

  /**
   * Get X
   * @return X
  **/
  @ApiModelProperty(example = "0.01", value = "")


  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public MachineHistoryResponseVibrations Y(Double Y) {
    this.Y = Y;
    return this;
  }

  /**
   * Get Y
   * @return Y
  **/
  @ApiModelProperty(example = "1.23", value = "")


  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public MachineHistoryResponseVibrations Z(Double Z) {
    this.Z = Z;
    return this;
  }

  /**
   * Get Z
   * @return Z
  **/
  @ApiModelProperty(example = "2.55", value = "")


  public Double getZ() {
    return Z;
  }

  public void setZ(Double Z) {
    this.Z = Z;
  }

  public MachineHistoryResponseVibrations time(Long time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "1453449599999", value = "")


  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHistoryResponseVibrations machineHistoryResponseVibrations = (MachineHistoryResponseVibrations) o;
    return Objects.equals(this.X, machineHistoryResponseVibrations.X) &&
        Objects.equals(this.Y, machineHistoryResponseVibrations.Y) &&
        Objects.equals(this.Z, machineHistoryResponseVibrations.Z) &&
        Objects.equals(this.time, machineHistoryResponseVibrations.time);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

