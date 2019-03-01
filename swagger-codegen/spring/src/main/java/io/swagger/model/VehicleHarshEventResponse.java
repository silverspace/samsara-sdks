package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VehicleHarshEventResponseLocation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Harsh event details for a vehicle
 */
@ApiModel(description = "Harsh event details for a vehicle")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class VehicleHarshEventResponse   {
  @JsonProperty("downloadForwardVideoUrl")
  private String downloadForwardVideoUrl = null;

  @JsonProperty("downloadInwardVideoUrl")
  private String downloadInwardVideoUrl = null;

  @JsonProperty("downloadTrackedInwardVideoUrl")
  private String downloadTrackedInwardVideoUrl = null;

  @JsonProperty("harshEventType")
  private String harshEventType = null;

  @JsonProperty("incidentReportUrl")
  private String incidentReportUrl = null;

  @JsonProperty("isDistracted")
  private Boolean isDistracted = null;

  @JsonProperty("location")
  private VehicleHarshEventResponseLocation location = null;

  public VehicleHarshEventResponse downloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
    return this;
  }

  /**
   * URL for downloading the forward facing video
   * @return downloadForwardVideoUrl
  **/
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-123456789.mp4?...", value = "URL for downloading the forward facing video")


  public String getDownloadForwardVideoUrl() {
    return downloadForwardVideoUrl;
  }

  public void setDownloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
  }

  public VehicleHarshEventResponse downloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
    return this;
  }

  /**
   * URL for downloading the inward facing video
   * @return downloadInwardVideoUrl
  **/
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.mp4?...", value = "URL for downloading the inward facing video")


  public String getDownloadInwardVideoUrl() {
    return downloadInwardVideoUrl;
  }

  public void setDownloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
  }

  public VehicleHarshEventResponse downloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
    return this;
  }

  /**
   * URL for downloading the tracked inward facing video
   * @return downloadTrackedInwardVideoUrl
  **/
  @ApiModelProperty(example = "https://samsara-dashcam-videos.s3.us-west-2.amazonaws.com/123/212123456789012/1539201872984/abC123De4-camera-video-segment-driver-123456789.tracked.mp4?...", value = "URL for downloading the tracked inward facing video")


  public String getDownloadTrackedInwardVideoUrl() {
    return downloadTrackedInwardVideoUrl;
  }

  public void setDownloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
  }

  public VehicleHarshEventResponse harshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
    return this;
  }

  /**
   * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
   * @return harshEventType
  **/
  @ApiModelProperty(example = "Harsh Braking", required = true, value = "Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]")
  @NotNull


  public String getHarshEventType() {
    return harshEventType;
  }

  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

  public VehicleHarshEventResponse incidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
    return this;
  }

  /**
   * URL of the associated incident report page
   * @return incidentReportUrl
  **/
  @ApiModelProperty(example = "https://cloud.samsara.com/groups/1234/fleet/reports/safety/vehicle/212123456789012/incident/1539201882984", required = true, value = "URL of the associated incident report page")
  @NotNull


  public String getIncidentReportUrl() {
    return incidentReportUrl;
  }

  public void setIncidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
  }

  public VehicleHarshEventResponse isDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
    return this;
  }

  /**
   * Whether the driver was deemed distracted during this harsh event
   * @return isDistracted
  **/
  @ApiModelProperty(example = "true", value = "Whether the driver was deemed distracted during this harsh event")


  public Boolean isIsDistracted() {
    return isDistracted;
  }

  public void setIsDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
  }

  public VehicleHarshEventResponse location(VehicleHarshEventResponseLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.downloadForwardVideoUrl, vehicleHarshEventResponse.downloadForwardVideoUrl) &&
        Objects.equals(this.downloadInwardVideoUrl, vehicleHarshEventResponse.downloadInwardVideoUrl) &&
        Objects.equals(this.downloadTrackedInwardVideoUrl, vehicleHarshEventResponse.downloadTrackedInwardVideoUrl) &&
        Objects.equals(this.harshEventType, vehicleHarshEventResponse.harshEventType) &&
        Objects.equals(this.incidentReportUrl, vehicleHarshEventResponse.incidentReportUrl) &&
        Objects.equals(this.isDistracted, vehicleHarshEventResponse.isDistracted) &&
        Objects.equals(this.location, vehicleHarshEventResponse.location);
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

