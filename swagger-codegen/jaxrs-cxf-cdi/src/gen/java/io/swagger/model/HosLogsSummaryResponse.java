package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.HosLogsSummaryResponseDrivers;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class HosLogsSummaryResponse   {
  
  private List<HosLogsSummaryResponseDrivers> drivers = new ArrayList<HosLogsSummaryResponseDrivers>();

  /**
   **/
  public HosLogsSummaryResponse drivers(List<HosLogsSummaryResponseDrivers> drivers) {
    this.drivers = drivers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("drivers")
  public List<HosLogsSummaryResponseDrivers> getDrivers() {
    return drivers;
  }
  public void setDrivers(List<HosLogsSummaryResponseDrivers> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HosLogsSummaryResponse hosLogsSummaryResponse = (HosLogsSummaryResponse) o;
    return Objects.equals(drivers, hosLogsSummaryResponse.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HosLogsSummaryResponse {\n");
    
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

