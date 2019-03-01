package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Contains information about a sensor.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Contains information about a sensor.")

public class Sensor   {
  
  private @Valid Long id = null;
  private @Valid String macAddress = null;
  private @Valid String name = null;

  /**
   * ID of the sensor.
   **/
  public Sensor id(Long id) {
    this.id = id;
    return this;
  }

  
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
  public Sensor macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  
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
  public Sensor name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Freezer ABC", value = "Name of the sensor.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

