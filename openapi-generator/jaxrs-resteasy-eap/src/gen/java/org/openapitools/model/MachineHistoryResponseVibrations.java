package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class MachineHistoryResponseVibrations   {
  

  private Double X;

  private Double Y;

  private Double Z;

  private Long time;

  /**
   **/
  
  @ApiModelProperty(example = "0.01", value = "")
  @JsonProperty("X")
  public Double getX() {
    return X;
  }
  public void setX(Double X) {
    this.X = X;
  }

  /**
   **/
  
  @ApiModelProperty(example = "1.23", value = "")
  @JsonProperty("Y")
  public Double getY() {
    return Y;
  }
  public void setY(Double Y) {
    this.Y = Y;
  }

  /**
   **/
  
  @ApiModelProperty(example = "2.55", value = "")
  @JsonProperty("Z")
  public Double getZ() {
    return Z;
  }
  public void setZ(Double Z) {
    this.Z = Z;
  }

  /**
   **/
  
  @ApiModelProperty(example = "1453449599999", value = "")
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

