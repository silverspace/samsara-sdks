package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a sensor.
 */
@ApiModel(description = "Contains information about a sensor.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class Sensor   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("macAddress")
  private String macAddress;

  @JsonProperty("name")
  private String name;

  public Sensor id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the sensor.
   * @return id
  **/
  @ApiModelProperty(example = "123", required = true, value = "ID of the sensor.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Sensor macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * MAC address of the sensor.
   * @return macAddress
  **/
  @ApiModelProperty(example = "11:11:11:11:11:11", value = "MAC address of the sensor.")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public Sensor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sensor.
   * @return name
  **/
  @ApiModelProperty(example = "Freezer ABC", value = "Name of the sensor.")
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
    return Objects.equals(this.id, sensor.id) &&
        Objects.equals(this.macAddress, sensor.macAddress) &&
        Objects.equals(this.name, sensor.name);
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

