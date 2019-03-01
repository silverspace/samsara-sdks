package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A vehicle object.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @NotNull
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

