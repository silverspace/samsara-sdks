package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-03-01T05:34:19.229Z[GMT]")
public class TemperatureResponseSensors   {
  @JsonProperty("probeTemperature")
  private Integer probeTemperature;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("ambientTemperature")
  private Integer ambientTemperature;

  /**
   * Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
   **/
  public TemperatureResponseSensors probeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
    return this;
  }

  
  @ApiModelProperty(example = "-20145", value = "Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.")
  @JsonProperty("probeTemperature")
  public Integer getProbeTemperature() {
    return probeTemperature;
  }
  public void setProbeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
  }

  /**
   * Name of the sensor.
   **/
  public TemperatureResponseSensors name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Freezer Temp Sensor", value = "Name of the sensor.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID of the sensor.
   **/
  public TemperatureResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "122", value = "ID of the sensor.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Currently reported ambient temperature in millidegrees celsius.
   **/
  public TemperatureResponseSensors ambientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
    return this;
  }

  
  @ApiModelProperty(example = "11057", value = "Currently reported ambient temperature in millidegrees celsius.")
  @JsonProperty("ambientTemperature")
  public Integer getAmbientTemperature() {
    return ambientTemperature;
  }
  public void setAmbientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureResponseSensors temperatureResponseSensors = (TemperatureResponseSensors) o;
    return Objects.equals(probeTemperature, temperatureResponseSensors.probeTemperature) &&
        Objects.equals(name, temperatureResponseSensors.name) &&
        Objects.equals(id, temperatureResponseSensors.id) &&
        Objects.equals(ambientTemperature, temperatureResponseSensors.ambientTemperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(probeTemperature, name, id, ambientTemperature);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

