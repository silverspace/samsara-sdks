package apimodels;

import apimodels.VehicleHarshEventResponseLocation;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Harsh event details for a vehicle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class VehicleHarshEventResponse   {
  @JsonProperty("downloadForwardVideoUrl")
  private String downloadForwardVideoUrl;

  @JsonProperty("downloadInwardVideoUrl")
  private String downloadInwardVideoUrl;

  @JsonProperty("downloadTrackedInwardVideoUrl")
  private String downloadTrackedInwardVideoUrl;

  @JsonProperty("harshEventType")
  private String harshEventType;

  @JsonProperty("incidentReportUrl")
  private String incidentReportUrl;

  @JsonProperty("isDistracted")
  private Boolean isDistracted;

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
    public Boolean getIsDistracted() {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

