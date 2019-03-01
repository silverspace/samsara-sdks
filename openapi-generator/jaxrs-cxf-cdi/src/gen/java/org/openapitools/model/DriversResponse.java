package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Driver;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class DriversResponse   {
  
  private List<Driver> drivers = null;


  /**
   **/
  public DriversResponse drivers(List<Driver> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("drivers")
  public List<Driver> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<Driver> drivers) {
    this.drivers = drivers;
  }

  public DriversResponse addDriversItem(Driver driversItem) {
    if (this.drivers == null) {
      this.drivers = new ArrayList<Driver>();
    }
    this.drivers.add(driversItem);
    return this;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriversResponse driversResponse = (DriversResponse) o;
    return Objects.equals(drivers, driversResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

