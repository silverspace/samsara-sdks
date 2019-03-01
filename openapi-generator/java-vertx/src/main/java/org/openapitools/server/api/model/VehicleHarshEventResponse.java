package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.VehicleHarshEventResponseLocation;

/**
 * Harsh event details for a vehicle
 **/
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class VehicleHarshEventResponse   {
  
  private String downloadForwardVideoUrl;
  private String downloadInwardVideoUrl;
  private String downloadTrackedInwardVideoUrl;
  private String harshEventType;
  private String incidentReportUrl;
  private Boolean isDistracted;
  private VehicleHarshEventResponseLocation location = null;

  public VehicleHarshEventResponse () {

  }

  public VehicleHarshEventResponse (String downloadForwardVideoUrl, String downloadInwardVideoUrl, String downloadTrackedInwardVideoUrl, String harshEventType, String incidentReportUrl, Boolean isDistracted, VehicleHarshEventResponseLocation location) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
    this.harshEventType = harshEventType;
    this.incidentReportUrl = incidentReportUrl;
    this.isDistracted = isDistracted;
    this.location = location;
  }

    
  @JsonProperty("downloadForwardVideoUrl")
  public String getDownloadForwardVideoUrl() {
    return downloadForwardVideoUrl;
  }
  public void setDownloadForwardVideoUrl(String downloadForwardVideoUrl) {
    this.downloadForwardVideoUrl = downloadForwardVideoUrl;
  }

    
  @JsonProperty("downloadInwardVideoUrl")
  public String getDownloadInwardVideoUrl() {
    return downloadInwardVideoUrl;
  }
  public void setDownloadInwardVideoUrl(String downloadInwardVideoUrl) {
    this.downloadInwardVideoUrl = downloadInwardVideoUrl;
  }

    
  @JsonProperty("downloadTrackedInwardVideoUrl")
  public String getDownloadTrackedInwardVideoUrl() {
    return downloadTrackedInwardVideoUrl;
  }
  public void setDownloadTrackedInwardVideoUrl(String downloadTrackedInwardVideoUrl) {
    this.downloadTrackedInwardVideoUrl = downloadTrackedInwardVideoUrl;
  }

    
  @JsonProperty("harshEventType")
  public String getHarshEventType() {
    return harshEventType;
  }
  public void setHarshEventType(String harshEventType) {
    this.harshEventType = harshEventType;
  }

    
  @JsonProperty("incidentReportUrl")
  public String getIncidentReportUrl() {
    return incidentReportUrl;
  }
  public void setIncidentReportUrl(String incidentReportUrl) {
    this.incidentReportUrl = incidentReportUrl;
  }

    
  @JsonProperty("isDistracted")
  public Boolean getIsDistracted() {
    return isDistracted;
  }
  public void setIsDistracted(Boolean isDistracted) {
    this.isDistracted = isDistracted;
  }

    
  @JsonProperty("location")
  public VehicleHarshEventResponseLocation getLocation() {
    return location;
  }
  public void setLocation(VehicleHarshEventResponseLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
