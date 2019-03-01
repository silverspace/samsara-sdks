package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FleetVehicleResponseVehicleInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class FleetVehicleResponseVehicleInfo   {
  @JsonProperty("make")
  private String make = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("vin")
  private String vin = null;

  @JsonProperty("year")
  private Long year = null;

  public FleetVehicleResponseVehicleInfo make(String make) {
    this.make = make;
    return this;
  }

  /**
   * Make of the vehicle.
   * @return make
  **/
  @ApiModelProperty(example = "Honda", value = "Make of the vehicle.")


  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public FleetVehicleResponseVehicleInfo model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Model of the Vehicle.
   * @return model
  **/
  @ApiModelProperty(example = "Odyssey", value = "Model of the Vehicle.")


  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FleetVehicleResponseVehicleInfo vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Vehicle Identification Number.
   * @return vin
  **/
  @ApiModelProperty(example = "1FUJA6BD31LJ09646", value = "Vehicle Identification Number.")


  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public FleetVehicleResponseVehicleInfo year(Long year) {
    this.year = year;
    return this;
  }

  /**
   * Year of the vehicle.
   * @return year
  **/
  @ApiModelProperty(example = "1997", value = "Year of the vehicle.")


  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
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
    return Objects.equals(this.make, fleetVehicleResponseVehicleInfo.make) &&
        Objects.equals(this.model, fleetVehicleResponseVehicleInfo.model) &&
        Objects.equals(this.vin, fleetVehicleResponseVehicleInfo.vin) &&
        Objects.equals(this.year, fleetVehicleResponseVehicleInfo.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model, vin, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetVehicleResponseVehicleInfo {\n");
    
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

