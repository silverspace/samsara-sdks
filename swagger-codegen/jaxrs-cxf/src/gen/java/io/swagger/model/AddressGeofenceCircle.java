package io.swagger.model;

import io.swagger.annotations.ApiModel;
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

/**
  * Information about a circular geofence. This field is only populated if the geofence is a circle.
 **/
@ApiModel(description="Information about a circular geofence. This field is only populated if the geofence is a circle.")
public class AddressGeofenceCircle  {
  
  @ApiModelProperty(example = "37.765363", value = "The latitude of the center of the circular geofence")
 /**
   * The latitude of the center of the circular geofence
  **/
  private Double latitude = null;

  @ApiModelProperty(example = "-122.403098", value = "The longitude of the center of the circular geofence")
 /**
   * The longitude of the center of the circular geofence
  **/
  private Double longitude = null;

  @ApiModelProperty(example = "250", value = "The radius of the circular geofence")
 /**
   * The radius of the circular geofence
  **/
  private Long radiusMeters = null;
 /**
   * The latitude of the center of the circular geofence
   * @return latitude
  **/
  @JsonProperty("latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AddressGeofenceCircle latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * The longitude of the center of the circular geofence
   * @return longitude
  **/
  @JsonProperty("longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AddressGeofenceCircle longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * The radius of the circular geofence
   * @return radiusMeters
  **/
  @JsonProperty("radiusMeters")
  public Long getRadiusMeters() {
    return radiusMeters;
  }

  public void setRadiusMeters(Long radiusMeters) {
    this.radiusMeters = radiusMeters;
  }

  public AddressGeofenceCircle radiusMeters(Long radiusMeters) {
    this.radiusMeters = radiusMeters;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGeofenceCircle {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    radiusMeters: ").append(toIndentedString(radiusMeters)).append("\n");
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

