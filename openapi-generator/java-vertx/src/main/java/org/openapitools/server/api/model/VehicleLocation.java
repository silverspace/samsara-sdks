package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the location, in latitude and longitude, of a vehicle.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleLocation   {
  
  private Double heading;
  private Long id;
  private Double latitude;
  private String location;
  private Double longitude;
  private String name;
  private Long odometerMeters;
  private Boolean onTrip;
  private Double speed;
  private Integer time;
  private String vin;

  public VehicleLocation () {

  }

  public VehicleLocation (Double heading, Long id, Double latitude, String location, Double longitude, String name, Long odometerMeters, Boolean onTrip, Double speed, Integer time, String vin) {
    this.heading = heading;
    this.id = id;
    this.latitude = latitude;
    this.location = location;
    this.longitude = longitude;
    this.name = name;
    this.odometerMeters = odometerMeters;
    this.onTrip = onTrip;
    this.speed = speed;
    this.time = time;
    this.vin = vin;
  }

    
  @JsonProperty("heading")
  public Double getHeading() {
    return heading;
  }
  public void setHeading(Double heading) {
    this.heading = heading;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

    
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("odometerMeters")
  public Long getOdometerMeters() {
    return odometerMeters;
  }
  public void setOdometerMeters(Long odometerMeters) {
    this.odometerMeters = odometerMeters;
  }

    
  @JsonProperty("onTrip")
  public Boolean getOnTrip() {
    return onTrip;
  }
  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

    
  @JsonProperty("speed")
  public Double getSpeed() {
    return speed;
  }
  public void setSpeed(Double speed) {
    this.speed = speed;
  }

    
  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
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
    VehicleLocation vehicleLocation = (VehicleLocation) o;
    return Objects.equals(heading, vehicleLocation.heading) &&
        Objects.equals(id, vehicleLocation.id) &&
        Objects.equals(latitude, vehicleLocation.latitude) &&
        Objects.equals(location, vehicleLocation.location) &&
        Objects.equals(longitude, vehicleLocation.longitude) &&
        Objects.equals(name, vehicleLocation.name) &&
        Objects.equals(odometerMeters, vehicleLocation.odometerMeters) &&
        Objects.equals(onTrip, vehicleLocation.onTrip) &&
        Objects.equals(speed, vehicleLocation.speed) &&
        Objects.equals(time, vehicleLocation.time) &&
        Objects.equals(vin, vehicleLocation.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heading, id, latitude, location, longitude, name, odometerMeters, onTrip, speed, time, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLocation {\n");
    
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    odometerMeters: ").append(toIndentedString(odometerMeters)).append("\n");
    sb.append("    onTrip: ").append(toIndentedString(onTrip)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
