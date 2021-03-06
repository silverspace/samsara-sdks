package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VehicleHarshEventResponseLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class VehicleHarshEventResponseLocation   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  public VehicleHarshEventResponseLocation address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of location where the harsh event occurred
   * @return address
  **/
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "Address of location where the harsh event occurred")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public VehicleHarshEventResponseLocation latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude of location where the harsh event occurred
   * @return latitude
  **/
  @ApiModelProperty(example = "33.07614328", value = "Latitude of location where the harsh event occurred")


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public VehicleHarshEventResponseLocation longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Longitude of location where the harsh event occurred
   * @return longitude
  **/
  @ApiModelProperty(example = "-96.14907287", value = "Longitude of location where the harsh event occurred")


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
    return Objects.equals(this.address, vehicleHarshEventResponseLocation.address) &&
        Objects.equals(this.latitude, vehicleHarshEventResponseLocation.latitude) &&
        Objects.equals(this.longitude, vehicleHarshEventResponseLocation.longitude);
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

