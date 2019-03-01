package io.swagger.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Contains information about a sensor.
 **/
@ApiModel(description="Contains information about a sensor.")
public class Sensor  {
  
  @ApiModelProperty(example = "123", required = true, value = "ID of the sensor.")
 /**
   * ID of the sensor.
  **/
  private Long id = null;

  @ApiModelProperty(example = "11:11:11:11:11:11", value = "MAC address of the sensor.")
 /**
   * MAC address of the sensor.
  **/
  private String macAddress = null;

  @ApiModelProperty(example = "Freezer ABC", value = "Name of the sensor.")
 /**
   * Name of the sensor.
  **/
  private String name = null;
 /**
   * ID of the sensor.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Sensor id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * MAC address of the sensor.
   * @return macAddress
  **/
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public Sensor macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

 /**
   * Name of the sensor.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sensor name(String name) {
    this.name = name;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

