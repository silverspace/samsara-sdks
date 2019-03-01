package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class HumidityResponseSensors   {
  
  private String name;

  private Integer humidity;

  private Long id;


  /**
   * Name of the sensor.
   **/
  public HumidityResponseSensors name(String name) {
    this.name = name;
    return this;
  }

  
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
  public HumidityResponseSensors humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

  
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
  public HumidityResponseSensors id(Long id) {
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



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

