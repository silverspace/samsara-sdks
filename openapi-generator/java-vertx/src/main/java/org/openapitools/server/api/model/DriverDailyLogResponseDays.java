package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class DriverDailyLogResponseDays   {
  
  private Long certifiedAtMs;
  private Integer endMs;
  private Integer startMs;
  private Object trailerIds = null;
  private Double activeHours;
  private Double distanceMiles;
  private Long activeMs;
  private Boolean certified;
  private Object vehicleIds = null;

  public DriverDailyLogResponseDays () {

  }

  public DriverDailyLogResponseDays (Long certifiedAtMs, Integer endMs, Integer startMs, Object trailerIds, Double activeHours, Double distanceMiles, Long activeMs, Boolean certified, Object vehicleIds) {
    this.certifiedAtMs = certifiedAtMs;
    this.endMs = endMs;
    this.startMs = startMs;
    this.trailerIds = trailerIds;
    this.activeHours = activeHours;
    this.distanceMiles = distanceMiles;
    this.activeMs = activeMs;
    this.certified = certified;
    this.vehicleIds = vehicleIds;
  }

    
  @JsonProperty("certifiedAtMs")
  public Long getCertifiedAtMs() {
    return certifiedAtMs;
  }
  public void setCertifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
  }

    
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

    
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

    
  @JsonProperty("trailerIds")
  public Object getTrailerIds() {
    return trailerIds;
  }
  public void setTrailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
  }

    
  @JsonProperty("activeHours")
  public Double getActiveHours() {
    return activeHours;
  }
  public void setActiveHours(Double activeHours) {
    this.activeHours = activeHours;
  }

    
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }
  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

    
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }
  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

    
  @JsonProperty("certified")
  public Boolean getCertified() {
    return certified;
  }
  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

    
  @JsonProperty("vehicleIds")
  public Object getVehicleIds() {
    return vehicleIds;
  }
  public void setVehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDailyLogResponseDays driverDailyLogResponseDays = (DriverDailyLogResponseDays) o;
    return Objects.equals(certifiedAtMs, driverDailyLogResponseDays.certifiedAtMs) &&
        Objects.equals(endMs, driverDailyLogResponseDays.endMs) &&
        Objects.equals(startMs, driverDailyLogResponseDays.startMs) &&
        Objects.equals(trailerIds, driverDailyLogResponseDays.trailerIds) &&
        Objects.equals(activeHours, driverDailyLogResponseDays.activeHours) &&
        Objects.equals(distanceMiles, driverDailyLogResponseDays.distanceMiles) &&
        Objects.equals(activeMs, driverDailyLogResponseDays.activeMs) &&
        Objects.equals(certified, driverDailyLogResponseDays.certified) &&
        Objects.equals(vehicleIds, driverDailyLogResponseDays.vehicleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certifiedAtMs, endMs, startMs, trailerIds, activeHours, distanceMiles, activeMs, certified, vehicleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDailyLogResponseDays {\n");
    
    sb.append("    certifiedAtMs: ").append(toIndentedString(certifiedAtMs)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    trailerIds: ").append(toIndentedString(trailerIds)).append("\n");
    sb.append("    activeHours: ").append(toIndentedString(activeHours)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    certified: ").append(toIndentedString(certified)).append("\n");
    sb.append("    vehicleIds: ").append(toIndentedString(vehicleIds)).append("\n");
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
