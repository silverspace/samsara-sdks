package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about a sensor.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Sensor   {
  
  private Long id;
  private String macAddress;
  private String name;

  public Sensor () {

  }

  public Sensor (Long id, String macAddress, String name) {
    this.id = id;
    this.macAddress = macAddress;
    this.name = name;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sensor sensor = (Sensor) o;
    return Objects.equals(id, sensor.id) &&
        Objects.equals(macAddress, sensor.macAddress) &&
        Objects.equals(name, sensor.name);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
