package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * HumidityResponseSensors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class HumidityResponseSensors   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("humidity")
  private Integer humidity;

  @JsonProperty("id")
  private Long id;

  public HumidityResponseSensors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the sensor.
   * @return name
  **/
  @ApiModelProperty(example = "Freezer Humidity Sensor", value = "Name of the sensor.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HumidityResponseSensors humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Currently reported relative humidity in percent, from 0-100.
   * @return humidity
  **/
  @ApiModelProperty(example = "53", value = "Currently reported relative humidity in percent, from 0-100.")
  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public HumidityResponseSensors id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the sensor.
   * @return id
  **/
  @ApiModelProperty(example = "122", value = "ID of the sensor.")
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
    return Objects.equals(this.name, humidityResponseSensors.name) &&
        Objects.equals(this.humidity, humidityResponseSensors.humidity) &&
        Objects.equals(this.id, humidityResponseSensors.id);
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

