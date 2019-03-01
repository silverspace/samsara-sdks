package io.swagger.model;

import io.swagger.annotations.ApiModel;
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

/**
  * A vehicle object.
 **/
@ApiModel(description="A vehicle object.")
public class Vehicle  {
  
  @ApiModelProperty(example = "1500", value = "Total engine hours for the vehicle.")
 /**
   * Total engine hours for the vehicle.
  **/
  private Long engineHours = null;

  @ApiModelProperty(example = "0.3", value = "The fuel level of the vehicle as a percentage. (0.0 to 1.0)")
 /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
  **/
  private Double fuelLevelPercent = null;

  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
 /**
   * ID of the vehicle.
  **/
  private Long id = null;

  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
 /**
   * Name of the vehicle.
  **/
  private String name = null;

  @ApiModelProperty(example = "Red truck 2015 M16", value = "")
  private String note = null;

  @ApiModelProperty(example = "60130000", value = "The number of meters reported by the odometer.")
 /**
   * The number of meters reported by the odometer.
  **/
  private Long odometerMeters = null;

  @ApiModelProperty(example = "1FUJA6BD31LJ09646", value = "Vehicle Identification Number.")
 /**
   * Vehicle Identification Number.
  **/
  private String vin = null;
 /**
   * Total engine hours for the vehicle.
   * @return engineHours
  **/
  @JsonProperty("engineHours")
  public Long getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  public Vehicle engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

 /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
   * @return fuelLevelPercent
  **/
  @JsonProperty("fuelLevelPercent")
  public Double getFuelLevelPercent() {
    return fuelLevelPercent;
  }

  public void setFuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
  }

  public Vehicle fuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
    return this;
  }

 /**
   * ID of the vehicle.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Vehicle id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Name of the vehicle.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get note
   * @return note
  **/
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Vehicle note(String note) {
    this.note = note;
    return this;
  }

 /**
   * The number of meters reported by the odometer.
   * @return odometerMeters
  **/
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }

  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  public Vehicle odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
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

  public Vehicle vin(String vin) {
    this.vin = vin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    engineHours: ").append(toIndentedString(engineHours)).append("\n");
    sb.append("    fuelLevelPercent: ").append(toIndentedString(fuelLevelPercent)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    odometerMeters: ").append(toIndentedString(odometerMeters)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
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

