package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MachineHistoryResponseVibrations  {
  
  @ApiModelProperty(example = "0.01", value = "")
  private Double X;

  @ApiModelProperty(example = "1.23", value = "")
  private Double Y;

  @ApiModelProperty(example = "2.55", value = "")
  private Double Z;

  @ApiModelProperty(example = "1453449599999", value = "")
  private Long time;
 /**
   * Get X
   * @return X
  **/
  @JsonProperty("X")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public MachineHistoryResponseVibrations X(Double X) {
    this.X = X;
    return this;
  }

 /**
   * Get Y
   * @return Y
  **/
  @JsonProperty("Y")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public MachineHistoryResponseVibrations Y(Double Y) {
    this.Y = Y;
    return this;
  }

 /**
   * Get Z
   * @return Z
  **/
  @JsonProperty("Z")
  public Double getZ() {
    return Z;
  }

  public void setZ(Double Z) {
    this.Z = Z;
  }

  public MachineHistoryResponseVibrations Z(Double Z) {
    this.Z = Z;
    return this;
  }

 /**
   * Get time
   * @return time
  **/
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public MachineHistoryResponseVibrations time(Long time) {
    this.time = time;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

