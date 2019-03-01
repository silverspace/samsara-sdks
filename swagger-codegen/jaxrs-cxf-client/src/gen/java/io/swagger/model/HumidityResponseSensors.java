package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HumidityResponseSensors  {
  
  @ApiModelProperty(example = "53", value = "Currently reported relative humidity in percent, from 0-100.")
 /**
   * Currently reported relative humidity in percent, from 0-100.
  **/
  private Integer humidity = null;

  @ApiModelProperty(example = "122", value = "ID of the sensor.")
 /**
   * ID of the sensor.
  **/
  private Long id = null;

  @ApiModelProperty(example = "Freezer Humidity Sensor", value = "Name of the sensor.")
 /**
   * Name of the sensor.
  **/
  private String name = null;
 /**
   * Currently reported relative humidity in percent, from 0-100.
   * @return humidity
  **/
  @JsonProperty("humidity")
  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public HumidityResponseSensors humidity(Integer humidity) {
    this.humidity = humidity;
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

  public HumidityResponseSensors id(Long id) {
    this.id = id;
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

  public HumidityResponseSensors name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumidityResponseSensors {\n");
    
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

