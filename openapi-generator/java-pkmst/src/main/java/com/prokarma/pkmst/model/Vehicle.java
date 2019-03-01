package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A vehicle object.
 */
@ApiModel(description = "A vehicle object.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-03-01T05:34:34.656Z[GMT]")

public class Vehicle   {
  @JsonProperty("engineHours")
  private Long engineHours;

  @JsonProperty("fuelLevelPercent")
  private Double fuelLevelPercent;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("note")
  private String note;

  @JsonProperty("odometerMeters")
  private Long odometerMeters;

  @JsonProperty("vin")
  private String vin;

  public Vehicle engineHours(Long engineHours) {
    this.engineHours = engineHours;
    return this;
  }

   /**
   * Total engine hours for the vehicle.
   * @return engineHours
  **/
  @ApiModelProperty(example = "1500", value = "Total engine hours for the vehicle.")
  public Long getEngineHours() {
    return engineHours;
  }

  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

  public Vehicle fuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
    return this;
  }

   /**
   * The fuel level of the vehicle as a percentage. (0.0 to 1.0)
   * @return fuelLevelPercent
  **/
  @ApiModelProperty(example = "0.3", value = "The fuel level of the vehicle as a percentage. (0.0 to 1.0)")
  public Double getFuelLevelPercent() {
    return fuelLevelPercent;
  }

  public void setFuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
  }

  public Vehicle id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the vehicle.
   * @return id
  **/
  @ApiModelProperty(example = "112", required = true, value = "ID of the vehicle.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Vehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the vehicle.
   * @return name
  **/
  @ApiModelProperty(example = "Truck A7", value = "Name of the vehicle.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(example = "Red truck 2015 M16", value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Vehicle odometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
    return this;
  }

   /**
   * The number of meters reported by the odometer.
   * @return odometerMeters
  **/
  @ApiModelProperty(example = "60130000", value = "The number of meters reported by the odometer.")
  public Long getOdometerMeters() {
    return odometerMeters;
  }

  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

  public Vehicle vin(String vin) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.engineHours, vehicle.engineHours) &&
        Objects.equals(this.fuelLevelPercent, vehicle.fuelLevelPercent) &&
        Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.name, vehicle.name) &&
        Objects.equals(this.note, vehicle.note) &&
        Objects.equals(this.odometerMeters, vehicle.odometerMeters) &&
        Objects.equals(this.vin, vehicle.vin);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

