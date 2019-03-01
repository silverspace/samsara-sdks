package io.swagger.model;

import io.swagger.model.TripResponseEndCoordinates;
import io.swagger.model.TripResponseStartCoordinates;
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

public class TripResponseTrips  {
  
  @ApiModelProperty(example = "2500", value = "Length of the trip in meters.")
 /**
   * Length of the trip in meters.
  **/
  private Integer distanceMeters = null;

  @ApiModelProperty(example = "719", value = "ID of the driver.")
 /**
   * ID of the driver.
  **/
  private Integer driverId = null;

  @ApiModelProperty(example = "Winchell's Donuts House", value = "Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.")
 /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
  **/
  private String endAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private TripResponseEndCoordinates endCoordinates = null;

  @ApiModelProperty(example = "571 S Lake Ave, Pasadena, CA 91101", value = "Geocoded street address of start (latitude, longitude) coordinates.")
 /**
   * Geocoded street address of start (latitude, longitude) coordinates.
  **/
  private String endLocation = null;

  @ApiModelProperty(example = "1462881998034", value = "End of the trip in UNIX milliseconds.")
 /**
   * End of the trip in UNIX milliseconds.
  **/
  private Integer endMs = null;

  @ApiModelProperty(example = "210430500", value = "Odometer reading at the end of the trip.")
 /**
   * Odometer reading at the end of the trip.
  **/
  private Integer endOdometer = null;

  @ApiModelProperty(example = "75700", value = "Amount in milliliters of fuel consumed on this trip.")
 /**
   * Amount in milliliters of fuel consumed on this trip.
  **/
  private Integer fuelConsumedMl = null;

  @ApiModelProperty(example = "Ramen Tatsunoya", value = "Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.")
 /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
  **/
  private String startAddress = null;

  @ApiModelProperty(value = "")
  @Valid
  private TripResponseStartCoordinates startCoordinates = null;

  @ApiModelProperty(example = "16 N Fair Oaks Ave, Pasadena, CA 91103", value = "Geocoded street address of start (latitude, longitude) coordinates.")
 /**
   * Geocoded street address of start (latitude, longitude) coordinates.
  **/
  private String startLocation = null;

  @ApiModelProperty(example = "1462878398034", value = "Beginning of the trip in UNIX milliseconds.")
 /**
   * Beginning of the trip in UNIX milliseconds.
  **/
  private Integer startMs = null;

  @ApiModelProperty(example = "210430450", value = "Odometer reading at the beginning of the trip.")
 /**
   * Odometer reading at the beginning of the trip.
  **/
  private Integer startOdometer = null;

  @ApiModelProperty(example = "32000", value = "Length in meters trip spent on toll roads.")
 /**
   * Length in meters trip spent on toll roads.
  **/
  private Integer tollMeters = null;
 /**
   * Length of the trip in meters.
   * @return distanceMeters
  **/
  @JsonProperty("distanceMeters")
  public Integer getDistanceMeters() {
    return distanceMeters;
  }

  public void setDistanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

  public TripResponseTrips distanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
    return this;
  }

 /**
   * ID of the driver.
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public TripResponseTrips driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.
   * @return endAddress
  **/
  @JsonProperty("endAddress")
  public String getEndAddress() {
    return endAddress;
  }

  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

  public TripResponseTrips endAddress(String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

 /**
   * Get endCoordinates
   * @return endCoordinates
  **/
  @JsonProperty("endCoordinates")
  public TripResponseEndCoordinates getEndCoordinates() {
    return endCoordinates;
  }

  public void setEndCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
  }

  public TripResponseTrips endCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
    return this;
  }

 /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return endLocation
  **/
  @JsonProperty("endLocation")
  public String getEndLocation() {
    return endLocation;
  }

  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }

  public TripResponseTrips endLocation(String endLocation) {
    this.endLocation = endLocation;
    return this;
  }

 /**
   * End of the trip in UNIX milliseconds.
   * @return endMs
  **/
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }

  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  public TripResponseTrips endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

 /**
   * Odometer reading at the end of the trip.
   * @return endOdometer
  **/
  @JsonProperty("endOdometer")
  public Integer getEndOdometer() {
    return endOdometer;
  }

  public void setEndOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
  }

  public TripResponseTrips endOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
    return this;
  }

 /**
   * Amount in milliliters of fuel consumed on this trip.
   * @return fuelConsumedMl
  **/
  @JsonProperty("fuelConsumedMl")
  public Integer getFuelConsumedMl() {
    return fuelConsumedMl;
  }

  public void setFuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
  }

  public TripResponseTrips fuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
    return this;
  }

 /**
   * Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.
   * @return startAddress
  **/
  @JsonProperty("startAddress")
  public String getStartAddress() {
    return startAddress;
  }

  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

  public TripResponseTrips startAddress(String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

 /**
   * Get startCoordinates
   * @return startCoordinates
  **/
  @JsonProperty("startCoordinates")
  public TripResponseStartCoordinates getStartCoordinates() {
    return startCoordinates;
  }

  public void setStartCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
  }

  public TripResponseTrips startCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
    return this;
  }

 /**
   * Geocoded street address of start (latitude, longitude) coordinates.
   * @return startLocation
  **/
  @JsonProperty("startLocation")
  public String getStartLocation() {
    return startLocation;
  }

  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }

  public TripResponseTrips startLocation(String startLocation) {
    this.startLocation = startLocation;
    return this;
  }

 /**
   * Beginning of the trip in UNIX milliseconds.
   * @return startMs
  **/
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }

  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  public TripResponseTrips startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

 /**
   * Odometer reading at the beginning of the trip.
   * @return startOdometer
  **/
  @JsonProperty("startOdometer")
  public Integer getStartOdometer() {
    return startOdometer;
  }

  public void setStartOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
  }

  public TripResponseTrips startOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
    return this;
  }

 /**
   * Length in meters trip spent on toll roads.
   * @return tollMeters
  **/
  @JsonProperty("tollMeters")
  public Integer getTollMeters() {
    return tollMeters;
  }

  public void setTollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
  }

  public TripResponseTrips tollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

