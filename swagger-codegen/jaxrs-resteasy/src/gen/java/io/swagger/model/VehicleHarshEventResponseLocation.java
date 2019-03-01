package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public class VehicleHarshEventResponseLocation   {
  
  private String address = null;
  private String latitude = null;
  private String longitude = null;

  /**
   * Address of location where the harsh event occurred
   **/
  
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "Address of location where the harsh event occurred")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Latitude of location where the harsh event occurred
   **/
  
  @ApiModelProperty(example = "33.07614328", value = "Latitude of location where the harsh event occurred")
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of location where the harsh event occurred
   **/
  
  @ApiModelProperty(example = "-96.14907287", value = "Longitude of location where the harsh event occurred")
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

