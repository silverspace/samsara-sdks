package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * MachineHistoryResponseVibrations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MachineHistoryResponseVibrations   {
  @JsonProperty("X")
  private Double X;

  @JsonProperty("Y")
  private Double Y;

  @JsonProperty("Z")
  private Double Z;

  @JsonProperty("time")
  private Long time;

  public MachineHistoryResponseVibrations X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Get X
   * @return X
  **/
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
    return Objects.equals(X, machineHistoryResponseVibrations.X) &&
        Objects.equals(Y, machineHistoryResponseVibrations.Y) &&
        Objects.equals(Z, machineHistoryResponseVibrations.Z) &&
        Objects.equals(time, machineHistoryResponseVibrations.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, Z, time);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

