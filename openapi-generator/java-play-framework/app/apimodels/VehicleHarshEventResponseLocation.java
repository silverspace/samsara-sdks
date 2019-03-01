package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * VehicleHarshEventResponseLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleHarshEventResponseLocation   {
  @JsonProperty("address")
  private String address;

  @JsonProperty("latitude")
  private String latitude;

  @JsonProperty("longitude")
  private String longitude;

  public VehicleHarshEventResponseLocation address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address of location where the harsh event occurred
   * @return address
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

