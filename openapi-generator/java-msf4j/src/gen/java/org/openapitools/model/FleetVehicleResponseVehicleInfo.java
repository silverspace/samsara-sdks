package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FleetVehicleResponseVehicleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public class FleetVehicleResponseVehicleInfo   {
  @JsonProperty("year")
  private Long year;

  @JsonProperty("model")
  private String model;

  @JsonProperty("vin")
  private String vin;

  @JsonProperty("make")
  private String make;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetVehicleResponseVehicleInfo fleetVehicleResponseVehicleInfo = (FleetVehicleResponseVehicleInfo) o;
    return Objects.equals(this.year, fleetVehicleResponseVehicleInfo.year) &&
        Objects.equals(this.model, fleetVehicleResponseVehicleInfo.model) &&
        Objects.equals(this.vin, fleetVehicleResponseVehicleInfo.vin) &&
        Objects.equals(this.make, fleetVehicleResponseVehicleInfo.make);
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

