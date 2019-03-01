package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DriverDailyLogResponseDays   {
  
  private @Valid Double activeHours = null;
  private @Valid Long activeMs = null;
  private @Valid Boolean certified = null;
  private @Valid Long certifiedAtMs = null;
  private @Valid Double distanceMiles = null;
  private @Valid Integer endMs = null;
  private @Valid Integer startMs = null;
  private @Valid Object trailerIds = null;
  private @Valid Object vehicleIds = null;

  /**
   * Hours spent on duty or driving, rounded to two decimal places.
   **/
  public DriverDailyLogResponseDays activeHours(Double activeHours) {
    this.activeHours = activeHours;
    return this;
  }

  
  @ApiModelProperty(example = "5.4", value = "Hours spent on duty or driving, rounded to two decimal places.")
  @JsonProperty("activeHours")
  public Double getActiveHours() {
    return activeHours;
  }
  public void setActiveHours(Double activeHours) {
    this.activeHours = activeHours;
  }

  /**
   * Milliseconds spent on duty or driving.
   **/
  public DriverDailyLogResponseDays activeMs(Long activeMs) {
    this.activeMs = activeMs;
    return this;
  }

  
  @ApiModelProperty(example = "691200", value = "Milliseconds spent on duty or driving.")
  @JsonProperty("activeMs")
  public Long getActiveMs() {
    return activeMs;
  }
  public void setActiveMs(Long activeMs) {
    this.activeMs = activeMs;
  }

  /**
   * Whether this HOS day chart was certified by the driver.
   **/
  public DriverDailyLogResponseDays certified(Boolean certified) {
    this.certified = certified;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this HOS day chart was certified by the driver.")
  @JsonProperty("certified")
  public Boolean isCertified() {
    return certified;
  }
  public void setCertified(Boolean certified) {
    this.certified = certified;
  }

  /**
   * Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.
   **/
  public DriverDailyLogResponseDays certifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
    return this;
  }

  
  @ApiModelProperty(value = "Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.")
  @JsonProperty("certifiedAtMs")
  public Long getCertifiedAtMs() {
    return certifiedAtMs;
  }
  public void setCertifiedAtMs(Long certifiedAtMs) {
    this.certifiedAtMs = certifiedAtMs;
  }

  /**
   * Distance driven in miles, rounded to two decimal places.
   **/
  public DriverDailyLogResponseDays distanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
    return this;
  }

  
  @ApiModelProperty(example = "123.24", value = "Distance driven in miles, rounded to two decimal places.")
  @JsonProperty("distanceMiles")
  public Double getDistanceMiles() {
    return distanceMiles;
  }
  public void setDistanceMiles(Double distanceMiles) {
    this.distanceMiles = distanceMiles;
  }

  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   **/
  public DriverDailyLogResponseDays endMs(Integer endMs) {
    this.endMs = endMs;
    return this;
  }

  
  @ApiModelProperty(example = "1473836400000", value = "End of the HOS day, specified in milliseconds UNIX time.")
  @JsonProperty("endMs")
  public Integer getEndMs() {
    return endMs;
  }
  public void setEndMs(Integer endMs) {
    this.endMs = endMs;
  }

  /**
   * End of the HOS day, specified in milliseconds UNIX time.
   **/
  public DriverDailyLogResponseDays startMs(Integer startMs) {
    this.startMs = startMs;
    return this;
  }

  
  @ApiModelProperty(example = "1473750000000", value = "End of the HOS day, specified in milliseconds UNIX time.")
  @JsonProperty("startMs")
  public Integer getStartMs() {
    return startMs;
  }
  public void setStartMs(Integer startMs) {
    this.startMs = startMs;
  }

  /**
   * List of trailer ID&#39;s associated with the driver for the day.
   **/
  public DriverDailyLogResponseDays trailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
    return this;
  }

  
  @ApiModelProperty(example = "[10293,192933]", value = "List of trailer ID's associated with the driver for the day.")
  @JsonProperty("trailerIds")
  public Object getTrailerIds() {
    return trailerIds;
  }
  public void setTrailerIds(Object trailerIds) {
    this.trailerIds = trailerIds;
  }

  /**
   * List of vehicle ID&#39;s associated with the driver for the day.
   **/
  public DriverDailyLogResponseDays vehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
    return this;
  }

  
  @ApiModelProperty(example = "[192319,12958]", value = "List of vehicle ID's associated with the driver for the day.")
  @JsonProperty("vehicleIds")
  public Object getVehicleIds() {
    return vehicleIds;
  }
  public void setVehicleIds(Object vehicleIds) {
    this.vehicleIds = vehicleIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverDailyLogResponseDays driverDailyLogResponseDays = (DriverDailyLogResponseDays) o;
    return Objects.equals(activeHours, driverDailyLogResponseDays.activeHours) &&
        Objects.equals(activeMs, driverDailyLogResponseDays.activeMs) &&
        Objects.equals(certified, driverDailyLogResponseDays.certified) &&
        Objects.equals(certifiedAtMs, driverDailyLogResponseDays.certifiedAtMs) &&
        Objects.equals(distanceMiles, driverDailyLogResponseDays.distanceMiles) &&
        Objects.equals(endMs, driverDailyLogResponseDays.endMs) &&
        Objects.equals(startMs, driverDailyLogResponseDays.startMs) &&
        Objects.equals(trailerIds, driverDailyLogResponseDays.trailerIds) &&
        Objects.equals(vehicleIds, driverDailyLogResponseDays.vehicleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeHours, activeMs, certified, certifiedAtMs, distanceMiles, endMs, startMs, trailerIds, vehicleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverDailyLogResponseDays {\n");
    
    sb.append("    activeHours: ").append(toIndentedString(activeHours)).append("\n");
    sb.append("    activeMs: ").append(toIndentedString(activeMs)).append("\n");
    sb.append("    certified: ").append(toIndentedString(certified)).append("\n");
    sb.append("    certifiedAtMs: ").append(toIndentedString(certifiedAtMs)).append("\n");
    sb.append("    distanceMiles: ").append(toIndentedString(distanceMiles)).append("\n");
    sb.append("    endMs: ").append(toIndentedString(endMs)).append("\n");
    sb.append("    startMs: ").append(toIndentedString(startMs)).append("\n");
    sb.append("    trailerIds: ").append(toIndentedString(trailerIds)).append("\n");
    sb.append("    vehicleIds: ").append(toIndentedString(vehicleIds)).append("\n");
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

