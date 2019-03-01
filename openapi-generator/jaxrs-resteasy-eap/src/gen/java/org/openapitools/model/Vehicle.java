package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A vehicle object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-03-01T05:35:34.911Z[GMT]")
public class Vehicle   {
  

  private Long engineHours;

  private Double fuelLevelPercent;

  private Long id;

  private String name;

  private String note;

  private Long odometerMeters;

  private String vin;

  /**
   * Total engine hours for the vehicle.
   **/
  
  @ApiModelProperty(example = "1500", value = "Total engine hours for the vehicle.")
  @JsonProperty("engineHours")
  public Long getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
   **/
  
  @ApiModelProperty(example = "0.3", value = "The fuel level of the vehicle as a percentage. (0.0 to 1.0)")
  @JsonProperty("fuelLevelPercent")
  public Double getFuelLevelPercent() {
    return fuelLevelPercent;
  }
  public void setFuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
  }

  /**
   * ID of the vehicle.
   **/
  
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  @JsonProperty("id")
  @NotNull
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Name of the vehicle.
   **/
  
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(example = "Red truck 2015 M16", value = "")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The number of meters reported by the odometer.
   **/
  
  @ApiModelProperty(example = "60130000", value = "The number of meters reported by the odometer.")
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }
  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  /**
   * Vehicle Identification Number.
   **/
  
  @ApiModelProperty(example = "1FUJA6BD31LJ09646", value = "Vehicle Identification Number.")
  @JsonProperty("vin")
  public String getVin() {
    return vin;
  }
  public void setVin(String vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(engineHours, vehicle.engineHours) &&
        Objects.equals(fuelLevelPercent, vehicle.fuelLevelPercent) &&
        Objects.equals(id, vehicle.id) &&
        Objects.equals(name, vehicle.name) &&
        Objects.equals(note, vehicle.note) &&
        Objects.equals(odometerMeters, vehicle.odometerMeters) &&
        Objects.equals(vin, vehicle.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineHours, fuelLevelPercent, id, name, note, odometerMeters, vin);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

