package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Contains information about a sensor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class Sensor   {
  

  private Long id;

  private String macAddress;

  private String name;

  /**
   * ID of the sensor.
   **/
  
  @ApiModelProperty(example = "123", required = true, value = "ID of the sensor.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * MAC address of the sensor.
   **/
  
  @ApiModelProperty(example = "11:11:11:11:11:11", value = "MAC address of the sensor.")
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  /**
   * Name of the sensor.
   **/
  
  @ApiModelProperty(example = "Freezer ABC", value = "Name of the sensor.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sensor sensor = (Sensor) o;
    return Objects.equals(id, sensor.id) &&
        Objects.equals(macAddress, sensor.macAddress) &&
        Objects.equals(name, sensor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, macAddress, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sensor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

