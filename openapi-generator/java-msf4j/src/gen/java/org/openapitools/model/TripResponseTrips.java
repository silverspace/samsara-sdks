package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TripResponseEndCoordinates;
import org.openapitools.model.TripResponseStartCoordinates;

/**
 * TripResponseTrips
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
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
  @ApiModelProperty(example = "210430500", value = "Odometer reading at the end of the trip.")
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
  @ApiModelProperty(example = "2500", value = "Length of the trip in meters.")
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
  @ApiModelProperty(example = "1462881998034", value = "End of the trip in UNIX milliseconds.")
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
  @ApiModelProperty(example = "1462878398034", value = "Beginning of the trip in UNIX milliseconds.")
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
  @ApiModelProperty(example = "75700", value = "Amount in milliliters of fuel consumed on this trip.")
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
  @ApiModelProperty(example = "Ramen Tatsunoya", value = "Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "210430450", value = "Odometer reading at the beginning of the trip.")
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
  @ApiModelProperty(example = "719", value = "ID of the driver.")
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
  @ApiModelProperty(example = "16 N Fair Oaks Ave, Pasadena, CA 91103", value = "Geocoded street address of start (latitude, longitude) coordinates.")
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
  @ApiModelProperty(example = "32000", value = "Length in meters trip spent on toll roads.")
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
  @ApiModelProperty(example = "Winchell's Donuts House", value = "Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.")
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
  @ApiModelProperty(example = "571 S Lake Ave, Pasadena, CA 91101", value = "Geocoded street address of start (latitude, longitude) coordinates.")
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
    return Objects.equals(this.endOdometer, tripResponseTrips.endOdometer) &&
        Objects.equals(this.distanceMeters, tripResponseTrips.distanceMeters) &&
        Objects.equals(this.endMs, tripResponseTrips.endMs) &&
        Objects.equals(this.startMs, tripResponseTrips.startMs) &&
        Objects.equals(this.fuelConsumedMl, tripResponseTrips.fuelConsumedMl) &&
        Objects.equals(this.startAddress, tripResponseTrips.startAddress) &&
        Objects.equals(this.startCoordinates, tripResponseTrips.startCoordinates) &&
        Objects.equals(this.endCoordinates, tripResponseTrips.endCoordinates) &&
        Objects.equals(this.startOdometer, tripResponseTrips.startOdometer) &&
        Objects.equals(this.driverId, tripResponseTrips.driverId) &&
        Objects.equals(this.startLocation, tripResponseTrips.startLocation) &&
        Objects.equals(this.tollMeters, tripResponseTrips.tollMeters) &&
        Objects.equals(this.endAddress, tripResponseTrips.endAddress) &&
        Objects.equals(this.endLocation, tripResponseTrips.endLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endOdometer, distanceMeters, endMs, startMs, fuelConsumedMl, startAddress, startCoordinates, endCoordinates, startOdometer, driverId, startLocation, tollMeters, endAddress, endLocation);
  }

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

