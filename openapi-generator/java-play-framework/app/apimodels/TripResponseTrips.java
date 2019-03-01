package apimodels;

import apimodels.TripResponseEndCoordinates;
import apimodels.TripResponseStartCoordinates;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * TripResponseTrips
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TripResponseTrips   {
  @JsonProperty("endOdometer")
  private Integer endOdometer;

  @JsonProperty("distanceMeters")
  private Integer distanceMeters;

  @JsonProperty("endMs")
  private Integer endMs;

  @JsonProperty("startMs")
  private Integer startMs;

  @JsonProperty("fuelConsumedMl")
  private Integer fuelConsumedMl;

  @JsonProperty("startAddress")
  private String startAddress;

  @JsonProperty("startCoordinates")
  private TripResponseStartCoordinates startCoordinates = null;

  @JsonProperty("endCoordinates")
  private TripResponseEndCoordinates endCoordinates = null;

  @JsonProperty("startOdometer")
  private Integer startOdometer;

  @JsonProperty("driverId")
  private Integer driverId;

  @JsonProperty("startLocation")
  private String startLocation;

  @JsonProperty("tollMeters")
  private Integer tollMeters;

  @JsonProperty("endAddress")
  private String endAddress;

  @JsonProperty("endLocation")
  private String endLocation;

  public TripResponseTrips endOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
    return this;
  }

   /**
   * Odometer reading at the end of the trip.
   * @return endOdometer
  **/
    public Integer getEndOdometer() {
    return endOdometer;
  }

  public void setEndOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
  }

  public TripResponseTrips distanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

   /**
   * Length of the trip in meters.
   * @return distanceMeters
  **/
    public Integer getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  public TripResponseTrips endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

   /**
   * End of the trip in UNIX milliseconds.
   * @return endMs
  **/
    public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public TripResponseTrips startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

   /**
   * Beginning of the trip in UNIX milliseconds.
   * @return startMs
  **/
    public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public TripResponseTrips fuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
    return this;
  }

   /**
   * Amount in milliliters of fuel consumed on this trip.
   * @return fuelConsumedMl
  **/
    public Integer getFuelConsumedMl() {
    return fuelConsumedMl;
  }

  public void setFuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
  }

  public TripResponseTrips startAddress(String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
   * @return startAddress
  **/
    public String getStartAddress() {
    return startAddress;
  }

  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  public TripResponseTrips startCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
    return this;
  }

   /**
   * Get startCoordinates
   * @return startCoordinates
  **/
  @Valid
  public TripResponseStartCoordinates getStartCoordinates() {
    return startCoordinates;
  }

  public void setStartCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
  }

  public TripResponseTrips endCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
    return this;
  }

   /**
   * Get endCoordinates
   * @return endCoordinates
  **/
  @Valid
  public TripResponseEndCoordinates getEndCoordinates() {
    return endCoordinates;
  }

  public void setEndCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
  }

  public TripResponseTrips startOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
    return this;
  }

   /**
   * Odometer reading at the beginning of the trip.
   * @return startOdometer
  **/
    public Integer getStartOdometer() {
    return startOdometer;
  }

  public void setStartOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
  }

  public TripResponseTrips driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver.
   * @return driverId
  **/
    public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public TripResponseTrips startLocation(String startLocation) {
    this.startLocation = startLocation;
    return this;
  }

   /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return startLocation
  **/
    public String getStartLocation() {
    return startLocation;
  }

  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }

  public TripResponseTrips tollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
    return this;
  }

   /**
   * Length in meters trip spent on toll roads.
   * @return tollMeters
  **/
    public Integer getTollMeters() {
    return tollMeters;
  }

  public void setTollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
  }

  public TripResponseTrips endAddress(String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
   * @return endAddress
  **/
    public String getEndAddress() {
    return endAddress;
  }

  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  public TripResponseTrips endLocation(String endLocation) {
    this.endLocation = endLocation;
    return this;
  }

   /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return endLocation
  **/
    public String getEndLocation() {
    return endLocation;
  }

  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripResponseTrips tripResponseTrips = (TripResponseTrips) o;
    return Objects.equals(endOdometer, tripResponseTrips.endOdometer) &&
        Objects.equals(distanceMeters, tripResponseTrips.distanceMeters) &&
        Objects.equals(endMs, tripResponseTrips.endMs) &&
        Objects.equals(startMs, tripResponseTrips.startMs) &&
        Objects.equals(fuelConsumedMl, tripResponseTrips.fuelConsumedMl) &&
        Objects.equals(startAddress, tripResponseTrips.startAddress) &&
        Objects.equals(startCoordinates, tripResponseTrips.startCoordinates) &&
        Objects.equals(endCoordinates, tripResponseTrips.endCoordinates) &&
        Objects.equals(startOdometer, tripResponseTrips.startOdometer) &&
        Objects.equals(driverId, tripResponseTrips.driverId) &&
        Objects.equals(startLocation, tripResponseTrips.startLocation) &&
        Objects.equals(tollMeters, tripResponseTrips.tollMeters) &&
        Objects.equals(endAddress, tripResponseTrips.endAddress) &&
        Objects.equals(endLocation, tripResponseTrips.endLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endOdometer, distanceMeters, endMs, startMs, fuelConsumedMl, startAddress, startCoordinates, endCoordinates, startOdometer, driverId, startLocation, tollMeters, endAddress, endLocation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripResponseTrips {\n");
    
    sb.append("    endOdometer: ").append(toIndentedString(endOdometer)).append("\n");
    sb.append("    distanceMeters: ").append(toIndentedString(distanceMeters)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    fuelConsumedMl: ").append(toIndentedString(fuelConsumedMl)).append("\n");
    sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
    sb.append("    startCoordinates: ").append(toIndentedString(startCoordinates)).append("\n");
    sb.append("    endCoordinates: ").append(toIndentedString(endCoordinates)).append("\n");
    sb.append("    startOdometer: ").append(toIndentedString(startOdometer)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    startLocation: ").append(toIndentedString(startLocation)).append("\n");
    sb.append("    tollMeters: ").append(toIndentedString(tollMeters)).append("\n");
    sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
    sb.append("    endLocation: ").append(toIndentedString(endLocation)).append("\n");
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

