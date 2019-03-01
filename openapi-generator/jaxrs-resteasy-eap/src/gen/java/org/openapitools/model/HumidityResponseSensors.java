package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class HumidityResponseSensors   {
  

  private String name;

  private Integer humidity;

  private Long id;

  /**
   * Name of the sensor.
   **/
  
  @ApiModelProperty(example = "Freezer Humidity Sensor", value = "Name of the sensor.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Currently reported relative humidity in percent, from 0-100.
   **/
  
  @ApiModelProperty(example = "53", value = "Currently reported relative humidity in percent, from 0-100.")
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }
  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  /**
   * ID of the sensor.
   **/
  
  @ApiModelProperty(example = "122", value = "ID of the sensor.")
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

