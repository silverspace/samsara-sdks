package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TripResponseEndCoordinates;
import io.swagger.model.TripResponseStartCoordinates;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class TripResponseTrips   {
  
  private Integer distanceMeters = null;
  private Integer driverId = null;
  private String endAddress = null;
  private TripResponseEndCoordinates endCoordinates = null;
  private String endLocation = null;
  private Integer endMs = null;
  private Integer endOdometer = null;
  private Integer fuelConsumedMl = null;
  private String startAddress = null;
  private TripResponseStartCoordinates startCoordinates = null;
  private String startLocation = null;
  private Integer startMs = null;
  private Integer startOdometer = null;
  private Integer tollMeters = null;

  /**
   * Length of the trip in meters.
   **/
  
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

