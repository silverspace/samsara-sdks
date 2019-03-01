package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.VehicleHarshEventResponseLocation;
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
  * Harsh event details for a vehicle
 **/
@ApiModel(description="Harsh event details for a vehicle")
public class VehicleHarshEventResponse  {
  
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...", value = "URL for downloading the forward facing video")
 /**
   * URL for downloading the forward facing video
  **/
  private String downloadForwardVideoUrl;

  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...", value = "URL for downloading the inward facing video")
 /**
   * URL for downloading the inward facing video
  **/
  private String downloadInwardVideoUrl;

  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...", value = "URL for downloading the tracked inward facing video")
 /**
   * URL for downloading the tracked inward facing video
  **/
  private String downloadTrackedInwardVideoUrl;

  @ApiModelProperty(example = "Harsh Braking", required = true, value = "Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]")
 /**
   * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
  **/
  private String harshEventType;

  @ApiModelProperty(example = "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984", required = true, value = "URL of the associated incident report page")
 /**
   * URL of the associated incident report page
  **/
  private String incidentReportUrl;

  @ApiModelProperty(example = "true", value = "Whether the driver was deemed distracted during this harsh event")
 /**
   * Whether the driver was deemed distracted during this harsh event
  **/
  private Boolean isDistracted;

  @ApiModelProperty(value = "")
  @Valid
  private VehicleHarshEventResponseLocation location = null;
 /**
   * URL for downloading the forward facing video
   * @return downloadForwardVideoUrl
  **/
  @JsonProperty("downloadForwardVideoUrl")
  public String getDownloadForwardVideoUrl() {
    return downloadForwardVideoUrl;
  }

  public void setDownloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
  }

  public VehicleHarshEventResponse downloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
    return this;
  }

 /**
   * URL for downloading the inward facing video
   * @return downloadInwardVideoUrl
  **/
  @JsonProperty("downloadInwardVideoUrl")
  public String getDownloadInwardVideoUrl() {
    return downloadInwardVideoUrl;
  }

  public void setDownloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
  }

  public VehicleHarshEventResponse downloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
    return this;
  }

 /**
   * URL for downloading the tracked inward facing video
   * @return downloadTrackedInwardVideoUrl
  **/
  @JsonProperty("downloadTrackedInwardVideoUrl")
  public String getDownloadTrackedInwardVideoUrl() {
    return downloadTrackedInwardVideoUrl;
  }

  public void setDownloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
  }

  public VehicleHarshEventResponse downloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
    return this;
  }

 /**
   * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
   * @return harshEventType
  **/
  @JsonProperty("harshEventType")
  @NotNull
  public String getHarshEventType() {
    return harshEventType;
  }

  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  public VehicleHarshEventResponse harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

 /**
   * URL of the associated incident report page
   * @return incidentReportUrl
  **/
  @JsonProperty("incidentReportUrl")
  @NotNull
  public String getIncidentReportUrl() {
    return incidentReportUrl;
  }

  public void setIncidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
  }

  public VehicleHarshEventResponse incidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
    return this;
  }

 /**
   * Whether the driver was deemed distracted during this harsh event
   * @return isDistracted
  **/
  @JsonProperty("isDistracted")
  public Boolean getIsDistracted() {
    return isDistracted;
  }

  public void setIsDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
  }

  public VehicleHarshEventResponse isDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public VehicleHarshEventResponseLocation getLocation() {
    return location;
  }

  public void setLocation(VehicleHarshEventResponseLocation location) {
    this.location = location;
  }

  public VehicleHarshEventResponse location(VehicleHarshEventResponseLocation location) {
    this.location = location;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleHarshEventResponse {\n");
    
    sb.append("    downloadForwardVideoUrl: ").append(toIndentedString(downloadForwardVideoUrl)).append("\n");
    sb.append("    downloadInwardVideoUrl: ").append(toIndentedString(downloadInwardVideoUrl)).append("\n");
    sb.append("    downloadTrackedInwardVideoUrl: ").append(toIndentedString(downloadTrackedInwardVideoUrl)).append("\n");
    sb.append("    harshEventType: ").append(toIndentedString(harshEventType)).append("\n");
    sb.append("    incidentReportUrl: ").append(toIndentedString(incidentReportUrl)).append("\n");
    sb.append("    isDistracted: ").append(toIndentedString(isDistracted)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

