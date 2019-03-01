package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A vehicle object.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Vehicle   {
  
  private Long engineHours;
  private Double fuelLevelPercent;
  private Long id;
  private String name;
  private String note;
  private Long odometerMeters;
  private String vin;

  public Vehicle () {

  }

  public Vehicle (Long engineHours, Double fuelLevelPercent, Long id, String name, String note, Long odometerMeters, String vin) {
    this.engineHours = engineHours;
    this.fuelLevelPercent = fuelLevelPercent;
    this.id = id;
    this.name = name;
    this.note = note;
    this.odometerMeters = odometerMeters;
    this.vin = vin;
  }

    
  @JsonProperty("engineHours")
  public Long getEngineHours() {
    return engineHours;
  }
  public void setEngineHours(Long engineHours) {
    this.engineHours = engineHours;
  }

    
  @JsonProperty("fuelLevelPercent")
  public Double getFuelLevelPercent() {
    return fuelLevelPercent;
  }
  public void setFuelLevelPercent(Double fuelLevelPercent) {
    this.fuelLevelPercent = fuelLevelPercent;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }

    
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }
  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

    
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
