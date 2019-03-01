package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.TripResponseEndCoordinates;
import org.openapitools.server.api.model.TripResponseStartCoordinates;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class TripResponseTrips   {
  
  private Integer endOdometer;
  private Integer distanceMeters;
  private Integer endMs;
  private Integer startMs;
  private Integer fuelConsumedMl;
  private String startAddress;
  private TripResponseStartCoordinates startCoordinates = null;
  private TripResponseEndCoordinates endCoordinates = null;
  private Integer startOdometer;
  private Integer driverId;
  private String startLocation;
  private Integer tollMeters;
  private String endAddress;
  private String endLocation;

  public TripResponseTrips () {

  }

  public TripResponseTrips (Integer endOdometer, Integer distanceMeters, Integer endMs, Integer startMs, Integer fuelConsumedMl, String startAddress, TripResponseStartCoordinates startCoordinates, TripResponseEndCoordinates endCoordinates, Integer startOdometer, Integer driverId, String startLocation, Integer tollMeters, String endAddress, String endLocation) {
    this.endOdometer = endOdometer;
    this.distanceMeters = distanceMeters;
    this.endMs = endMs;
    this.startMs = startMs;
    this.fuelConsumedMl = fuelConsumedMl;
    this.startAddress = startAddress;
    this.startCoordinates = startCoordinates;
    this.endCoordinates = endCoordinates;
    this.startOdometer = startOdometer;
    this.driverId = driverId;
    this.startLocation = startLocation;
    this.tollMeters = tollMeters;
    this.endAddress = endAddress;
    this.endLocation = endLocation;
  }

    
  @JsonProperty("endOdometer")
  public Integer getEndOdometer() {
    return endOdometer;
  }
  public void setEndOdometer(Integer endOdometer) {
    this.endOdometer = endOdometer;
  }

    
  @JsonProperty("distanceMeters")
  public Integer getDistanceMeters() {
    return distanceMeters;
  }
  public void setDistanceMeters(Integer distanceMeters) {
    this.distanceMeters = distanceMeters;
  }

    
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

    
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

    
  @JsonProperty("fuelConsumedMl")
  public Integer getFuelConsumedMl() {
    return fuelConsumedMl;
  }
  public void setFuelConsumedMl(Integer fuelConsumedMl) {
    this.fuelConsumedMl = fuelConsumedMl;
  }

    
  @JsonProperty("startAddress")
  public String getStartAddress() {
    return startAddress;
  }
  public void setStartAddress(String startAddress) {
    this.startAddress = startAddress;
  }

    
  @JsonProperty("startCoordinates")
  public TripResponseStartCoordinates getStartCoordinates() {
    return startCoordinates;
  }
  public void setStartCoordinates(TripResponseStartCoordinates startCoordinates) {
    this.startCoordinates = startCoordinates;
  }

    
  @JsonProperty("endCoordinates")
  public TripResponseEndCoordinates getEndCoordinates() {
    return endCoordinates;
  }
  public void setEndCoordinates(TripResponseEndCoordinates endCoordinates) {
    this.endCoordinates = endCoordinates;
  }

    
  @JsonProperty("startOdometer")
  public Integer getStartOdometer() {
    return startOdometer;
  }
  public void setStartOdometer(Integer startOdometer) {
    this.startOdometer = startOdometer;
  }

    
  @JsonProperty("driverId")
  public Integer getDriverId() {
    return driverId;
  }
  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("startLocation")
  public String getStartLocation() {
    return startLocation;
  }
  public void setStartLocation(String startLocation) {
    this.startLocation = startLocation;
  }

    
  @JsonProperty("tollMeters")
  public Integer getTollMeters() {
    return tollMeters;
  }
  public void setTollMeters(Integer tollMeters) {
    this.tollMeters = tollMeters;
  }

    
  @JsonProperty("endAddress")
  public String getEndAddress() {
    return endAddress;
  }
  public void setEndAddress(String endAddress) {
    this.endAddress = endAddress;
  }

    
  @JsonProperty("endLocation")
  public String getEndLocation() {
    return endLocation;
  }
  public void setEndLocation(String endLocation) {
    this.endLocation = endLocation;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
