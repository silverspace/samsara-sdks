package io.swagger.model;

import io.swagger.model.TripResponseEndCoordinates;
import io.swagger.model.TripResponseStartCoordinates;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TripResponseTrips   {
  
  private @Valid Integer distanceMeters = null;
  private @Valid Integer driverId = null;
  private @Valid String endAddress = null;
  private @Valid TripResponseEndCoordinates endCoordinates = null;
  private @Valid String endLocation = null;
  private @Valid Integer endMs = null;
  private @Valid Integer endOdometer = null;
  private @Valid Integer fuelConsumedMl = null;
  private @Valid String startAddress = null;
  private @Valid TripResponseStartCoordinates startCoordinates = null;
  private @Valid String startLocation = null;
  private @Valid Integer startMs = null;
  private @Valid Integer startOdometer = null;
  private @Valid Integer tollMeters = null;

  /**
   * Length of the trip in meters.
   **/
  public TripResponseTrips distanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

  
  @ApiModelProperty(example = "2500", value = "Length of the trip in meters.")
  @JsonProperty("distanceMeters")
  public Integer getDistanceMeters() {
    return distanceMeters;
  }
  public void setDistanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  /**
   * ID of the driver.
   **/
  public TripResponseTrips driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

  
  @ApiModelProperty(example = "719", value = "ID of the driver.")
  @JsonProperty("driverId")
  public Integer getDriverId() {
    return driverId;
  }
  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
   **/
  public TripResponseTrips endAddress(String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

  
  @ApiModelProperty(example = "Winchell's Donuts House", value = "Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.")
  @JsonProperty("endAddress")
  public String getEndAddress() {
    return endAddress;
  }
  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  /**
   **/
  public TripResponseTrips endCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("endCoordinates")
  public TripResponseEndCoordinates getEndCoordinates() {
    return endCoordinates;
  }
  public void setEndCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
  }

  /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   **/
  public TripResponseTrips endLocation(String endLocation) {
    this.endLocation = endLocation;
    return this;
  }

  
  @ApiModelProperty(example = "571 S Lake Ave, Pasadena, CA 91101", value = "Geocoded street address of start (latitude, longitude) coordinates.")
  @JsonProperty("endLocation")
  public String getEndLocation() {
    return endLocation;
  }
  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }

  /**
   * End of the trip in UNIX milliseconds.
   **/
  public TripResponseTrips endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462881998034", value = "End of the trip in UNIX milliseconds.")
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  /**
   * Odometer reading at the end of the trip.
   **/
  public TripResponseTrips endOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
    return this;
  }

  
  @ApiModelProperty(example = "210430500", value = "Odometer reading at the end of the trip.")
  @JsonProperty("endOdometer")
  public Integer getEndOdometer() {
    return endOdometer;
  }
  public void setEndOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
  }

  /**
   * Amount in milliliters of fuel consumed on this trip.
   **/
  public TripResponseTrips fuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
    return this;
  }

  
  @ApiModelProperty(example = "75700", value = "Amount in milliliters of fuel consumed on this trip.")
  @JsonProperty("fuelConsumedMl")
  public Integer getFuelConsumedMl() {
    return fuelConsumedMl;
  }
  public void setFuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
  }

  /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
   **/
  public TripResponseTrips startAddress(String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

  
  @ApiModelProperty(example = "Ramen Tatsunoya", value = "Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.")
  @JsonProperty("startAddress")
  public String getStartAddress() {
    return startAddress;
  }
  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  /**
   **/
  public TripResponseTrips startCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("startCoordinates")
  public TripResponseStartCoordinates getStartCoordinates() {
    return startCoordinates;
  }
  public void setStartCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
  }

  /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   **/
  public TripResponseTrips startLocation(String startLocation) {
    this.startLocation = startLocation;
    return this;
  }

  
  @ApiModelProperty(example = "16 N Fair Oaks Ave, Pasadena, CA 91103", value = "Geocoded street address of start (latitude, longitude) coordinates.")
  @JsonProperty("startLocation")
  public String getStartLocation() {
    return startLocation;
  }
  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }

  /**
   * Beginning of the trip in UNIX milliseconds.
   **/
  public TripResponseTrips startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  
  @ApiModelProperty(example = "1462878398034", value = "Beginning of the trip in UNIX milliseconds.")
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  /**
   * Odometer reading at the beginning of the trip.
   **/
  public TripResponseTrips startOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
    return this;
  }

  
  @ApiModelProperty(example = "210430450", value = "Odometer reading at the beginning of the trip.")
  @JsonProperty("startOdometer")
  public Integer getStartOdometer() {
    return startOdometer;
  }
  public void setStartOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
  }

  /**
   * Length in meters trip spent on toll roads.
   **/
  public TripResponseTrips tollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
    return this;
  }

  
  @ApiModelProperty(example = "32000", value = "Length in meters trip spent on toll roads.")
  @JsonProperty("tollMeters")
  public Integer getTollMeters() {
    return tollMeters;
  }
  public void setTollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
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
    return Objects.equals(distanceMeters, tripResponseTrips.distanceMeters) &&
        Objects.equals(driverId, tripResponseTrips.driverId) &&
        Objects.equals(endAddress, tripResponseTrips.endAddress) &&
        Objects.equals(endCoordinates, tripResponseTrips.endCoordinates) &&
        Objects.equals(endLocation, tripResponseTrips.endLocation) &&
        Objects.equals(endMs, tripResponseTrips.endMs) &&
        Objects.equals(endOdometer, tripResponseTrips.endOdometer) &&
        Objects.equals(fuelConsumedMl, tripResponseTrips.fuelConsumedMl) &&
        Objects.equals(startAddress, tripResponseTrips.startAddress) &&
        Objects.equals(startCoordinates, tripResponseTrips.startCoordinates) &&
        Objects.equals(startLocation, tripResponseTrips.startLocation) &&
        Objects.equals(startMs, tripResponseTrips.startMs) &&
        Objects.equals(startOdometer, tripResponseTrips.startOdometer) &&
        Objects.equals(tollMeters, tripResponseTrips.tollMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceMeters, driverId, endAddress, endCoordinates, endLocation, endMs, endOdometer, fuelConsumedMl, startAddress, startCoordinates, startLocation, startMs, startOdometer, tollMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripResponseTrips {\n");
    
    sb.append("    distanceMeters: ").append(toIndentedString(distanceMeters)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    endAddress: ").append(toIndentedString(endAddress)).append("\n");
    sb.append("    endCoordinates: ").append(toIndentedString(endCoordinates)).append("\n");
    sb.append("    endLocation: ").append(toIndentedString(endLocation)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    endOdometer: ").append(toIndentedString(endOdometer)).append("\n");
    sb.append("    fuelConsumedMl: ").append(toIndentedString(fuelConsumedMl)).append("\n");
    sb.append("    startAddress: ").append(toIndentedString(startAddress)).append("\n");
    sb.append("    startCoordinates: ").append(toIndentedString(startCoordinates)).append("\n");
    sb.append("    startLocation: ").append(toIndentedString(startLocation)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    startOdometer: ").append(toIndentedString(startOdometer)).append("\n");
    sb.append("    tollMeters: ").append(toIndentedString(tollMeters)).append("\n");
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

