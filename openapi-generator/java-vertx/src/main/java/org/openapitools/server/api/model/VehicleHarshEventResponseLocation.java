package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleHarshEventResponseLocation   {
  
  private String address;
  private String latitude;
  private String longitude;

  public VehicleHarshEventResponseLocation () {

  }

  public VehicleHarshEventResponseLocation (String address, String latitude, String longitude) {
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
  }

    
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

    
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

    
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleHarshEventResponseLocation vehicleHarshEventResponseLocation = (VehicleHarshEventResponseLocation) o;
    return Objects.equals(address, vehicleHarshEventResponseLocation.address) &&
        Objects.equals(latitude, vehicleHarshEventResponseLocation.latitude) &&
        Objects.equals(longitude, vehicleHarshEventResponseLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleHarshEventResponseLocation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
