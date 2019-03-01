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

public class FleetVehicleResponseVehicleInfo  {
  
  @ApiModelProperty(example = "Honda", value = "Make of the vehicle.")
 /**
   * Make of the vehicle.
  **/
  private String make = null;

  @ApiModelProperty(example = "Odyssey", value = "Model of the Vehicle.")
 /**
   * Model of the Vehicle.
  **/
  private String model = null;

  @ApiModelProperty(example = "1FUJA6BD31LJ09646", value = "Vehicle Identification Number.")
 /**
   * Vehicle Identification Number.
  **/
  private String vin = null;

  @ApiModelProperty(example = "1997", value = "Year of the vehicle.")
 /**
   * Year of the vehicle.
  **/
  private Long year = null;
 /**
   * Make of the vehicle.
   * @return make
  **/
  @JsonProperty("make")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public FleetVehicleResponseVehicleInfo make(String make) {
    this.make = make;
    return this;
  }

 /**
   * Model of the Vehicle.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FleetVehicleResponseVehicleInfo model(String model) {
    this.model = model;
    return this;
  }

 /**
   * Vehicle Identification Number.
   * @return vin
  **/
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public FleetVehicleResponseVehicleInfo vin(String vin) {
    this.vin = vin;
    return this;
  }

 /**
   * Year of the vehicle.
   * @return year
  **/
  @JsonProperty("year")
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }

  public FleetVehicleResponseVehicleInfo year(Long year) {
    this.year = year;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

