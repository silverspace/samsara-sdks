package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



public class FleetVehicleResponseVehicleInfo   {
  
  private @Valid Long year;
  private @Valid String model;
  private @Valid String vin;
  private @Valid String make;

  /**
   * Year of the vehicle.
   **/
  public FleetVehicleResponseVehicleInfo year(Long year) {
    this.year = year;
    return this;
  }

  
  @ApiModelProperty(example = "1997", value = "Year of the vehicle.")
  @JsonProperty("year")
  public Long getYear() {
    return year;
  }
  public void setYear(Long year) {
    this.year = year;
  }

  /**
   * Model of the Vehicle.
   **/
  public FleetVehicleResponseVehicleInfo model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(example = "Odyssey", value = "Model of the Vehicle.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Vehicle Identification Number.
   **/
  public FleetVehicleResponseVehicleInfo vin(String vin) {
    this.vin = vin;
    return this;
  }

  
  @ApiModelProperty(example = "1FUJA6BD31LJ09646", value = "Vehicle Identification Number.")
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }

  /**
   * Make of the vehicle.
   **/
  public FleetVehicleResponseVehicleInfo make(String make) {
    this.make = make;
    return this;
  }

  
  @ApiModelProperty(example = "Honda", value = "Make of the vehicle.")
  @JsonProperty("make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo = (FleetVehicleResponseVehicleInfo) o;
    return Objects.equals(year, fleetVehicleResponseVehicleInfo.year) &&
        Objects.equals(model, fleetVehicleResponseVehicleInfo.model) &&
        Objects.equals(vin, fleetVehicleResponseVehicleInfo.vin) &&
        Objects.equals(make, fleetVehicleResponseVehicleInfo.make);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, model, vin, make);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleResponseVehicleInfo {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
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

