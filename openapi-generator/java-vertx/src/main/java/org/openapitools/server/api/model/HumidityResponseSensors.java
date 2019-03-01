package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class HumidityResponseSensors   {
  
  private String name;
  private Integer humidity;
  private Long id;

  public HumidityResponseSensors () {

  }

  public HumidityResponseSensors (String name, Integer humidity, Long id) {
    this.name = name;
    this.humidity = humidity;
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }
  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumidityResponseSensors humidityResponseSensors = (HumidityResponseSensors) o;
    return Objects.equals(name, humidityResponseSensors.name) &&
        Objects.equals(humidity, humidityResponseSensors.humidity) &&
        Objects.equals(id, humidityResponseSensors.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, humidity, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumidityResponseSensors {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
