package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TemperatureResponseSensors   {
  
  private Integer probeTemperature;
  private String name;
  private Long id;
  private Integer ambientTemperature;

  public TemperatureResponseSensors () {

  }

  public TemperatureResponseSensors (Integer probeTemperature, String name, Long id, Integer ambientTemperature) {
    this.probeTemperature = probeTemperature;
    this.name = name;
    this.id = id;
    this.ambientTemperature = ambientTemperature;
  }

    
  @JsonProperty("probeTemperature")
  public Integer getProbeTemperature() {
    return probeTemperature;
  }
  public void setProbeTemperature(Integer probeTemperature) {
    this.probeTemperature = probeTemperature;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("ambientTemperature")
  public Integer getAmbientTemperature() {
    return ambientTemperature;
  }
  public void setAmbientTemperature(Integer ambientTemperature) {
    this.ambientTemperature = ambientTemperature;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
