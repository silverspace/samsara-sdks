package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Contains the location, in latitude and longitude, of a vehicle.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleLocation   {
  @JsonProperty("heading")
  private Double heading;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("latitude")
  private Double latitude;

  @JsonProperty("location")
  private String location;

  @JsonProperty("longitude")
  private Double longitude;

  @JsonProperty("name")
  private String name;

  @JsonProperty("odometerMeters")
  private Long odometerMeters;

  @JsonProperty("onTrip")
  private Boolean onTrip;

  @JsonProperty("speed")
  private Double speed;

  @JsonProperty("time")
  private Integer time;

  @JsonProperty("vin")
  private String vin;

  public VehicleLocation heading(Double heading) {
    this.heading = heading;
    return this;
  }

   /**
   * Heading in degrees.
   * @return heading
  **/
    public Double getHeading() {
    return heading;
  }

  public void setHeading(Double heading) {
    this.heading = heading;
  }

  public VehicleLocation id(Long id) {
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

  public VehicleLocation latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude in decimal degrees.
   * @return latitude
  **/
    public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public VehicleLocation location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Text representation of nearest identifiable location to (latitude, longitude) coordinates.
   * @return location
  **/
    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VehicleLocation longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude in decimal degrees.
   * @return longitude
  **/
    public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public VehicleLocation name(String name) {
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

  public VehicleLocation odometerMeters(Long odometerMeters) {
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

  public VehicleLocation onTrip(Boolean onTrip) {
    this.onTrip = onTrip;
    return this;
  }

   /**
   * Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.
   * @return onTrip
  **/
    public Boolean getOnTrip() {
    return onTrip;
  }

  public void setOnTrip(Boolean onTrip) {
    this.onTrip = onTrip;
  }

  public VehicleLocation speed(Double speed) {
    this.speed = speed;
    return this;
  }

   /**
   * Speed in miles per hour.
   * @return speed
  **/
    public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }

  public VehicleLocation time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The time the reported location was logged, reported as a UNIX timestamp in milliseconds.
   * @return time
  **/
    public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public VehicleLocation vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Vehicle Identification Number (VIN) of the vehicle.
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

