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

public class TemperatureResponseSensors  {
  
  @ApiModelProperty(example = "-20145", value = "Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.")
 /**
   * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
  **/
  private Integer probeTemperature;

  @ApiModelProperty(example = "Freezer Temp Sensor", value = "Name of the sensor.")
 /**
   * Name of the sensor.
  **/
  private String name;

  @ApiModelProperty(example = "122", value = "ID of the sensor.")
 /**
   * ID of the sensor.
  **/
  private Long id;

  @ApiModelProperty(example = "11057", value = "Currently reported ambient temperature in millidegrees celsius.")
 /**
   * Currently reported ambient temperature in millidegrees celsius.
  **/
  private Integer ambientTemperature;
 /**
   * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
   * @return probeTemperature
  **/
  @JsonProperty("probeTemperature")
  public Integer getProbeTemperature() {
    return probeTemperature;
  }

  public void setProbeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
  }

  public TemperatureResponseSensors probeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
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

  public TemperatureResponseSensors name(String name) {
    this.name = name;
    return this;
  }

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

  public TemperatureResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Currently reported ambient temperature in millidegrees celsius.
   * @return ambientTemperature
  **/
  @JsonProperty("ambientTemperature")
  public Integer getAmbientTemperature() {
    return ambientTemperature;
  }

  public void setAmbientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
  }

  public TemperatureResponseSensors ambientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureResponseSensors {\n");
    
    sb.append("    probeTemperature: ").append(toIndentedString(probeTemperature)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ambientTemperature: ").append(toIndentedString(ambientTemperature)).append("\n");
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

