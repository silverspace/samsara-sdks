package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Driver;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriversResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<Driver> drivers = null;
 /**
   * Get drivers
   * @return drivers
  **/
  @JsonProperty("drivers")
  public List<Driver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<Driver> drivers) {
    this.drivers = drivers;
  }

  public DriversResponse drivers(List<Driver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public DriversResponse addDriversItem(Driver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriversResponse {\n");
    
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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

