package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VehicleHarshEventResponseLocation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Harsh event details for a vehicle
 **/
@ApiModel(description = "Harsh event details for a vehicle")
public class VehicleHarshEventResponse   {
  
  private @Valid String downloadForwardVideoUrl;
  private @Valid String downloadInwardVideoUrl;
  private @Valid String downloadTrackedInwardVideoUrl;
  private @Valid String harshEventType;
  private @Valid String incidentReportUrl;
  private @Valid Boolean isDistracted;
  private @Valid VehicleHarshEventResponseLocation location = null;

  /**
   * URL for downloading the forward facing video
   **/
  public VehicleHarshEventResponse downloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...", value = "URL for downloading the forward facing video")
  @JsonProperty("downloadForwardVideoUrl")
  public String getDownloadForwardVideoUrl() {
    return downloadForwardVideoUrl;
  }
  public void setDownloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
  }

  /**
   * URL for downloading the inward facing video
   **/
  public VehicleHarshEventResponse downloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...", value = "URL for downloading the inward facing video")
  @JsonProperty("downloadInwardVideoUrl")
  public String getDownloadInwardVideoUrl() {
    return downloadInwardVideoUrl;
  }
  public void setDownloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
  }

  /**
   * URL for downloading the tracked inward facing video
   **/
  public VehicleHarshEventResponse downloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...", value = "URL for downloading the tracked inward facing video")
  @JsonProperty("downloadTrackedInwardVideoUrl")
  public String getDownloadTrackedInwardVideoUrl() {
    return downloadTrackedInwardVideoUrl;
  }
  public void setDownloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
  }

  /**
   * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
   **/
  public VehicleHarshEventResponse harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

  
  @ApiModelProperty(example = "Harsh Braking", required = true, value = "Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]")
  @JsonProperty("harshEventType")
  @NotNull
  public String getHarshEventType() {
    return harshEventType;
  }
  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  /**
   * URL of the associated incident report page
   **/
  public VehicleHarshEventResponse incidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984", required = true, value = "URL of the associated incident report page")
  @JsonProperty("incidentReportUrl")
  @NotNull
  public String getIncidentReportUrl() {
    return incidentReportUrl;
  }
  public void setIncidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
  }

  /**
   * Whether the driver was deemed distracted during this harsh event
   **/
  public VehicleHarshEventResponse isDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Whether the driver was deemed distracted during this harsh event")
  @JsonProperty("isDistracted")
  public Boolean getIsDistracted() {
    return isDistracted;
  }
  public void setIsDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
  }

  /**
   **/
  public VehicleHarshEventResponse location(VehicleHarshEventResponseLocation location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("location")
  public VehicleHarshEventResponseLocation getLocation() {
    return location;
  }
  public void setLocation(VehicleHarshEventResponseLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleHarshEventResponse vehicleHarshEventResponse = (VehicleHarshEventResponse) o;
    return Objects.equals(downloadForwardVideoUrl, vehicleHarshEventResponse.downloadForwardVideoUrl) &&
        Objects.equals(downloadInwardVideoUrl, vehicleHarshEventResponse.downloadInwardVideoUrl) &&
        Objects.equals(downloadTrackedInwardVideoUrl, vehicleHarshEventResponse.downloadTrackedInwardVideoUrl) &&
        Objects.equals(harshEventType, vehicleHarshEventResponse.harshEventType) &&
        Objects.equals(incidentReportUrl, vehicleHarshEventResponse.incidentReportUrl) &&
        Objects.equals(isDistracted, vehicleHarshEventResponse.isDistracted) &&
        Objects.equals(location, vehicleHarshEventResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadForwardVideoUrl, downloadInwardVideoUrl, downloadTrackedInwardVideoUrl, harshEventType, incidentReportUrl, isDistracted, location);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

