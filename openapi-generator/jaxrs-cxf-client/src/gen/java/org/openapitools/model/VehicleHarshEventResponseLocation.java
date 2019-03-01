package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehicleHarshEventResponseLocation  {
  
  @ApiModelProperty(example = "350 Rhode Island St, San Francisco, CA", value = "Address of location where the harsh event occurred")
 /**
   * Address of location where the harsh event occurred
  **/
  private String address;

  @ApiModelProperty(example = "33.07614328", value = "Latitude of location where the harsh event occurred")
 /**
   * Latitude of location where the harsh event occurred
  **/
  private String latitude;

  @ApiModelProperty(example = "-96.14907287", value = "Longitude of location where the harsh event occurred")
 /**
   * Longitude of location where the harsh event occurred
  **/
  private String longitude;
 /**
   * Address of location where the harsh event occurred
   * @return address
  **/
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public VehicleHarshEventResponseLocation address(String address) {
    this.address = address;
    return this;
  }

 /**
   * Latitude of location where the harsh event occurred
   * @return latitude
  **/
  @JsonProperty("latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public VehicleHarshEventResponseLocation latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude of location where the harsh event occurred
   * @return longitude
  **/
  @JsonProperty("longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public VehicleHarshEventResponseLocation longitude(String longitude) {
    this.longitude = longitude;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

